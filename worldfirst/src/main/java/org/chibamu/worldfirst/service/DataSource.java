package org.chibamu.worldfirst.service;

import org.chibamu.worldfirst.domain.Customer;

import java.util.HashMap;
import java.util.Map;

public class DataSource {

    private static Map<Integer, Customer> data = new HashMap<>();
    private static DataSource dataSource;

    private DataSource(){

        if(dataSource == null){
            new DataSource();
        }
    }



}
