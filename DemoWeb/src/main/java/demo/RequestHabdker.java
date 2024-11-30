package demo;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/check", loadOnStartup = 1)
public class RequestHabdker extends HttpServlet {
	
	
	@Override
	public void init() {
		System.out.println("Request Handler Object Is Initialized..");
	}
	
	@Override
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("Server Reached..");
		response.getWriter().println("Kavin Successfull....");
	}
}
