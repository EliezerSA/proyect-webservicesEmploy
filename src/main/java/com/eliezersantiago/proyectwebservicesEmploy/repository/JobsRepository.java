/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.eliezersantiago.proyectwebservicesEmploy.entity.Jobs;

/**
 * @author MatebookD16
 *
 */
public interface JobsRepository extends CrudRepository<Jobs, Integer>{

}
