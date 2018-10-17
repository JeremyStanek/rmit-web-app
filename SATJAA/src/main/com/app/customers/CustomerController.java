package com.app.customers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.customers.Customer;

@RestController
@Controller
public class CustomerController
{
   @Autowired  
   private CustomerService customerService;

   @RequestMapping("/customers")
   public List<Customer> getAllcustomers()
   {
      return customerService.getAllCustomers();
   }
   
   @RequestMapping("/customers/{id}")
   public Optional<Customer> getCustomer(@PathVariable Double id) {
      return customerService.getCustomer(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/customers")
   public void addCustomer(@RequestBody Customer customer) {
      customerService.addCustomer(customer);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/customers/{id}")
   public void updateCustomer(@PathVariable Double id, @RequestBody Customer customer) {
      customerService.updateCustomer(id, customer);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/customers/{id}")
   public void deleteCustomer(@PathVariable Double id) {
      customerService.deleteCustomer(id);
   }

}
