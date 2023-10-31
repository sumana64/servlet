package com.xworkz.service;

import com.xworkz.dto.GrowwDto;

public class GrowwServiceImpl implements GrowwService {

	@Override
	public boolean validate(GrowwDto dto) {
		// TODO Auto-generated method stub
		boolean isAdded = false;
		if(dto.getName()!=null && dto.getName().equals(dto.getName())) {
			
			System.out.println("valid userName");
			isAdded = true;
		}else {
			
			System.out.println("invalid userName");
		}
		
		if(dto.getPhoneNo()!=null && dto.getPhoneNo().equals(dto.getPhoneNo())) {
			
			System.out.println("valid phoneNo");
			
			isAdded = true;
		}else {
			
			System.out.println("invalid phoneNo");
		}
		
		if(dto.getEmail()!=null && dto.getEmail().equals(dto.getEmail())) {
			
			System.out.println("valid email");
			
			isAdded= false;
		}else {
			
			System.out.println("invalid email");
		}
		
		if(dto.getAddress()!=null && !dto.getAddress().isEmpty()) {
			
			System.out.println("valid address");
			
			isAdded = false;
		}else {
			
			System.out.println("invalid address");
		}
		
		if(dto.getPassword()!=null && !dto.getPassword().isEmpty()) {
			
			System.out.println("valid password");
			
			isAdded = false;
		}else {
			
			System.out.println("invalid password");
		}
		
		System.out.println("validated successfully");
				
		return isAdded;
	}

}
