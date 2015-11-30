package com.vinjdo;

import java.io.IOException;
import javax.jdo.Query;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;


import java.util.Collection;
import java.util.Date;
 

@SuppressWarnings("serial")
public class DeleteServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		String str=new String("30112015");
		PersistenceManager pm=PMF.get().getPersistenceManager();
	Customer res=(Customer)pm.getObjectById(Customer.class,str);
   pm.deletePersistent(res);
	}
	}