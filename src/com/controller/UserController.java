package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.model.Customer;
import com.service.CustomerService;

@Controller
public class UserController {
	
	@Autowired
	CustomerService customerService;
	
	@RequestMapping(value="/")
	public String index()
	{
		return "first";
		
		
	}
	/*@RequestMapping(value="/home", method = RequestMethod.POST)
	public String validateUser(@ModelAttribute("command") Customer customerObj, BindingResult resultset, ModelMap model) {
		
	{
		
		return "home";
		
		
	}*/
	
	@RequestMapping(value="/login")
	public ModelAndView login()
		{
		return new ModelAndView("login", "command", new Customer());
		}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView registerCustomer()
		{
		return new ModelAndView("register", "command", new Customer());
		}
	
	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public ModelAndView userLogin(@ModelAttribute("command") Customer customer, BindingResult resultset, ModelMap model) 
		{
		String name=null;
		ModelAndView mv = new ModelAndView();
		 name = customerService.loginUser(customer);
		
		
		if (name == "failed") {
			mv.addObject("msg", "you have ebtered invalid Username/Password");
			mv.setViewName("login");
		} else {
			
			mv.addObject("msg", "Welcome.."+name);
			mv.setViewName("home");
		}

		

		return mv;
		
	}
	
	
	@RequestMapping(value="/saveCustomer", method = RequestMethod.POST)
	public ModelAndView saveAccount(@ModelAttribute("command") Customer customer, BindingResult resultset, ModelMap model) {
		
		//	System.out.println("Save "+customer.getcName());
		
		String msg=customerService.registerService(customer);
		
		
		if(msg.equals("Success"))
			model.addAttribute("msg","Data saved");
		else
			model.addAttribute("msg","Exception Occurred");
		/*

		ArrayList<Player> playerList=playerService.allPlayerList();
		model.addAttribute("list",playerList);*/
		
		return new ModelAndView("login","command",model);
	}
	
	
	@RequestMapping(value="/about")
	public ModelAndView about()
	{
		return new ModelAndView("about", "command", new Customer());
	}
	
}
