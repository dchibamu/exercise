package org.chibamu.worldfirst.service;

import org.chibamu.worldfirst.domain.Customer;

public class UKRegistration implements Registration {

    private Customer customer;

    public UKRegistration(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void register() {

    }
}
