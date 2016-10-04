package service;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	private Map<String, Customer> customers;
	
	//private ArrayList<Customer> customersList; // mh
	
	private static final CustomerService instance = new CustomerService();
	
	

	private CustomerService() {
		customers = new HashMap<String, Customer>();
		//customersList = new ArrayList<>(); //mh
	}
	
	public static CustomerService getInstance() {
		return instance;
	}

	public void addCustomerService(Customer customer) {
		customers.put(customer.getId(), customer);
		//customersList.add(new Customer(customer.getId(),customer.getPassword(),customer.getName(),customer.getGender(),customer.getEmail()));//mh
	}
	
	public Customer checkCustomer(String id) {
		if (id != null)
			return (customers.get(id.toLowerCase()));
		else
			return null;
	}
	
	public Customer login(String id, String password) {
		Customer customer = checkCustomer(id);//아이디 있는지 확인한다
		
		if (customer != null) {  //아이디가 있으면 
			if (customer.getPassword().equals(password)){ //그에 해당하는 비밀번호가 맞는지 확인한다
				return customer; //아이디,비번이 알맞음 
			}
			else{
				return null; //아이디가 있으나 비번이 안맞음 null
			}
		} //아이디가 맵에 없으면 그냥 null
		else
			return null;
	}
}