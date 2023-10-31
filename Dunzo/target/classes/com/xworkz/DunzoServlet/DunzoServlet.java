package com.xworkz.DunzoServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/register")
public class DunzoServlet extends HttpServlet {
	
	public DunzoServlet() {
		
		System.out.println("servlet started");
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String name = req.getParameter("UserName");		
		String email = req.getParameter("Email");		
		String phoneNo = req.getParameter("PhoneNo");		
		String address = req.getParameter("Address");		
		String password = req.getParameter("PassWord");	
		
		
		resp.setContentType("html"); //to make visible client from backend
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Registration done successfully</h1>");
		writer.println("<htlml>");
		writer.println("<head>");
		writer.println("<title>");
		
		writer.println("</title>");
		writer.println("</head>");
		writer.println("<body>");
		
		writer.println("<h1>User Details</h1>");
		
		writer.println("<h2>"+name+"</h2>");
		writer.println("<h2>"+email+"</h2>");
		writer.println("<h2>"+phoneNo+"</h2>");
		writer.println("<h2>"+address+"</h2>");
		
		writer.println("</body>");

		writer.println("<htlml>");
		
		
		
	}


}
