package com.relay.IS.api.service;

import com.relay.IS.api.Entity.Invoice;
import com.relay.IS.api.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository repository;

    public Invoice saveInvoice(Invoice invoice){
        invoice.setId(UUID.randomUUID().toString());
        invoice.setCreatedAt(UUID.randomUUID().hashCode());
        return repository.save(invoice);
    }
}