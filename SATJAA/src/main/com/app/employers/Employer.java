package com.app.employers;

import javax.persistence.Entity;

import com.app.Account;

@Entity(name="Employer")
public class Employer extends Account
{

   private String companyName, ABN;
   
   public Employer() {
      super();
   }
   
   public Employer(Double id, String password, String name, String address, String phone,
                   String companyName, String ABN)
   {
      super.id = id;
      super.password = password;
      super.name = name;
      super.address = address;
      super.phone = phone;
      this.companyName = companyName;
      this.ABN = ABN;
   }
   
   public String getcompanyName() {
      return companyName;
   }
   
   public void setcompanyName(String companyName) {
      this.companyName = companyName;
   }
   
   public String getABN() {
      return ABN;
   }
   
   public void setABN(String ABN) {
      this.ABN = ABN;
   }
   
}
