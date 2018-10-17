package com.app.employees;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.employees.Employee;

@RestController
@Controller
public class EmployeeController
{
   @Autowired  
   private EmployeeService employeeService;

   @RequestMapping("/employees")
   public List<Employee> getAllemployees()
   {
      return employeeService.getAllEmployees();
   }
   
   @RequestMapping("/employees/{id}")
   public Optional<Employee> getEmployee(@PathVariable Double id) {
      return employeeService.getEmployee(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/employees")
   public void addEmployee(@RequestBody Employee employee) {
      employeeService.addEmployee(employee);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/employees/{id}")
   public void updateEmployee(@PathVariable Double id, @RequestBody Employee employee) {
      employeeService.updateEmployee(id, employee);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/employees/{id}")
   public void deleteEmployee(@PathVariable Double id) {
      employeeService.deleteEmployee(id);
   }

}
