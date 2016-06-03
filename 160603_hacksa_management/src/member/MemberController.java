package member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */

public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		
		Service service = new ServiceImple();
		String requestURI = request.getRequestURI();
		String requestString[] = (requestURI.substring(request.getContextPath().length())).split("/");
		String url = requestString[2];
		
		if(url.equals("login")){
			
			
			
			String idCheck = request.getParameter("id");
			int id =0;
			if(idCheck!=null){
				 Integer.parseInt(idCheck);
			}else{
				response.sendRedirect("");
			}
			
			
		}else if(url.equals("logout")){
			
		}else if(url.equals("join")){
		
		}else if(url.equals("editInfo")){
			
		}else if(url.equals("delete")){
			
		}
		
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
