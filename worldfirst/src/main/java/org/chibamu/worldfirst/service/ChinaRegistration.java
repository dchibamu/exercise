package org.chibamu.worldfirst.service;

import org.chibamu.worldfirst.domain.Customer;

public class ChinaRegistration implements Registration {

    private Customer customer;

    public ChinaRegistration(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void register() {

    }


}
