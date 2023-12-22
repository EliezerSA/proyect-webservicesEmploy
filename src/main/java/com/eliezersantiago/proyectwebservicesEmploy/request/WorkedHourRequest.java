/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.request;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author MatebookD16
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkedHourRequest {

	private Integer employeeId;
    private Integer workedHours;
    private LocalDateTime workedDate;
	/**
	 * @return the employeeId
	 */
	public Integer getEmployeeId() {
		return employeeId;
	}
	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	/**
	 * @return the workedHours
	 */
	public Integer getWorkedHours() {
		return workedHours;
	}
	/**
	 * @param workedHours the workedHours to set
	 */
	public void setWorkedHours(Integer workedHours) {
		this.workedHours = workedHours;
	}
	/**
	 * @return the workedDate
	 */
	public LocalDateTime getWorkedDate() {
		return workedDate;
	}
	/**
	 * @param workedDate the workedDate to set
	 */
	public void setWorkedDate(LocalDateTime workedDate) {
		this.workedDate = workedDate;
	}
    
    
}
