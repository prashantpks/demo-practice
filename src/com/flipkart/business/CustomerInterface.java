/**
 * 
 */
package com.flipkart.business;

/**
 * @author prashant.k5
 *
 */
public interface CustomerInterface {
	public void createCustomer(int customerId, String customerName, String customerAdress, String customerEmail);
	public boolean updateCustomer(int customerId, String customerName, String customerAdress, String customerEmail) ;
	public boolean deleteCustomer(int customerId);
	public void listCustomer();
}
