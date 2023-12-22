/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * @author EliezerSA
 * Webservice de modelo con Jersey
 *
 */
@Path("empleadosWS")
public class EmployeesWS {
	
	@Path("test")
	@GET
	public String test() {
		return "Probando webservice con Jersey";
	}

}
