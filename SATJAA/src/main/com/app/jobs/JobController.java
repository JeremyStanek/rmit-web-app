package com.app.jobs;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class JobController
{
   @Autowired
   private JobService jobService;

   @RequestMapping("/employees/{id}/jobs")
   public List<Job> getAllJobs(@PathVariable Double id)
   {
      return jobService.getAllJobs(id);
   }
   
   @RequestMapping("/employees/{employeeId}/jobs/{id}")
   public Optional<Job> getJob(@PathVariable Double id) {
      return jobService.getJob(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/employees/{id}/jobs")
   public void addJob(@RequestBody Job job) {
      jobService.addJob(job);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/employees/{employeeId}/jobs/{id}")
   public void updateJob(@PathVariable Double id, @RequestBody Job job) {
      jobService.updateJob(id, job);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/employees/{employeeId}/jobs/{id}")
   public void deleteJob(@PathVariable Double id) {
      jobService.deleteJob(id);
   }

}
