

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login  extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)  
	        throws ServletException, IOException {  
	  
	             
	    String n=request.getParameter("username");  
	    String p=request.getParameter("password");  
	          
	    if((n.equals("dipankar") && p.equals("dipankar"))){  
	        response.sendRedirect("welcome.jsp");  
	    }  
	    else{  
	         
	    	 response.sendRedirect("/jsp/error.jsp");
	    }  
	          
	    
     }  

}
