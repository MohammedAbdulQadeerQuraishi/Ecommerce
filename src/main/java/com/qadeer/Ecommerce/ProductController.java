package com.qadeer.Ecommerce;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qadeer.Ecommerce.DAO.ProductDaoImpl;
import com.qadeer.Ecommerce.model.Product;
@Controller
public class ProductController 
{
	@Autowired
	ProductDaoImpl pdi;
	public ProductController() 
	{
	System.out.println("Product Controller is loading");
	}
	@RequestMapping("/showproducts")
	public ModelAndView showProducts()
	{
		System.out.println("at showproducts request");
		Product p=new Product();
		List l=pdi.displayProduct(p);
		ModelAndView mv=new ModelAndView("showproducts");
		mv.addObject("proList",l);
		return mv;
	}
	@RequestMapping("/addproduct")
	public ModelAndView addProduct()
	{
		System.out.println("at addproduct request");
		ModelAndView mv=new ModelAndView("addproduct");
		Product p=new Product();
		mv.addObject("proList",p);
		return mv;
	}
	@RequestMapping(value="/carryproduct",method=RequestMethod.POST)
	public String readProductForm(@ModelAttribute("proList")Product p)
	{
		pdi.insertProduct(p);
		return "Home";
	}
}
