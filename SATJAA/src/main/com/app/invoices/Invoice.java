package com.app.invoices;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.app.customers.Customer;

@Entity(name="Invoice")
public class Invoice
{
   @Id
   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Double id;
   
   private Double custId;
   private double totalCost;
   private String date;
   
   @ManyToOne
   private Customer customer;

   public Invoice()
   {
   }

   public Invoice(Double id, Double custId, double totalCost,
              String date)
   {
      super();
      this.id = id;
      this.custId = custId;
      this.totalCost = totalCost;
      this.date = date;
   }

   public Double getId()
   {
      return id;
   }

   public void setID(Double id)
   {
      this.id = id;
   }
   
   public Double customerId()
   {
      return custId;
   }
   
   public void setCustomerId(Double custId)
   {
      this.custId = custId;
   }
   
   public double getTotalCost()
   {
      return totalCost;
   }

   public void setTotalCost(double totalCost)
   {
      this.totalCost = totalCost;
   }
   
   public String getDate()
   {
      return date;
   }
   
   public void setDate(String date)
   {
      this.date = date;
   }
   
}
