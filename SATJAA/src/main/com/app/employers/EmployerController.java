package com.app.employers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.employers.Employer;

@RestController
@Controller
public class EmployerController
{
   @Autowired  
   private EmployerService employerService;

   @RequestMapping("/employers")
   public List<Employer> getAllemployers()
   {
      return employerService.getAllEmployers();
   }
   
   @RequestMapping("/employers/{id}")
   public Optional<Employer> getEmployer(@PathVariable Double id) {
      return employerService.getEmployer(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/employers")
   public void addEmployer(@RequestBody Employer employer) {
      employerService.addEmployer(employer);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/employers/{id}")
   public void updateEmployer(@PathVariable Double id, @RequestBody Employer employer) {
      employerService.updateEmployer(id, employer);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/employers/{id}")
   public void deleteEmployer(@PathVariable Double id) {
      employerService.deleteEmployer(id);
   }

}
