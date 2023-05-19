/**
 * 
 */
package com.flipkart.client;
import java.util.Scanner;
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
		int ch = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Choose any option");
			System.out.println("1. Create customer");
			System.out.println("2. List Customer");
			System.out.println("3. Update Customer");
			System.out.println("4. Remove Customer");
			System.out.println("5. Exit");
			
			ch = sc.nextInt();
			
			switch(ch) {
			case 1: {
				int customerId;
				String customerName, customerAddress, customerEmail;
				
				System.out.println("Enter customer Id");
				customerId = sc.nextInt();
				
				System.out.println("Enter customer Name");
				customerName = sc.next();
				
				System.out.println("Enter customer Address");
				customerAddress = sc.next();
				
				System.out.println("Enter customer email");
				customerEmail = sc.next();
				
				business.createCustomer(customerId, customerName, customerAddress, customerEmail);
				
				System.out.println("Customer Created!");
				break;
			}
			
			case 2: {
				business.listCustomer();
				break;
			}
			
			case 3: {
				int customerId;
				
				System.out.println("Enter customer Id to update");
				customerId = sc.nextInt();
				
				String customerName, customerAddress, customerEmail;
				
				System.out.println("Enter customer Name");
				customerName = sc.next();
				
				System.out.println("Enter customer Address");
				customerAddress = sc.next();
				
				System.out.println("Enter customer email");
				customerEmail = sc.next();
				
				boolean status = business.updateCustomer(customerId, customerName, customerAddress, customerEmail);
				
				if(status) {
					System.out.println("Customer updated successfully");
				}else {
					System.out.println("Cant update customer with given ID");
				}
				
				break;
			}
			
			case 4: {
				int customerId;
				
				System.out.println("Enter customer Id to delete");
				customerId = sc.nextInt();
				
				boolean status = business.deleteCustomer(customerId);
				
				if(status) {
					System.out.println("Customer deleted successfully");;
				}else {
					System.out.println("Cant delete customer with given ID");
				}
				
				break;
			}
			
			case 5: break;
			
			default: System.out.println("Invalid choice");
			
			}
		}while(ch!=5);
		
		
		
	}

}
