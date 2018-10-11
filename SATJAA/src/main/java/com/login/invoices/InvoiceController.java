package com.login.invoices;

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
public class InvoiceController
{
   @Autowired
   private InvoiceService invoiceService;

   @RequestMapping("/accounts/{id}/invoices")
   public List<Invoice> getAllinvoices(@PathVariable String id)
   {
      return invoiceService.getAllInvoices(id);
   }
   
   @RequestMapping("/accounts/{accountId}/invoices/{id}")
   public Optional<Invoice> getInvoice(@PathVariable String id) {
      return invoiceService.getInvoice(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/accounts/{id}/invoices")
   public void addinvoice(@RequestBody Invoice invoice) {
      invoiceService.addInvoice(invoice);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/accounts/{accountId}/invoices/{id}")
   public void updateinvoice(@PathVariable String id, @RequestBody Invoice invoice) {
      invoiceService.updateInvoice(id, invoice);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/accounts/{accountId}/invoices/{id}")
   public void deleteinvoice(@PathVariable String id) {
      invoiceService.deleteInvoice(id);
   }

}
