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
		Customer customer = checkCustomer(id);//���̵� �ִ��� Ȯ���Ѵ�
		
		if (customer != null) {  //���̵� ������ 
			if (customer.getPassword().equals(password)){ //�׿� �ش��ϴ� ��й�ȣ�� �´��� Ȯ���Ѵ�
				return customer; //���̵�,����� �˸��� 
			}
			else{
				return null; //���̵� ������ ����� �ȸ��� null
			}
		} //���̵� �ʿ� ������ �׳� null
		else
			return null;
	}
}