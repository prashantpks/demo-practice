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
	
	// Create customer
	public void createCustomer(int customerId, String customerName, String customerAddress, String customerEmail) {
		
		// Create bean object of customer
		Customer customer1 = new Customer();
		customer1.setCustomerID(customerId);
		customer1.setCustomerAddress(customerAddress);
		customer1.setCustomerName(customerName);
		customer1.setEmail(customerEmail);
		
		customers.add(customer1);
		
		
	}
	
	// Update customer
	public boolean updateCustomer(int customerId, String customerName, String customerAddress, String customerEmail ) {
		boolean flag = false;
		for(Customer customer: customers) {
			if(customer.getCustomerID() == customerId) {
				customer.setCustomerAddress(customerAddress);
				customer.setCustomerName(customerName);
				customer.setEmail(customerEmail);
				flag = true;
			}
		}
		return flag;
	}
	
	// Delete customer 
	public boolean deleteCustomer(int customerId) {
		boolean flag = false;
		Customer deletedCustomer = null; 
		for(Customer customer: customers) {
			if(customer.getCustomerID() == customerId) {
				deletedCustomer = customer;
				flag = true;
			}
		}
		
		if(flag) customers.remove(deletedCustomer);
		return flag;
	}
	
	
	// List all customers
	public void listCustomer() {
		
		for(Customer customer: customers) {
			System.out.println("Details of customer:-->"+ customer.getCustomerID() +"---"+customer.getCustomerName());
		}
	}
}
