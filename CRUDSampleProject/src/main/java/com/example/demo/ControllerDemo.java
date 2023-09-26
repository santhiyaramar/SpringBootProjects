package com.example.demo;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerDemo {
	@Autowired
	EmployeeDB eDB;
	
	@GetMapping("bharanidharan") 
	public ModelAndView display(Employee emp)
	{
		ModelAndView mav = new ModelAndView();
		  mav.addObject("empDetails", emp);
		  mav.setViewName("index");
		  
		  
		System.out.println(emp.getName());
		System.out.println(emp.getEmpId());
	//	System.out.println(userName);
		//  return "index";
		return mav;
		}
	  @GetMapping("addEmployee")
	  public ModelAndView add(Employee emp)
	  {
	    ModelAndView mav = new ModelAndView(); 
	    mav.addObject("empDetails", emp);
	    mav.setViewName("index2");
	    
	    eDB.save(emp);
	    
	    System.out.println(emp.getEmpId());
	    System.out.println(emp.getName());
	    System.out.println("hi");
	    //return "home";
	    return mav; 
	  }
	  @GetMapping("searchEmployee")
	  public ModelAndView search(Employee emp)
	  {
	    ModelAndView mav = new ModelAndView(); 
	    Optional<Employee> opt = eDB.findById(emp.getEmpId());
	    Employee em=opt.get();
	    mav.addObject("employee",em);
	    mav.setViewName("present");
	    return mav; 
	    
	  }
	  @GetMapping("deleteEmployee")
	  public ModelAndView delete(Employee emp)
	  {
	    ModelAndView mav = new ModelAndView(); 
	    Optional<Employee> opt = eDB.findById(emp.getEmpId());
	    Employee em=opt.get();
	    mav.addObject("employee",em);
	    mav.setViewName("present");
	    eDB.deleteById(emp.getEmpId());
	    return mav; 


}
	  @GetMapping("updateEmployee")
	  public ModelAndView update(Employee emp)
	  {
	    ModelAndView mav = new ModelAndView(); 
	   eDB.updateEmployee(emp.getName(), emp.getEmpId());
	    mav.addObject("employee",emp);
	    mav.setViewName("present");
	    return mav; 
}
}