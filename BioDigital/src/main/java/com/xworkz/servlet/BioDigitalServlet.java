package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.BioDigitalDto.BioDigitalDto;
import com.xworkz.service.Service;
import com.xworkz.service.ServiceImpl;

@WebServlet(urlPatterns = "/register")
public class BioDigitalServlet extends HttpServlet {
	
	BioDigitalDto dto = new BioDigitalDto();
	
	Service service = new ServiceImpl();
	
	public BioDigitalServlet() {
		
		System.out.println("servlet started");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String name = req.getParameter("userName");		
		String email = req.getParameter("Email");		
		String phoneNo = req.getParameter("PhoneNo");		
		String address = req.getParameter("Address");		
		String password = req.getParameter("PassWord");	
		
		dto.setUserName(name);
		dto.setEmail(email);
		dto.setPhoneNo(phoneNo);
		dto.setAddress(address);
		dto.setPassword(password);
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(phoneNo);
		System.out.println(address);
		System.out.println(password);
		
		service.validate(dto);
		
		
		System.out.println(req.getLocalName());
		System.out.println(name);
		
		req.setAttribute("user",name);
		req.setAttribute("email", email);
		req.setAttribute("phone", phoneNo);
		req.setAttribute("address", address);
        req.setAttribute("pass", password);
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("Success.jsp");
		requestDispatcher.forward(req, resp);
		
		
		
	}

}
