package com.relay.IS.api.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
@Table(name = "INVOICE_TB")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {
    @Id
    private String id;
    private String invoiceNumber;
    private double value;
    private int createdAt;
    private String creditNumber;
    private double valuecredit;


}
