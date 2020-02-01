package com.tirmizee.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;


/**
 * The persistent class for the "ROLE" database table.
 * 
 */
@Data
@Entity
@Table(name="ROLE", schema = "C##ORGANIZATION")
@NamedQuery(name="Role.findAll", query="SELECT r FROM Role r")
public class Role {

	@Id
	@Column(name="ROLE_ID")
	private long roleId;

	@Temporal(TemporalType.DATE)
	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="ROLE_CODE")
	private String roleCode;

	@Column(name="ROLE_DESC")
	private String roleDesc;

	@Column(name="ROLE_NAME")
	private String roleName;

	@Column(name="UPDATE_BY")
	private String updateBy;

	@Temporal(TemporalType.DATE)
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	/*
	 * @OneToMany(mappedBy="role") private List<User> users;
	 */

}