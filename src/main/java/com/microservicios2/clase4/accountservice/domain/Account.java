package com.microservicios2.clase4.accountservice.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name="ACCOUNTS")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Account implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id//Pk
	@Column(name="ACCOUNTID")
	Integer accountId;
	
	@Column(name="BALANCE")
	Double balance;
	
	@Column(name="CUSTOMERID")
	Integer customerId;
	
	@Column(name="ACCOUNTTYPE")
	String accountType;
	
	@Column(name="BRANCHCODE")
	String branchCode;
	
	@Column(name="BANK")
	String bank;
	
	
	
}
