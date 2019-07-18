package org.chibamu.worldfirst;

import org.chibamu.worldfirst.domain.Country;
import org.chibamu.worldfirst.domain.Customer;
import org.chibamu.worldfirst.service.ChinaRegistration;
import org.chibamu.worldfirst.service.Registration;
import org.chibamu.worldfirst.service.UKRegistration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class RegistrationContext {

    private static Logger LOG = LoggerFactory.getLogger(RegistrationContext.class.getName());

    public void createCustomer(){

        Registration reg = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Full Name:");
        String fullName = scanner.nextLine();
        System.out.println("Country: ");
        String country = scanner.nextLine().toUpperCase();
        Customer customer = Customer.buildCustomer().build();

        if(country != null) {
            if (country.equalsIgnoreCase(Country.CHINA.toString())) {
                Date formattedDate = null;
                System.out.println("Date Of Birth: ");
                String dateOfBirth = scanner.nextLine();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    formattedDate = sdf.parse(dateOfBirth);
                } catch (ParseException e) {
                    LOG.error("Error parsing date of birth", e);
                }
                customer.setDateOfBirth(formattedDate);
                reg = new ChinaRegistration(customer);
            }
            if(country.equalsIgnoreCase(Country.UK.toString())){
                reg = new UKRegistration(customer);
            }
        }
        reg.register();
    }
}
