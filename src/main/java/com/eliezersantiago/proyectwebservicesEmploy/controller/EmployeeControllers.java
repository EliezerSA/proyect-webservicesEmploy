/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eliezersantiago.proyectwebservicesEmploy.entity.Employee;
import com.eliezersantiago.proyectwebservicesEmploy.repository.EmployeeRepository;
import com.eliezersantiago.proyectwebservicesEmploy.repository.GendersRepository;
import com.eliezersantiago.proyectwebservicesEmploy.repository.JobsRepository;
import com.eliezersantiago.proyectwebservicesEmploy.response.EmployeeResponse;

/**
 * @author MatebookD16
 *
 */
//Tercer contrato de interfaz
@RestController
public class EmployeeControllers {

	@Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private JobsRepository jobRepository;

    @Autowired
    private GendersRepository genderRepository;

    @GetMapping("/employees")
    public ResponseEntity<EmployeeResponse> getEmployeesByJobId(@RequestParam Integer job_id) {
        // Get employees from database
        List<Employee> employees = employeeRepository.findByJobId(job_id);

        // Crear respuesta
        List<EmployeeResponse> employeeResponses = new ArrayList<>();
        for (Employee employee : employees) {
            EmployeeResponse employeeResponse = new EmployeeResponse();
            employeeResponse.setId(employee.getId());
            employeeResponse.setName(employee.getName());
            employeeResponse.setLastName(employee.getLastName());
            employeeResponse.setBirthdate(employee.getBirthdate());
            Job job = jobRepository.findById(employee.getJobId()).orElse(null);
            if (job != null) {
                JobResponse jobResponse = new JobResponse();
                jobResponse.setId(job.getId());
                jobResponse.setName(job.getName());
                jobResponse.setSalary(job.getSalary());
                employeeResponse.setJob(jobResponse);
            }
            Gender gender = genderRepository.findById(employee.getGenderId()).orElse(null);
            if (gender != null) {
                GenderResponse genderResponse = new GenderResponse();
                genderResponse.setId(gender.getId());
                genderResponse.setName(gender.getName());
                employeeResponse.setGender(genderResponse);
            }
            employeeResponses.add(employeeResponse);
        }

        EmployeeListResponse employeeListResponse = new EmployeeListResponse();
        employeeListResponse.setEmployees(employeeResponses);
        employeeListResponse.setSuccess(true);

        // Retornar respuesta
        return ResponseEntity.ok(employeeListResponse);
    }
}

}
