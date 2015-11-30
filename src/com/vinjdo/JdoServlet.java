package com.vinjdo;

import java.io.IOException;

import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import java.util.Date;
 

@SuppressWarnings("serial")
public class JdoServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		  Customer cs=new Customer();
		  PersistenceManager pm=PMF.get().getPersistenceManager();
               cs.setComments("nothing");		  
               cs.setContactName("weey wicked");
               cs.setName("vineeth purush");
               cs.setKey("30112015");
               Address ad=new Address();
               ad.setCity("chennai");
               ad.setLine1("chennai is flooding now");
               ad.setLine2("usually it is used to be hot");
               cs.getAdresses().add(ad);
		           		          try{
		        	  pm.makePersistent(cs);
		          }
		          finally{
		        	  pm.close();
		          }
		           				 
	}
}
