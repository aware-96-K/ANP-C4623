package com.HotelManagementSystem.HotelManagement;

import java.util.List;

import com.maven.dao.Hotel;
import com.maven.model.HotelManagement;


public class App 
{
    public static void main( String[] args )
    {
    	Hotel hm = new Hotel();

    	HotelManagement customer =new HotelManagement("Pranita", "Aware", "pranitaaware13@gmail.com", 89, "Royal", 789, "Normal", 56789);
    	HotelManagement customer1 =new HotelManagement("Mahendra", "Dhoni", "mahi7@gmail.com", 79, "Normal", 489, "Golden", 9876654);
    	HotelManagement customer2 =new HotelManagement("Akshay", "Kumar", "akshaykumar@gmail.com", 98, "Royal", 489, "Golden", 778654);
    	HotelManagement customer3 =new HotelManagement("Allu", "Arjun", "alluarjun@gmail.com", 77, "Royal", 489, "Normal", 778654);

        hm.saveCustomer(customer);
        hm.saveCustomer(customer1); 
        hm.saveCustomer(customer2);
        
        customer.setFirstName("pva");
        hm.updateCustomer(customer);
        

        List <HotelManagement > customers = hm.getAllCustomers();
        customers.forEach(Customer2 -> System.out.println(Customer2.getId()));
        
        hm.deleteCustomer(2);

    }
    }

