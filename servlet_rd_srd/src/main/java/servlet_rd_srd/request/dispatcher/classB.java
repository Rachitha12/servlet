package servlet_rd_srd.request.dispatcher;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/b")
public class classB extends GenericServlet

{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("ename");
		System.out.println("classB name is"+" "+name);
		
	}

}
