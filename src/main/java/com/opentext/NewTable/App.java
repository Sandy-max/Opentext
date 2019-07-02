package com.opentext.NewTable;

/**
 * Hello world!
 *
 */

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.opemtext.NewTable.dto.CollegeName;


public class App {
	public static void main(String[] args) {
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(CollegeName.class);
		new SchemaExport(cfg).create(true,true);
	    CollegeName cn=new CollegeName();
	    cn.setAccount_no(100);
	    cn.setCustomer_name("ranjan");
	    cn.setBank_name("Axis");
	    cn.setPin_no(5003);
	    cn.setIfsc_code("123A4");
		
		System.out.println("tyuil");
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
		Transaction t =s.beginTransaction();
		s.save(cn);
		t.commit();
		
		 
		s.close();
		
	}

}





