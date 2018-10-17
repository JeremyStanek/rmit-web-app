package com.app.employees;

import javax.persistence.Entity;

import com.app.Account;

@Entity
public class Employee extends Account
{

   private String type, permissions, TFN, dateEmployed, ALR, SLR;
   private double wage, workHours;
   
   public Employee() {
      super();
   }
   
   public Employee(Double id, String password, String name, String address, String phone,
                   String type, String permissions, String TFN,
                   String dateEmployed, String ALR, String SLR,
                   double wage, double workHours)
   {
      super.id = id;
      super.password = password;
      super.name = name;
      super.address = address;
      super.phone = phone;
      this.type = type;
      this.permissions = permissions;
      this.TFN = TFN;
      this.dateEmployed = dateEmployed;
      this.ALR = ALR;
      this.SLR = SLR;
      this.wage = wage;
      this.workHours = workHours;
   }
   
   public String getType() {
      return type;
   }
   
   public void setType(String type) {
      this.type = type;
   }
   
   public String getPermissions() {
      return permissions;
   }
   
   public void setPermissions(String permissions) {
      this.permissions = permissions;
   }
   
   public String getTFN() {
      return TFN;
   }
   
   public void setTFN(String TFN) {
      this.TFN = TFN;
   }
   
   public String getDateEmployed() {
      return dateEmployed;
   }
   
   public void setDateEmployed(String dateEmployed) {
      this.dateEmployed = dateEmployed;
   }
   
   public String getALR() {
      return ALR;
   }
   
   public void setALR(String ALR) {
      this.ALR = ALR;
   }
   
   public String getSLR() {
      return SLR;
   }
   
   public void setSLR(String SLR) {
      this.SLR = SLR;
   }
   
   public double getWage() {
      return wage;
   }
   
   public void setWage(double wage) {
      this.wage = wage;
   }
   
   public double getworkHours() {
      return workHours;
   }
   
   public void setworkHours(double workHours) {
      this.workHours = workHours;
   }
   
}
