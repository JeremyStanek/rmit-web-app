package com.login.invoices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.login.accounts.Account;

@Entity
public class Invoice
{
   @Id
   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Double id;
   
   private Double totalCost;
   
   @ManyToOne
   private Account account;

   public Invoice()
   {
  
   }

   public Invoice(Double id, Double totalCost)
   {
      super();
      this.id = id;
      this.totalCost = totalCost;
   }

   public Double getId()
   {
      return id;
   }

   public Double getTotalCost()
   {
      return totalCost;
   }

   public void setID(Double id)
   {
      this.id = id;
   }

   public void setTotalCost(Double totalCost)
   {
      this.totalCost = totalCost;
   }
   
}
