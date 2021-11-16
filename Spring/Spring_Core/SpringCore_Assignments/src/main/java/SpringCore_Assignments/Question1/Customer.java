package SpringCore_Assignments.Question1;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {

	private int customerID;
	private String customerName;
	private long customerContact;
//	@Autowired
	private Address customerAddress;
	
	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + "]";
	}

	public Customer() {
		
	}
	
	public Customer(int customerID, String customerName, long customerContact, Address customerAddress) {
		super();
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public long getCustomerContact() {
		return customerContact;
	}

	public Address getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}

	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}

	public void display() {
		System.out.println("Customer Details: \n\nID: " + getCustomerID() + "\nCustomer Name: " + getCustomerName() + "\nContact: " + getCustomerContact() + "\n\nAddress");
      	getCustomerAddress().displayAddress();
	}

	
}
