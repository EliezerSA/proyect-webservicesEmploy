/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author EliezerSA
 *
 */
@Entity
@Table(name = "employee_worked_hours")
public class Employee_Worked_Hours {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "id")
	private int id;
	
	@Column(name = "worked_hours", nullable = false)
	private int worked_hours;
	
	@Column(name = "worked_date", nullable = false)
	private LocalDateTime worked_date;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "employee_id")
	private Employee employee;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the worked_hours
	 */
	public int getWorked_hours() {
		return worked_hours;
	}

	/**
	 * @param worked_hours the worked_hours to set
	 */
	public void setWorked_hours(int worked_hours) {
		this.worked_hours = worked_hours;
	}

	/**
	 * @return the worked_date
	 */
	public LocalDateTime getWorked_date() {
		return worked_date;
	}

	/**
	 * @param worked_date the worked_date to set
	 */
	public void setWorked_date(LocalDateTime worked_date) {
		this.worked_date = worked_date;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
}
