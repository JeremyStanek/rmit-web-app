package com.login.invoices;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.login.accounts.Account;

public interface InvoiceRepository extends CrudRepository<Invoice, String>
{
   public List<Invoice> findByName(String name);
   
}
