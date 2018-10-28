package com.app.items;

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
public class ItemController
{
   @Autowired  
   private ItemService itemService;

   @RequestMapping("/item")
   public List<Item> getAllItems()
   {
      return itemService.getAllItems();
   }
   
   @RequestMapping("/item/{id}")
   public Optional<Item> getItem(@PathVariable Double id) {
      return itemService.getItem(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/item")
   public void addItem(@RequestBody Item item) {
      itemService.addItem(item);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/item/{id}")
   public void updateItem(@PathVariable Double id, @RequestBody Item item) {
      itemService.updateItem(id, item);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/item/{id}")
   public void deleteItem(@PathVariable Double id) {
      itemService.deleteItem(id);
   }

}
