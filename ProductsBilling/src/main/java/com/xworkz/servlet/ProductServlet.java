package com.xworkz.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/generateBilling")
public class ProductServlet extends HttpServlet {
	
	public ProductServlet() {
		
		System.out.println("servlet is started");
		
	}
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		String name = req.getParameter("name");
		String emailId = req.getParameter("emailId");
		int number = Integer.parseInt(req.getParameter("number"));
		String productName = req.getParameter("productName");
		int quantity = Integer.parseInt(req.getParameter("quantity"));
		String productType = req.getParameter("productType");
		
		if(productType.equals("grocery")) {
			double bill =(quantity*20);
			req.setAttribute("n", name);
			req.setAttribute("e", emailId);
			req.setAttribute("nb", number);
			req.setAttribute("b", bill);
			req.setAttribute("p", productName);
			req.setAttribute("t", productType);
			
		}else if(productType .equals("electric")){
			double bill = (quantity*30);
			req.setAttribute("n", name);
			req.setAttribute("e", emailId);
			req.setAttribute("nb", number);
			req.setAttribute("b", bill);
			req.setAttribute("p", productName);
		}else {
			req.setAttribute("msg", "product is not available");
		}
		
		
		RequestDispatcher requestDispatcher = req.getRequestDispatcher("Success.jsp");
		requestDispatcher.forward(req, res);
			
		
	}

}
