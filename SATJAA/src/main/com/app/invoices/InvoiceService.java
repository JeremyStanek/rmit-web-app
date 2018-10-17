package com.app.invoices;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService
{
   @Autowired
   private InvoiceRepository invoiceRepository;
   
   public List<Invoice> getAllInvoices(Double id){
      List<Invoice> invoices = new ArrayList<>();
      invoiceRepository.findAll().forEach(invoices::add);
      return invoices;
   }
   
   public Optional<Invoice> getInvoice(Double id) {
      return invoiceRepository.findById(id);
   }
   
   public void addInvoice(Invoice invoice) {
      invoiceRepository.save(invoice);
   }
   
   public void updateInvoice(Double id, Invoice invoice) {
      invoiceRepository.save(invoice);
   }
   
   public void deleteInvoice(Double id) {
      invoiceRepository.deleteById(id);
   }
   
}
