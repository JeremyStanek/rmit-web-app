package com.app.jobs;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.app.employees.Employee;

@Entity
public class Job
{
   @Id
   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Double id;
   
   private Double employId;
   private String dateStarted, dateFinished, timeStarted, timeFinished;
   
   @ManyToOne
   private Employee employee;

   public Job()
   {
   }

   public Job(Double id, Double employId, String dateStarted, String dateFinished,
              String timeStarted, String timeFinished)
   {
      super();
      this.id = id;
      this.employId = employId;
      this.dateStarted = dateStarted;
      this.dateFinished = dateFinished;
      this.timeStarted = timeStarted;
      this.timeFinished = timeFinished;
   }

   public Double getId()
   {
      return id;
   }

   public void setId(Double id)
   {
      this.id = id;
   }
   
   public Double employId()
   {
      return employId;
   }
   
   public void setEmployeeId(Double employId)
   {
      this.employId = employId;
   }
   
   public String getDateStarted()
   {
      return dateStarted;
   }
   
   public void setDateStarted(String dateStarted)
   {
      this.dateStarted = dateStarted;
   }
   
   public String getDateFinished()
   {
      return dateFinished;
   }
   
   public void setDateFinished(String dateFinished)
   {
      this.dateFinished = dateFinished;
   }
   
   public String getTimeStarted()
   {
      return timeStarted;
   }
   
   public void setTimeStarted(String timeStarted)
   {
      this.timeStarted = timeStarted;
   }
   
   public String getTimeFinished()
   {
      return timeFinished;
   }
   
   public void setTimeFinished(String timeFinished)
   {
      this.timeFinished = timeFinished;
   }
   
}
