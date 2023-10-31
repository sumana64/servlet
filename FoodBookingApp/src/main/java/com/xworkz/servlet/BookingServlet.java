package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/foodBilling")
public class BookingServlet extends HttpServlet {
	
	public BookingServlet() {
		
		System.out.println("servlet is started");
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String emailId = req.getParameter("emailId");
		int number = Integer.parseInt(req.getParameter("number"));
		String foodName = req.getParameter("foodName");
		String address = req.getParameter("address");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String location = req.getParameter("productType");
		
		if(location.equals("bengaluru")) {
			double bill =(quantity*150)+100;
			req.setAttribute("n", name);
			req.setAttribute("e", emailId);
			req.setAttribute("nb", number);
			req.setAttribute("b", bill);
			req.setAttribute("f", foodName);
			req.setAttribute("a", address);
			
		}else if(location.equals("mysore")){
			double bill = (quantity*200)+200;
			req.setAttribute("n", name);
			req.setAttribute("e", emailId);
			req.setAttribute("nb", number);
			req.setAttribute("f", foodName);
			req.setAttribute("a", address);
			req.setAttribute("b", bill);
			
		}else {
			req.setAttribute("msg", "product is not available");
		}
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(req, res);
	}
}
