package com.xworkz.service;

import com.xworkz.dto.AmazonPayDto;

public class AmazonPayServiceImpl implements AmazonService {

	@Override
	public boolean validateAndSave(AmazonPayDto dto) {
		
		boolean isAdded = false;
		boolean userName = false;
		boolean email= false;
		boolean phoneNo = false;
		boolean address= false;
		boolean password= false;
		boolean gender= false;
		boolean switchAccount= false;
		boolean paymentOption = false;
		 
	       if(dto.getUserName()!=null && dto.getUserName().equals(dto.getUserName())) {
	    	         
	    	   System.out.println("validUserName");
	                    isAdded=userName = true;
	       }else {
	    	   
	    	   System.out.println("invalidUserName");
	       }
	       
	       if(dto.getEmail()!=null && dto.getEmail().equals(dto.getEmail())) {
	    	   
	    	   System.out.println("valid email");
	    	             isAdded=email= true;
	       }else {
	    	   
	    	   System.out.println("invalid email");
	       }
	       
	       if(dto.getPhoneNo()!=null && dto.getPhoneNo().equals(dto.getPhoneNo())) {
	    	   
	    	   System.out.println("validPhoneNo");
	    	             isAdded=phoneNo= true;
	      
	       }else {
	    	   
	    	   System.out.println("invalidPhoneNo");
	       }
	       
	       if(dto.getAddress()!=null && dto.getAddress().equals(dto.getAddress())){
	    	   
	    	   System.out.println("validAddress");	
	    	              isAdded=address=true;
	      
	       }else {
	    	   
	    	   System.out.println("invalidAddres");
	       }
		
	       if(dto.getPassword()!=null && dto.getPassword().equals(dto.getPassword())) {
	    	   
	    	  System.out.println("validPassword");
	    	           isAdded=password=true;
	       
	       }else {
	    	   
	    	   System.out.println("invalidPassword");
	    	  
	       }
	       if(dto.getGender()!=null && !dto.getGender().equals(dto.getGender())) {
	    	   
	    	   System.out.println("valid gender");
	    	           isAdded=gender=true;
	    	   
	       }else {
	    	   
	    	   System.out.println("invalid gender");
	       }
	       
	       if(dto.getSwitchAccount()!=null && !dto.getSwitchAccount().isEmpty()) {
	    	   
	    	  System.out.println("yes");
	    	          isAdded=switchAccount=true;
	    	   
	       }else {
	    	   
	    	   System.out.println("No");
	       }
	       
	       if(dto.getPaymentOption()!=null && !dto.getPaymentOption().isEmpty()) {
	    	   
	    	   System.out.println("valid payment option");
	    	        isAdded=paymentOption=true;
	       }else {
	    	   
	    	   System.out.println("invalid payment option");
	       }
		
		return isAdded;
		
	}
	
	
		
	
	
}


