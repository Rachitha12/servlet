package servlet_rd_srd.request.dispatcher;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rd")
public class classA extends HttpServlet
{
//
//@WebServlet("/rd")
//public class classA extends GenericServlet
//{
//
//	@Override
//	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException
//	{
//		// TODO Auto-generated method stub
//		String name=req.getParameter("ename");
//		System.out.println("classA name is"+" "+name);
//		
//	RequestDispatcher rd =req.getRequestDispatcher("b");
//	rd.forward(req,res);
//	}
//}
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
//	super.service(req, resp);
//	resp.sendRedirect("http://www.facebook.com");
	resp.sendRedirect("b");
}
}