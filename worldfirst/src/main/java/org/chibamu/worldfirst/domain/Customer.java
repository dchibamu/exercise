package org.chibamu.worldfirst.domain;

import java.util.Date;

public class Customer {

    private String fullName;
    private String emailAddress;
    private String country;
    private Date dateOfBirth;


    public Customer(){}

    public Customer(String fullName, String country) {
        this.fullName = fullName;
        this.country = country;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public static Builder buildCustomer(){
        return new Builder();
    }

    public static class Builder{

        private String fullName;
        private String emailAddress;
        private String country;
        private Date dateOfBirth;
        private Customer customer;

        public Builder withFullName(String fullName){
            this.fullName = fullName;
            return this;
        }

        public Builder withEmailAddress(String emailAddress){
            this.emailAddress = emailAddress;
            return this;
        }

        public Builder withCountry(String country){
            this.country = country;
            return this;
        }

        public Builder withDateOfBirth(Date dateOfBirth){
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Customer build(){
            customer = new Customer();
            customer.setFullName(fullName);
            customer.setCountry(country);
            return customer;
        }

        public Customer getCustomer() {
            return customer;
        }
    }
}
