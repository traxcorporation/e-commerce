package com.trax.eboutique.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetailsHibernate {

	@Id
	private int userId;
	private String userName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		userId = this.userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		userName = this.userName;
	}

}
