package com.xworkz.service;

import com.xworkz.BioDigitalDto.BioDigitalDto;

public class ServiceImpl implements Service {

	@Override
	public boolean validate(BioDigitalDto dto) {
		
		boolean isAdded = false;
		
		if(dto.getUserName()!=null && dto.getUserName().equals(dto.getUserName())) {
			
			System.out.println("valid userName");
			
			isAdded = true;
		}else {
			
			System.out.println("invalid userName");
		}
		if(dto.getEmail()!=null && dto.getEmail().equals(dto.getEmail())) {
			
			System.out.println("valid email");
			
			isAdded = true;
		}else {
			
			System.out.println("invalid email");
		}
		if(dto.getPhoneNo()!=null && dto.getPhoneNo().equals(dto.getPhoneNo())) {
			
			System.out.println("valid phoneno");
			
			isAdded = true;
		
		}else {
			
			System.out.println("invalid phoneno");
		}
		
		if(dto.getAddress()!=null && dto.getAddress().equals(dto.getAddress())) {
			
			System.out.println("valid address");
			
			isAdded = true;
		
		}else {
			
			System.out.println("invalid address");
		}
		
		if(dto.getPassword()!=null && dto.getPassword().equals(dto.getPassword())) {
			
			System.out.println("valid password");
		
		}else {
			
			System.out.println("invslid password");
		}
		
		return isAdded;
	}

}
