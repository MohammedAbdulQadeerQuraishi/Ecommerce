package com.qadeer.Ecommerce.DAO;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.qadeer.Ecommerce.model.Product;

@Component
public class ProductDaoImpl 
{
	@Autowired
	SessionFactory sf;
	public void insertProduct(Product p)
	{
		Session s=sf.openSession();
		s.save(p);
		Transaction t=s.beginTransaction();
		t.commit();
		System.out.println("Product added successfully");
		s.close();
	}
	public List displayProduct(Product p)
	{
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
        Query q=s.createQuery("from Product");
        List l=q.list();
        for(Object obj:l)
        {
        	Product product=(Product) obj;
        }
        s.close();
        return l;
	}
}
