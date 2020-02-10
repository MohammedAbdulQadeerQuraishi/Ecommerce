package com.qadeer.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qadeer.Ecommerce.DAO.UserDaoImpl;
import com.qadeer.Ecommerce.model.Users;

@Controller
public class HomeController 
{
	@Autowired
	UserDaoImpl udi;
	public HomeController()
	{
		System.out.println("Home Controller is loading");
	}
	@RequestMapping("/Home")
	public ModelAndView test()
	{
		System.out.println("at Home request");
		ModelAndView mv=new ModelAndView("Home");
		return mv;
	}
	@RequestMapping("/reg")
	public ModelAndView register()
	{
		System.out.println("at Register request");
		ModelAndView mv=new ModelAndView("reg");
		Users u=new Users();
		mv.addObject("usr",u);
		return mv;
	}
	
	@RequestMapping(value="/carryuser",method=RequestMethod.POST)
	public String readProductForm(@ModelAttribute("usr")Users u)
	{
		//dbConn db=new dbConn();
		//db.Connect(u.getUserName(),u.getPassword(),u.getEmail(),u.getMobileNumber());
		udi.insertUser(u);
		return "Home";
	}
	
	
}
