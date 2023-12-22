/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eliezersantiago.proyectwebservicesEmploy.entity.Genders;

/**
 * @author EliezerSA
 *
 */
@Repository
public interface GendersRepository extends CrudRepository<Genders, Integer>{
	Optional<Genders> findByGendersId(Integer id);
	
	//List<Genders> findByGendersId(Integer id);

}
