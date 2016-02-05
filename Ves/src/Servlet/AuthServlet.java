package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public AuthServlet() {
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String surname = request.getParameter("surname");
		String name = request.getParameter("name");
		String middleName = request.getParameter("middleName");
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String mobileTelephone = request.getParameter("mobileTelephone");
		String email = request.getParameter("email");
		
		if(surname == null){
			RequestDispatcher dispatcher = request.getRequestDispatcher("/reg.jsp");                                   
            request.setAttribute("message", "Вы не ввели Фамилию пользователя.");                                       
            dispatcher.forward(request, response); 
		}
	}

}
