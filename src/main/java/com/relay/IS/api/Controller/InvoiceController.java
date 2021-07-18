package com.relay.IS.api.Controller;

import com.relay.IS.api.Entity.Invoice;
import com.relay.IS.api.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    @Autowired
    private InvoiceService service;

    @PostMapping("/bookInvoice")
    public Invoice bookInvoice(@RequestBody Invoice invoice){
        return  service.saveInvoice(invoice);
    }
}
