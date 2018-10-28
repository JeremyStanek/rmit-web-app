package com.app.items;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.app.Account;

@Entity
public class Item
{
   @Id
   //@GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Double id;
   
   private double price;
   private int quantity;
   private String name, manufacturer, description;

   public Item()
   {
   }

   public Item(Double id, double price, int quantity,
               String name, String manufacturer, String description)
   {
      super();
      this.id = id;
      this.price = price;
      this.quantity = quantity;
      this.name = name;
      this.manufacturer = manufacturer;
      this.description = description;
   }

   public Double getId()
   {
      return id;
   }

   public void setID(Double id)
   {
      this.id = id;
   }
   
   public double getPrice()
   {
      return price;
   }

   public void setPrice(Double price)
   {
      this.price = price;
   }
   
   public int getQuantity()
   {
      return quantity;
   }

   public void setQuantity(int quantity)
   {
      this.quantity = quantity;
   }
   
   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }
   
   public String getManufacturer()
   {
      return manufacturer;
   }

   public void setManufacturer(String manufacturer)
   {
      this.manufacturer = manufacturer;
   }
   
   public String getDescription()
   {
      return description;
   }

   public void setDescription(String description)
   {
      this.description = description;
   }
   
}
