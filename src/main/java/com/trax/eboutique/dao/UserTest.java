package com.trax.eboutique.dao;
/**
 * @author ytraore
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Entity;

/**
 * 
 * @author ytraore
 *
 */
@Entity  
@Table 
public class UserTest implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	  @Id  
	  @GeneratedValue
	private int userID;
	private String userName;
	private String userMessage;

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMessage() {
		return userMessage;
	}

	public void setUserMessage(String userMessage) {
		this.userMessage = userMessage;
	}

}
