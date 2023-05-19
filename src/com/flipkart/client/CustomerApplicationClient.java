/**
 * 
 */
package com.flipkart.client;

import com.flipkart.business.CustomerBusiness;
import com.flipkart.business.CustomerInterface;

/**
 * @author prashant.k5
 *
 */
public class CustomerApplicationClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create the instance of customer business lass here
		
//		CustomerBusiness business = new CustomerBusiness();
		CustomerInterface business = new CustomerBusiness();
		business.createCustomer();
		business.listCustomer();
		System.out.println(business.deleteCustomer(101));
		System.out.println(business.updateCustomer(101));
	}

}
