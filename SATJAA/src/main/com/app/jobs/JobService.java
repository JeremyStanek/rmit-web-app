package com.app.jobs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobService
{
   @Autowired
   private JobRepository jobRepository;
   
   public List<Job> getAllJobs(Double id){
      List<Job> jobs = new ArrayList<>();
      jobRepository.findAll().forEach(jobs::add);
      return jobs;
   }
   
   public Optional<Job> getJob(Double id) {
      return jobRepository.findById(id);
   }
   
   public void addJob(Job job) {
      jobRepository.save(job);
   }
   
   public void updateJob(Double id, Job job) {
      jobRepository.save(job);
   }
   
   public void deleteJob(Double id) {
      jobRepository.deleteById(id);
   }
   
}
