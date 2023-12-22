/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eliezersantiago.proyectwebservicesEmploy.entity.Employee_Worked_Hours;
import com.eliezersantiago.proyectwebservicesEmploy.repository.WorkedHourRepository;
import com.eliezersantiago.proyectwebservicesEmploy.request.WorkedHourRequest;
import com.eliezersantiago.proyectwebservicesEmploy.response.WorkedHourResponse;

/**
 * @author Eliezer SA
 *
 */
@RestController
public class WorkedHoursController {

	//Segundo Contrato
	@Autowired
    private WorkedHourRepository workedHoursRepository;
	
	  @PostMapping("/worked-hours")
	    public ResponseEntity<WorkedHourResponse> addWorkedHours(@RequestBody WorkedHourRequest workedHoursRequest) {
	        // Crear un nuevo registro
		  Employee_Worked_Hours workedHours = new Employee_Worked_Hours();
	        workedHours.setId(workedHoursRequest.getEmployeeId());
	        workedHours.setWorked_hours(workedHoursRequest.getWorkedHours());
	        workedHours.setWorked_date(workedHoursRequest.getWorkedDate());

	        // Guardar en base de datos
	        workedHoursRepository.save(workedHours);

	        // Retornar respuesta
	        return ResponseEntity.ok(new WorkedHourResponse(workedHours.getId(), true));
	    }
}
