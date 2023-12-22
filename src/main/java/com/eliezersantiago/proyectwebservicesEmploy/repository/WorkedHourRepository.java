/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eliezersantiago.proyectwebservicesEmploy.entity.Employee_Worked_Hours;

/**
 * @author MatebookD16
 *
 */
public interface WorkedHourRepository extends JpaRepository <Employee_Worked_Hours, Integer>{

}
