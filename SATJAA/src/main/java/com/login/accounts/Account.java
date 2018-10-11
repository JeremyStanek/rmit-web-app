package com.login.accounts;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account
{
   @Id
   private String id;
   private String name;
   private String company;

   public Account()
   {
  
   }

   public Account(String id, String name, String company)
   {
      super();
      this.id = id;
      this.name = name;
      this.company = company;
   }

   public String getId()
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

   public void setID(String id)
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
