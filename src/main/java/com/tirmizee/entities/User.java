package com.tirmizee.entities;

import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

/**
 * The persistent class for the USERS database table.
 * 
 */

@Data
@Entity
@Table(name="USERS", schema = "C##ORGANIZATION")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User {

	@Id
	@Column(name="USER_ID")
	private long userId;

	@Column(name="ACCOUNT_EXPIRED_DATE")
	private Date accountExpiredDate;

	@Column(name="ACCOUNT_LOCKED_DATE")
	private Timestamp accountLockedDate;

	@Column(name="ACCOUNT_NON_EXPIRED")
	private BigDecimal accountNonExpired;

	@Column(name="ACCOUNT_NON_LOCKED")
	private BigDecimal accountNonLocked;

	@Column(name="CREATE_DATE")
	private Date createDate;

	@Column(name="CREDENTIALS_EXPIRED_DATE")
	private Date credentialsExpiredDate;

	@Column(name="CREDENTIALS_NON_EXPIRED")
	private BigDecimal credentialsNonExpired;

	private BigDecimal enabled;

	@Column(name="FIRST_LOGIN")
	private BigDecimal firstLogin;

	@Column(name="FK_ROLE_ID")
	private BigDecimal fkRoleId;

	@Column(name="MAX_SESSION")
	private BigDecimal maxSession;

	private String password;

	@Column(name="PROFILE_ID")
	private BigDecimal profileId;

	@Column(name="UPDATE_DATE")
	private Date updateDate;

	private String username;
	
	/*
	 * @ManyToOne(fetch=FetchType.LAZY)
	 * 
	 * @JoinColumn(name="FK_ROLE_ID", insertable = false, updatable = false) private
	 * Role role;
	 */
	
	/*
	 * @ManyToMany(fetch = FetchType.EAGER)
	 * 
	 * @JoinTable(name = "ROLE_MAP_PERMISSION", joinColumns = { @JoinColumn(name =
	 * "ROLE_ID") }, inverseJoinColumns = { @JoinColumn(name = "PER_ID") }) private
	 * Set<Permission> permissions = new HashSet<Permission>();
	 */

}