package com.app.customers;

import javax.persistence.Entity;

import com.app.Account;

@Entity(name="Customer")
public class Customer extends Account
{

   private String DOB;
   
   public Customer() {
      super();
   }
   
   public Customer(Double id, String password, String name, String address, String phone, String DOB)
   {
      super.id = id;
      super.password = password;
      super.name = name;
      super.address = address;
      super.phone = phone;
      this.DOB = DOB;
   }
   
   public String getDOB()
   {
      return DOB;
   }

   public void setDOB(String DOB)
   {
      this.DOB = DOB;
   }
   
}
