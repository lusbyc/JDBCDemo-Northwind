package com.jdbcdemo.JDBCDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {

	@Autowired
	CustomersDao dao;

	@RequestMapping("/")
	public ModelAndView home() {
		return new ModelAndView("index2", "hello", "Welcome to Northwind");
	}

	@RequestMapping("/customers")
	public ModelAndView listCustomers() {
		ModelAndView mv = new ModelAndView("list-customers");
		mv.addObject("customers", dao.findAllCustomers());
		return mv;
	}
	
	@RequestMapping("add-customer")
	public String addStuff() {
		return "add-customer"; // the return should match the view name (jsp)
	}
	
	@PostMapping(value = "newcustomer")
	public ModelAndView newCustomers(@RequestParam("customerId") String test, Customers newCustomers) {
		dao.addCustomer(test,newCustomers.getContactName(), newCustomers.getAddress(), newCustomers.getCity(), newCustomers.getPhone());
		return new ModelAndView("redirect:/customers");
	}
	
	@RequestMapping("update") 
	public ModelAndView updateForm(@RequestParam("id") String idFromPage) {
		return new ModelAndView("update-form", "id", idFromPage); // the return should match the view name (jsp)
	}

	@RequestMapping("update-customerlist") // actually does the add and redirects you to the list
	public ModelAndView updateCustomer(Customers updateCustomerList) {
		dao.updateCustomer(updateCustomerList.getCustomerId(), updateCustomerList.getContactName(),
				updateCustomerList.getAddress(), updateCustomerList.getCity(), updateCustomerList.getPhone());
		return new ModelAndView("redirect:/customers");

	}
	
	@RequestMapping("/delete")
	public ModelAndView remove(@RequestParam("customerId") String id) {
		dao.deleteCustomer(id);
		return new ModelAndView("redirect:/customers");
	}

	
}
