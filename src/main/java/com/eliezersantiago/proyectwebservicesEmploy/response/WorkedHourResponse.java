/**
 * 
 */
package com.eliezersantiago.proyectwebservicesEmploy.response;

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
public class WorkedHourResponse {

	private Integer id;
    private Boolean success;
    
    public WorkedHourResponse(Integer id, Boolean success) {
        this.id = id;
        this.success = success;
    }
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}
	/**
	 * @param success the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
    
    
}
