package com.app.employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employees.Employee;
import com.app.employees.EmployeeRepository;

@Service
public class EmployeeService
{
   @Autowired
   private EmployeeRepository employeeRepository;
   
   public List<Employee> getAllEmployees(){
      List<Employee> employees = new ArrayList<>();
      employeeRepository.findAll().forEach(employees::add);
      return employees;
   }
   
   public Optional<Employee> getEmployee(Double id) {
      return employeeRepository.findById(id);
   }
   
   public void addEmployee(Employee employee) {
      employeeRepository.save(employee);
   }
   
   public void updateEmployee(Double id, Employee employee) {
      employeeRepository.save(employee);
   }
   
   public void deleteEmployee(Double id) {
      employeeRepository.deleteById(id);
   }
   
}
