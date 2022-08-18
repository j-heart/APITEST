package com.example.demo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "sso_user_test1", schema = "woohoo")
public class APIdbEntity {
	
	@Id
	@Column(name = "request_date")
	private Timestamp request_date;
	
	@Column(name = "sso_type")
	private String ssoType;
	
	@Column(name = "system_id")
	private String systemId;
	
	@Column(name = "system_name")
	private String systemName;
	
	@Column(name = "system_transactions")
	private String systemTransactions;
	
	@Column(name = "system_privileges")
	private String systemPrivileges;
	
	@Column(name = "system_user_group")
	private String systemUserGroup;
	
	@Column(name = "system_location_group")
	private String systemLocationGroup;
	
	@Column(name = "user_id")
	private String userId;
	
	@Column(name = "user_full_name")
	private String userFullName;
	
	@Column(name = "user_rd_office_code")
	private String userRdOfficeCode;
	
	@Column(name = "user_office_code")
	private String userOfficeCode;
	
	@Column(name = "client_location")
	private String clientLocation;
	
	@Column(name = "location_machine_number")
	private String locationMachineNumber;
	
	@Column(name = "token_id")
	private String tokenId;
	

	public Timestamp getRequest_date() {
		return request_date;
	}
	

	public void setRequest_date(Timestamp request_date) {
		this.request_date = request_date;
	}
	
	public String getSsoType() {
		return ssoType;
	}
	public void setSsoType(String ssoType) {
		this.ssoType = ssoType;
	}
	public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getSystemName() {
		return systemName;
	}
	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}
	

	public String getSystemTransactions() {
		return systemTransactions;
	}
	public void setSystemTransactions(String systemTransactions) {
		this.systemTransactions = systemTransactions;
	}
	public String getSystemPrivileges() {
		return systemPrivileges;
	}
	public void setSystemPrivileges(String systemPrivileges) {
		this.systemPrivileges = systemPrivileges;
	}
	public String getSystemUserGroup() {
		return systemUserGroup;
	}
	public void setSystemUserGroup(String systemUserGroup) {
		this.systemUserGroup = systemUserGroup;
	}
	public String getSystemLocationGroup() {
		return systemLocationGroup;
	}
	public void setSystemLocationGroup(String systemLocationGroup) {
		this.systemLocationGroup = systemLocationGroup;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserRdOfficeCode() {
		return userRdOfficeCode;
	}
	public void setUserRdOfficeCode(String userRdOfficeCode) {
		this.userRdOfficeCode = userRdOfficeCode;
	}
	public String getUserOfficeCode() {
		return userOfficeCode;
	}
	public void setUserOfficeCode(String userOfficeCode) {
		this.userOfficeCode = userOfficeCode;
	}
	public String getClientLocation() {
		return clientLocation;
	}
	public void setClientLocation(String clientLocation) {
		this.clientLocation = clientLocation;
	}
	public String getLocationMachineNumber() {
		return locationMachineNumber;
	}
	public void setLocationMachineNumber(String locationMachineNumber) {
		this.locationMachineNumber = locationMachineNumber;
	}
	public String getTokenId() {
		return tokenId;
	}
	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	
	
}
