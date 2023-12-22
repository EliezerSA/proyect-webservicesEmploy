/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

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
 * @author Eliezer SA
 *
 */
@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name  = "id")
	private int id;
	
	@Column(name = "name", length = 255, nullable = false)
	private String name; 
	
	@Column(name = "lastname", length = 255, nullable = false)
	private String lastname;
	
	@Column(name = "birthdate", nullable = false)
	private LocalDateTime birthdate;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "genders_id")
	private Genders gender;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "job_id")
	private Jobs job;

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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the birthdate
	 */
	public LocalDateTime getBirthdate() {
		return birthdate;
	}

	/**
	 * @param birthdate2 the birthdate to set
	 */
	public void setBirthdate(LocalDateTime birthdate2) {
		this.birthdate = birthdate2;
	}

	/**
	 * @return the gender
	 */
	public Genders getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(Genders gender) {
		this.gender = gender;
	}

	/**
	 * @return the job
	 */
	public Jobs getJob() {
		return job;
	}

	/**
	 * @param job the job to set
	 */
	public void setJob(Jobs job) {
		this.job = job;
	}
	
	
}
