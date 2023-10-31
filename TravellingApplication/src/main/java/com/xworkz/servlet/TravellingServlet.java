package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="travelling")
public class TravellingServlet extends HttpServlet{
	
	public TravellingServlet() {
		
		System.out.println("servlet is started");
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String emailId = req.getParameter("emailId");
		int number = Integer.parseInt(req.getParameter("number"));
		String from = req.getParameter("from");
		String to = req.getParameter("to");
		
		if(from.equals("bengaluru")&& to.equals("chennai")) {
			String distance = "333.1km";
			req.setAttribute("d", distance);	
		}else if(from.equals("bengaluru")&& to.equals("mumbai")) {
			String distance = "985.3km";
			req.setAttribute("d", distance);
		}else {
			
			req.setAttribute("msg", "distance not found");
		}
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
		requestDispatcher.forward(req, res);
			

		
		
		
		
		
	}
		

}
