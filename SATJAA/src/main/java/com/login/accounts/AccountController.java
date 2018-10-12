package com.login.accounts;

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
public class AccountController
{
   @Autowired  
   private AccountService accountService;

   @RequestMapping("/accounts")
   public List<Account> getAllaccounts()
   {
      return accountService.getAllAccounts();
   }
   
   @RequestMapping("/accounts/{id}")
   public Optional<Account> getAccount(@PathVariable Double id) {
      return accountService.getAccount(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/accounts")
   public void addaccount(@RequestBody Account account) {
      accountService.addAccount(account);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/accounts/{id}")
   public void updateaccount(@PathVariable Double id, @RequestBody Account account) {
      accountService.updateAccount(id, account);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/accounts/{id}")
   public void deleteaccount(@PathVariable Double id) {
      accountService.deleteAccount(id);
   }

}
