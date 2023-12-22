/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezersantiago.proyectwebservicesEmploy.entity.Employee;

/**
 * @author EliezerSA
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	boolean existsByNameAndLastName(String name, String lastname);
	
	List<Employee> findByJobId(Integer jobId);

}
