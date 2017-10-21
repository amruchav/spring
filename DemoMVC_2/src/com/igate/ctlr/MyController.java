package com.igate.ctlr;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@Autowired
	Login login;
	
	@RequestMapping("/showForm")
	public String displayForm(Model model)
	{
		System.out.println("hi");
		//LoginBean  - loginBean
	  //model.addAttribute("login", new Login());
	 model.addAttribute("login",login);//login
	  return "login";//Logical view name
	}
	
	@RequestMapping(value="/checkLogin")
	public String checkLogin(Login login)
	{
		System.out.println(login) ;//chek value in login object
		//u will find data entered
		//inhtml form 
		
		((Model) login).addAttribute("login",login);
	  return "success";	
	}

}
