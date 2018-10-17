package com.app.inventory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class InventoryController
{
   @Autowired  
   private InventoryService inventoryService;

   @RequestMapping("/inventory")
   public List<Item> getAllItems()
   {
      return inventoryService.getAllItems();
   }
   
   @RequestMapping("/inventory/{id}")
   public Optional<Item> getItem(@PathVariable Double id) {
      return inventoryService.getItem(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/inventory")
   public void addItem(@RequestBody Item item) {
      inventoryService.addItem(item);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/inventory/{id}")
   public void updateItem(@PathVariable Double id, @RequestBody Item item) {
      inventoryService.updateItem(id, item);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/inventory/{id}")
   public void deleteItem(@PathVariable Double id) {
      inventoryService.deleteItem(id);
   }

}
