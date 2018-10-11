package com.login.invoices;

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
   
   public List<Invoice> getAllInvoices(String id){
      List<Invoice> invoices = new ArrayList<>();
      invoiceRepository.findAll().forEach(invoices::add);
      return invoices;
   }
   
   public Optional<Invoice> getInvoice(String id) {
      return invoiceRepository.findById(id);
   }
   
   public List<Invoice> getInvoiceByName(String name) {
      return invoiceRepository.findByName(name);
   }
   
   public void addInvoice(Invoice invoice) {
      invoiceRepository.save(invoice);
   }
   
   public void updateInvoice(String id, Invoice invoice) {
      invoiceRepository.save(invoice);
   }
   
   public void deleteInvoice(String id) {
      invoiceRepository.deleteById(id);
   }
   
}
