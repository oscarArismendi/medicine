package com.medicine.medicine.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductInvoicePk {

    @Column(name = "id_product")
    private Long idproduct;
    @Column(name = "id_invoce")
    private Long idinvoice;

    public ProductInvoicePk() {
    }

    public Long getIdproduct() {
        return idproduct;
    }

    public void setIdproduct(Long idproduct) {
        this.idproduct = idproduct;
    }

    public Long getIdinvoice() {
        return idinvoice;
    }

    public void setIdinvoice(Long idinvoice) {
        this.idinvoice = idinvoice;
    }

}
