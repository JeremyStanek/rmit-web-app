package com.app.invoices;

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

   @RequestMapping("/customers/{id}/invoices")
   public List<Invoice> getAllInvoices(@PathVariable Double id)
   {
      return invoiceService.getAllInvoices(id);
   }
   
   @RequestMapping("/customers/{customerId}/invoices/{id}")
   public Optional<Invoice> getInvoice(@PathVariable Double id) {
      return invoiceService.getInvoice(id);
   }
   
   @RequestMapping(method=RequestMethod.POST, value = "/customers/{id}/invoices")
   public void addInvoice(@RequestBody Invoice invoice) {
      invoiceService.addInvoice(invoice);
   }
   
   @RequestMapping(method=RequestMethod.PUT, value = "/customers/{customerId}/invoices/{id}")
   public void updateInvoice(@PathVariable Double id, @RequestBody Invoice invoice) {
      invoiceService.updateInvoice(id, invoice);
   }
   
   @RequestMapping(method=RequestMethod.DELETE, value = "/customers/{customerId}/invoices/{id}")
   public void deleteInvoice(@PathVariable Double id) {
      invoiceService.deleteInvoice(id);
   }

}
