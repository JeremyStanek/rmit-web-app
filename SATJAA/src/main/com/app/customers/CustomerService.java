package com.app.customers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.customers.Customer;
import com.app.customers.CustomerRepository;

@Service
public class CustomerService
{
   @Autowired
   private CustomerRepository customerRepository;
   
   public List<Customer> getAllCustomers(){
      List<Customer> customers = new ArrayList<>();
      customerRepository.findAll().forEach(customers::add);
      return customers;
   }
   
   public Optional<Customer> getCustomer(Double id) {
      return customerRepository.findById(id);
   }
   
   public void addCustomer(Customer customer) {
      customerRepository.save(customer);
   }
   
   public void updateCustomer(Double id, Customer customer) {
      customerRepository.save(customer);
   }
   
   public void deleteCustomer(Double id) {
      customerRepository.deleteById(id);
   }
   
}
