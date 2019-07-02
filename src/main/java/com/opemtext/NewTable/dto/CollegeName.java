package com.opemtext.NewTable.dto;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bank_information")

public class CollegeName implements Serializable
{
	@Id
	@Column(name="account_no")
	private int account_no;
	@Column(name="Customer_name")
	private String Customer_name;
	@Column(name="Bank_name")
	private String Bank_name;
	@Column(name="pin_no")
	private int pin_no;
	@Column(name="Ifsc_code")
	private String Ifsc_code;
	public int getAccount_no() {
		return account_no;
	}
	public void setAccount_no(int account_no) {
		this.account_no = account_no;
	}
	public String getCustomer_name() {
		return Customer_name;
	}
	public void setCustomer_name(String customer_name) {
		Customer_name = customer_name;
	}
	public String getBank_name() {
		return Bank_name;
	}
	public void setBank_name(String bank_name) {
		Bank_name = bank_name;
	}
	public int getPin_no() {
		return pin_no;
	}
	public void setPin_no(int pin_no) {
		this.pin_no = pin_no;
	}
	public String getIfsc_code() {
		return Ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		Ifsc_code = ifsc_code;
	}

}
