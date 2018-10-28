package com.app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Account
{
   @Id
   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
   protected Double id;
   
   protected String password, name, address, phone;

   public Account()
   {
   }

   public Account(Double id, String password, String name, String address, String phone)
   {
      super();
      this.id = id;
      this.password = password;
      this.name = name;
      this.address = address;
      this.phone = phone;
   }

   public Double getId()
   {
      return id;
   }

   public void setID(Double id)
   {
      this.id = id;
   }
   
   public String getPassword()
   {
      return password;
   }

   public void setPassword(String password)
   {
      this.password = password;
   }
   
   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getAddress()
   {
      return address;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }
   
   public String getPhone()
   {
      return phone;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

}
