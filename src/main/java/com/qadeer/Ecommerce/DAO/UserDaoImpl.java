package com.qadeer.Ecommerce.DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qadeer.Ecommerce.model.Users;
@Component
public class UserDaoImpl 
{
	@Autowired
	SessionFactory sf;
	public void testSessionFactory()
	{
		System.out.println("......."+sf);
	}
	public void insertUser(Users u)
	{
		Session s=sf.openSession();
		s.save(u);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("User added successfully");
		s.close();
	}
}
