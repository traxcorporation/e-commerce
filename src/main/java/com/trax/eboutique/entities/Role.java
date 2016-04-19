package com.trax.eboutique.entities;

import java.io.Serializable;

public class Role  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long idRole;
	private String roleName;
	
	public Long getIdRole() {
		return idRole;
	}
	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
}
