package org.chibamu.worldfirst;

import org.chibamu.worldfirst.domain.Country;
import org.chibamu.worldfirst.domain.Customer;
import org.chibamu.worldfirst.service.ChinaRegistration;
import org.junit.Assert;
import org.junit.Test;

public class ChinaRegistrationTest {

    @Test
    public void shouldSuccessfullyRegisterChinaCustomer(){
        Customer customer = Customer.buildCustomer()
                .withFullName("Dominic").withCountry(Country.CHINA.toString()).build();
        ChinaRegistration chinaReg = new ChinaRegistration(customer);
        chinaReg.register();
        //Assert.assertEquals();
    }
}
