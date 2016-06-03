package member;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Service service = new ServiceImple();
		String url = request.getParameter("type");
		
		if(url.equals("login")){
			
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
