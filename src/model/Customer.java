package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor

public class Customer {	
	
	private String id;
	private String password;
	private String name;
	private String gender;
	private String email;
		
}
