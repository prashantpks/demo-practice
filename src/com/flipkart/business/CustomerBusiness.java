/**
 * 
 */
package com.flipkart.business;

import java.util.ArrayList;
import java.util.List;
import com.flipkart.bean.Customer;

/**
 * @author prashant.k5
 *
 */
public class CustomerBusiness implements CustomerInterface{
	// business skt method of customer mgmt
	List <Customer> customers = new ArrayList<Customer>();
	
	public void createCustomer() {
		System.out.println("impl of create cust");
		
		// Create bean object of customer
		Customer customer1 = new Customer();
		customer1.setCustomerID(101);
		customer1.setCustomerAddress("delhi");
		customer1.setCustomerName("amit");
		customer1.setEmail("dsfs");
		
		customers.add(customer1);
		
		Customer customer2 = new Customer();
		customer2.setCustomerID(102);
		customer2.setCustomerAddress("mumbai");
		customer2.setCustomerName("pks");
		customer2.setEmail("sdfds");
		
		customers.add(customer2);

		
	}
	
	public int updateCustomer(int id) {
		System.out.println("impl of upd cust");
		return id;
	}
	
	public boolean deleteCustomer(int id) {
		System.out.println("impl of del cust");
		return true;
	}
	
	public void listCustomer() {
		System.out.println("impl of cust list");
		
		for(Customer cust: customers) {
			System.out.println("Details of customer:-->"+ cust.getCustomerID() +"---"+cust.getCustomerName());
		}
	}
}
