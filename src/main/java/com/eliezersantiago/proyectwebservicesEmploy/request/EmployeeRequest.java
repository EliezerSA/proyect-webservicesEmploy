/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author EliezerSA
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
	
	    private Integer genderId;
	    private Integer jobId;
	    private String name;
	    private String lastname;
	    private String birthdate;
		/**
		 * @return the genderId
		 */
		public Integer getGenderId() {
			return genderId;
		}
		/**
		 * @param genderId the genderId to set
		 */
		public void setGenderId(Integer genderId) {
			this.genderId = genderId;
		}
		/**
		 * @return the jobId
		 */
		public Integer getJobId() {
			return jobId;
		}
		/**
		 * @param jobId the jobId to set
		 */
		public void setJobId(Integer jobId) {
			this.jobId = jobId;
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
		public String getBirthdate() {
			return birthdate;
		}
		/**
		 * @param birthdate the birthdate to set
		 */
		public void setBirthdate(String birthdate) {
			this.birthdate = birthdate;
		}

	    
}
