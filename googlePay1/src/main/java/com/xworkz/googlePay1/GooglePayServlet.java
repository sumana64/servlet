package com.xworkz.googlePay1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.dto.GooglePayDto;
import com.xworkz.service.GooglePayService;
import com.xworkz.service.GooglePayServiceImpl;

@WebServlet(urlPatterns = "/register")
public class GooglePayServlet extends HttpServlet {
	
	GooglePayDto dto = new GooglePayDto();
	
	GooglePayService service = new GooglePayServiceImpl();
	
	public GooglePayServlet() {
		
		System.out.println("servlet started");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		String name = req.getParameter("UserName");		
		String email = req.getParameter("Email");		
		String phoneNo = req.getParameter("PhoneNo");		
		String address = req.getParameter("Address");		
		String password = req.getParameter("PassWord");		
		
		dto.setName(name);
		System.out.println(name);
		
		dto.setEmail(email);
		System.out.println(email);
		
		dto.setPhoneNo(phoneNo);
		System.out.println(phoneNo);
		
		dto.setAddress(address);
		System.out.println(address);
		
		dto.setPassword(password);
		System.out.println(password);
		
		service.validate(dto);
		
		req.setAttribute("d", dto);
		RequestDispatcher dispatcher = req.getRequestDispatcher("Success.jsp");
		dispatcher.forward(req, resp);
		
		


		
		
		
	}

}
