package com.app.employers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.employers.Employer;
import com.app.employers.EmployerRepository;

@Service
public class EmployerService
{
   @Autowired
   private EmployerRepository employerRepository;
   
   public List<Employer> getAllEmployers(){
      List<Employer> employers = new ArrayList<>();
      employerRepository.findAll().forEach(employers::add);
      return employers;
   }
   
   public Optional<Employer> getEmployer(Double id) {
      return employerRepository.findById(id);
   }
   
   public void addEmployer(Employer employer) {
      employerRepository.save(employer);
   }
   
   public void updateEmployer(Double id, Employer employer) {
      employerRepository.save(employer);
   }
   
   public void deleteEmployer(Double id) {
      employerRepository.deleteById(id);
   }
   
}
