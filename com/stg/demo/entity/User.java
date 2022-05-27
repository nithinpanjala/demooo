package com.stg.demo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author: Panjala Nithin Kumar
 */

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(generator = "userId")
	@Column(name = "userId", updatable = false, nullable = false)
	private long userId;
	@Column(name = "userName", updatable = false, nullable = false)
	private String userName;
	@Column(name = "userPassword", updatable = false, nullable = false)
	private String userPassword;
	@Column(name = "userfirstName", nullable = false)
	private String userfirstName;
	@Column(name = "userlastName", nullable = false)
	private String userlastName;
	@Column(name = "usermobile", nullable = false)
	private String usermobile;
	@Column(name = "userEmail", nullable = false)
	private String userEmail;

	@OneToMany(mappedBy = "user")
	private Set<Address> addresses;

	public User() {
		super();
	}

	public User(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail, Set<Address> addresses) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userfirstName = userfirstName;
		this.userlastName = userlastName;
		this.usermobile = usermobile;
		this.userEmail = userEmail;
		this.addresses = addresses;
	}

	public User(long userId, String userName, String userPassword, String userfirstName, String userlastName,
			String usermobile, String userEmail) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPassword = userPassword;
		this.userfirstName = userfirstName;
		this.userlastName = userlastName;
		this.usermobile = usermobile;
		this.userEmail = userEmail;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserfirstName() {
		return userfirstName;
	}

	public void setUserfirstName(String userfirstName) {
		this.userfirstName = userfirstName;
	}

	public String getUserlastName() {
		return userlastName;
	}

	public void setUserlastName(String userlastName) {
		this.userlastName = userlastName;
	}

	public String getUsermobile() {
		return usermobile;
	}

	public void setUsermobile(String usermobile) {
		this.usermobile = usermobile;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public Set<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

}
