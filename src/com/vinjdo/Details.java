package com.vinjdo;
import javax.jdo.annotations.*;
import java.util.Date;
import com.google.appengine.api.datastore.*;
import com.google.appengine.api.datastore.Key;
@PersistenceCapable
public class Details {
	@PrimaryKey
	@Persistent(valueStrategy=IdGeneratorStrategy.IDENTITY)
	private Key key;
  @Persistent
  private int experience;
  @Persistent
  private Date dateOfJoin;
 
  public void setExperience(int experience){
	  this.experience=experience;
  }
  public void setDate(Date date){
	  this.dateOfJoin=date;
  }
  
}
