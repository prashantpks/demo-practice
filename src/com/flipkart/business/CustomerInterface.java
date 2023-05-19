/**
 * 
 */
package com.flipkart.business;

/**
 * @author prashant.k5
 *
 */
public interface CustomerInterface {
	public void createCustomer();
	public int updateCustomer(int id) ;
	public boolean deleteCustomer(int id);
	public void listCustomer();
}
