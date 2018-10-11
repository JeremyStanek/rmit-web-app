package com.login.invoices;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.login.accounts.Account;

@Entity
public class Invoice
{
   @Id
   private String id;
   private String name;
   private double totalCost;
   
   @ManyToOne
   private Account account;

   public Invoice()
   {
  
   }

   public Invoice(String id, String name, double totalCost)
   {
      super();
      this.id = id;
      this.name = name;
      this.totalCost = totalCost;
   }

   public String getId()
   {
      return id;
   }

   public String getName()
   {
      return name;
   }

   public double getTotalCost()
   {
      return totalCost;
   }

   public void setID(String id)
   {
      this.id = id;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public void setTotalCost(double totalCost)
   {
      this.totalCost = totalCost;
   }
   
}
