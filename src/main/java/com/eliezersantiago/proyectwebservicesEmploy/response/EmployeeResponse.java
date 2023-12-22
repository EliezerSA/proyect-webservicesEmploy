package com.eliezersantiago.proyectwebservicesEmploy.response;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

	private Integer id;
    private Boolean success;
    private String name;
    private String lastName;
    private LocalDate birthdate;
    private JobsResponse job;
    private GenderResponse gender;
    
    public EmployeeResponse(Integer id, Boolean success) {
        this.id = id;
        this.success = success;
    }
}
