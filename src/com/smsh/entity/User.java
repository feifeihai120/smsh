package com.smsh.entity;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name="User")
public class User {
	private String ID;
	private String NAME;
	
	@Id
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	
}
