package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.AmazonPayDto;
import com.xworkz.service.AmazonPayServiceImpl;
import com.xworkz.service.AmazonService;

@WebServlet(urlPatterns = "/register")

public class AmazonPayServlet extends HttpServlet {
	
	AmazonPayDto dto = new AmazonPayDto();
	
	AmazonService service = new AmazonPayServiceImpl();
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				
	
	public AmazonPayServlet() {
		
		System.out.println("servlet started");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String name = req.getParameter("UserName");		
		String email = req.getParameter("Email");		
		String phoneNo = req.getParameter("PhoneNo");		
		String address = req.getParameter("Address");		
		String password = req.getParameter("PassWord");	
		String gender = req.getParameter("gender");
		String switchAccount = req.getParameter("switchAccount");
		String paymentOption = req.getParameter("paymentOption");
		
		dto.setUserName(name);
		dto.setEmail(email);
		dto.setPhoneNo(phoneNo);
		dto.setAddress(address);
		dto.setPassword(password);
		dto.setGender(gender);
		dto.setSwitchAccount(switchAccount);
		dto.setPaymentOption(paymentOption);
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneNo);
		System.out.println(address);
		System.out.println(password);
		System.out.println(gender);
		System.out.println(switchAccount);
		System.out.println(paymentOption);
		
		service.validateAndSave(dto);
	
	
		req.setAttribute("d", dto);
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
		requestDispatcher.forward(req, resp);
		
		
	}

}
