/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eliezersantiago.proyectwebservicesEmploy.entity.Employee;
import com.eliezersantiago.proyectwebservicesEmploy.entity.Genders;
import com.eliezersantiago.proyectwebservicesEmploy.entity.Jobs;
import com.eliezersantiago.proyectwebservicesEmploy.repository.EmployeeRepository;
import com.eliezersantiago.proyectwebservicesEmploy.repository.GendersRepository;
import com.eliezersantiago.proyectwebservicesEmploy.repository.JobsRepository;
import com.eliezersantiago.proyectwebservicesEmploy.request.EmployeeRequest;
import com.eliezersantiago.proyectwebservicesEmploy.response.EmployeeResponse;

/**
 * @author EliezerSA
 *
 */
@RestController
public class EmployeeController {

	//Primer Contrato
	    @Autowired
	    private EmployeeRepository employeeRepository;

	    @PostMapping("/employees")
	    public ResponseEntity<EmployeeResponse> addEmployee(@RequestBody EmployeeRequest employeeRequest) {
	        // Validaciones
	        if (employeeRepository.existsByNameAndLastName(employeeRequest.getName(), employeeRequest.getLastname())) {
	            return ResponseEntity.badRequest().body(new EmployeeResponse(null, false));
	        }

	        LocalDate birthdate = LocalDate.parse(employeeRequest.getBirthdate());
	        if (Period.between(birthdate, LocalDate.now()).getYears() < 18) {
	            return ResponseEntity.badRequest().body(new EmployeeResponse(null, false));
	        }

	        if (!employeeRepository.existsById(employeeRequest.getGenderId()) || !employeeRepository.existsById(employeeRequest.getJobId())) {
	            return ResponseEntity.badRequest().body(new EmployeeResponse(null, false));
	        }

	        Genders gender = GendersRepository.findByGendersId(employeeRequest.getGenderId()).orElse(null)
	        //Genders gender = GenderRepository.findById(employeeRequest.getGenderId()).orElse(null);
	        //Jobs job = new Jobs();
	        
	        // Crear nuevo empleado
	        Employee employee = new Employee();
	        employee.setName(employeeRequest.getName());
	        employee.setLastname(employeeRequest.getLastname());
	        LocalDateTime birthdateTime = birthdate.atStartOfDay();
	        employee.setBirthdate(birthdateTime);
	        employee.setGender(employeeRequest.getGenderId());
	        employee.setJobId(employeeRequest.getJobId());

	        // Guardar empleado
	        employeeRepository.save(employee);

	        // Retornar una respuesta
	        return ResponseEntity.ok(new EmployeeResponse(employee.getId(), true));

}
