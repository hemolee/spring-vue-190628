package com.bitcamp.web.service;

import java.util.List;

import com.bitcamp.web.domain.CustomerDTO;
import com.bitcamp.web.repositories.CustomerRepository;
import com.bitcamp.web.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service 
public class CustomerService {
   @Autowired CustomerRepository customerRepository;

 
    public void addCustomer(CustomerDTO customer) {
        

    }


    // public List<CustomerDTO> findCustomers(PageProxy pxy) {

    //     return null;
    // }

   
    public List<CustomerDTO> findCustomersByOption(CustomerDTO option) {
        return null;
    }

   
    public CustomerDTO findCustomerByCustomerId(String customerId) {
        return null;
    }

    
    public int updateCustomer(CustomerDTO customer) {
      
        return 0;
    }

    
    public void deleteCustomer(CustomerDTO customer) {
      
    }

   
    public int countAll() {
        return 0;
    }

   
    public CustomerDTO login(CustomerDTO customer) {      

        return null; 
    }    
}