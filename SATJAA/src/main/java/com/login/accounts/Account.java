package com.login.accounts;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account
{
   @Id
   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Double id;
   
   private String name;
   private String company;

   public Account()
   {
  
   }

   public Account(Double id, String name, String company)
   {
      super();
      this.id = id;
      this.name = name;
      this.company = company;
   }

   public Double getId()
   {
      return id;
   }

   public String getName()
   {
      return name;
   }

   public String getCompany()
   {
      return company;
   }

   public void setID(Double id)
   {
      this.id = id;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public void setCompany(String company)
   {
      this.company = company;
   }

}
