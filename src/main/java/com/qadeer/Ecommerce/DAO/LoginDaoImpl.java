package com.qadeer.Ecommerce.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qadeer.Ecommerce.model.Users;

@Component
public class LoginDaoImpl 
{
	@Autowired
	SessionFactory sf;
	public Users LoginCheck(Users u)
	{
		Session s=sf.openSession();
     	Query q=s.createQuery("from Users where UserName=:un and password=:pwd");
     	q.setParameter("un",u.getUserName());
     	q.setParameter("pwd",u.getPassword());
     	Object obj=q.uniqueResult();
     	Users u2=(Users) obj;
     	if(u2!=null)
     	{
     		return u2;
     	}
     	else
     	{
     		return null;
     	}
    }
}
