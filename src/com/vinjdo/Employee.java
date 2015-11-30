package com.vinjdo;
import javax.jdo.annotations.*;
import java.util.*;

@PersistenceCapable
public class Employee {
  @PrimaryKey
 private String key;
  @Persistent
  private String firstName;
  @Persistent
  private String lastName;
  @Persistent
  List<Details> list=new ArrayList<Details>();
  public void setFirstName(String firstName){
	  this.firstName=firstName;
  }
  public void setLastName(String lastName){
	  this.lastName=lastName;
  }
  public List<Details> getList(){
	  return list;
  }
  public void setKey(String key){
	  this.key=key;
  }
}
