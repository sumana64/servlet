package com.xworkz.service;

import com.xworkz.dto.ChametDto;

public class ChametServiceImpl implements ChametService {

	@Override
	public boolean validate(ChametDto dto) {
		boolean isAdded = true;
		if(dto.getName()!=null && !dto.getName().isEmpty()) {
			
			System.out.println("valid username");
			isAdded = true;
		}else {
			
			System.out.println("invalid userName");
		}
		
		if(dto.getEmail()!=null && !dto.getEmail().isEmpty()) {
			
			System.out.println("valid email");
			isAdded = true;
			
		}else {
			
			System.out.println("invalid email");
		}
		
		if(dto.getPhoneNo()!=null && !dto.getPhoneNo().isEmpty()) {
			
			System.out.println("valid phoneno");
			 isAdded = true;
		}else {
			
			System.out.println("invalid phoneNo");
		}
		if(dto.getPassword()!=null && !dto.getPhoneNo().isEmpty()) {
			
			System.out.println("valid phoneNo");
			isAdded = true;
		}else {
			
			System.out.println("invalid phoneNo");
		}
		
		System.out.println("it is validated");
		return isAdded;
	}

}
