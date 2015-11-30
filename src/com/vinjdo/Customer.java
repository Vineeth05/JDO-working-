package com.vinjdo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.Element;

@PersistenceCapable(identityType = IdentityType.APPLICATION, detachable="true")
public class Customer extends ModelBase {

    @Persistent
    private String name;
    @Persistent
    private String contactName;
    @Persistent
    private String comments;

    @Persistent(mappedBy = "customer")
    @Element(dependent = "true")
    private List<Address> adresses = new ArrayList<Address>();

    @Persistent(mappedBy = "customer")
    @Element(dependent = "true")
    private List<Integer> phones = new ArrayList<Integer>();
  
    
    public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContactName() {
		return contactName;
	}


	public void setContactName(String contactName) {
		this.contactName = contactName;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public List<Address> getAdresses() {
		return adresses;
	}


	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}


	public List<Integer> getPhones() {
		return phones;
	}


	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}
   
	public void setKey(String date){
		this.date=date;
	}

	private static final long serialVersionUID = 3039288063578312662L;

    // getters &amp; setters go here
}

