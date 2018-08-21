package com.jdbc.demo.JDBCDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jdbc.demo.JDBCDemo.dao.CustomersJdbcDao;

@Controller
public class CustomersController {

	@Autowired
	CustomersJdbcDao dao;

	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index", "customers", dao.findAll());
	}

	@RequestMapping("/addnewcust")
	public ModelAndView addNew(@RequestParam("id") String id, @RequestParam("contName") String name,
			@RequestParam("title") String title, @RequestParam("compName") String compName,
			@RequestParam("phone") String phone) {

		dao.insertCustomer(id, compName, name, title, phone);

		return new ModelAndView("index", "customers", dao.findAll());
	}

	// create a mapping to a form page to change the customer name
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("id") String custID) {
		// here the parameter for the constructor is the name of the jsp
		ModelAndView mv = new ModelAndView("updateform");
		// showing that you can add multiple things to a jsp page using
		// the addObject method
		// the first param is the name to be using in the EL tag on the jsp page
		// the second param is the object or data that you want to be rendered on the
		// page
		mv.addObject("cID", custID);
		mv.addObject("test", "Hello World");

		return mv;

	}

	@RequestMapping("/updatecust")
	public ModelAndView updateCust(@RequestParam("cID") String id, @RequestParam("name") String name) {
		dao.updateCustomer(id, name);

		return new ModelAndView("index", "customers", dao.findAll());
	}
	
	@RequestMapping("delete")
	public ModelAndView deleteCust(@RequestParam("id") String custID) {
		dao.deleteCustomer(custID);
		return new ModelAndView("index", "customers", dao.findAll());
	}

}
