package com.qadeer.Ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.qadeer.Ecommerce.DAO.LoginDaoImpl;
import com.qadeer.Ecommerce.model.Product;
import com.qadeer.Ecommerce.model.Users;

public class LoginController
{
	public ModelAndView LoginController()
	{
		ModelAndView mv = new ModelAndView("AdminHome");
		return mv;
	}
	@RequestMapping("/login")
	public ModelAndView login()
	{
		ModelAndView mv=new ModelAndView("login");
		Users u=new Users();
		mv.addObject("userd",u);
		return mv;
		
	}
	@Autowired
	LoginDaoImpl ldi;
	@RequestMapping(value="/carryuserlog",method=RequestMethod.POST)
    public String readLogin(@ModelAttribute("userd") Users u )
    {
		Users page = ldi.LoginCheck(u);
		if(page!= null)
		{
		   if(page.getRole().equals("ROLE_ADMIN"))
		   {
			   return "AdminHome";
		   }
		   else if(page.getRole().equals("ROLE_USER"))
		   {
			  return "UserHome";
		   }
		}
	    else if(page==null)
		  {
		       return "redirect:login";
		  }
		return "";
		}
    }