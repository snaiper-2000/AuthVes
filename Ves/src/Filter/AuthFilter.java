package Filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/AuthFilter")
public class AuthFilter implements Filter {

	@Override
	public void destroy() {
			
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
         
        String uri = req.getRequestURI();
        //this.context.log("Requested Resource::"+uri);
         
        HttpSession session = req.getSession(false);
         
        if(session == null && !(uri.endsWith("html") || uri.endsWith("LoginServlet"))){
            //this.context.log("Unauthorized access request");
            res.sendRedirect("index.html");
        }else{
            // pass the request along the filter chain
        	filterChain.doFilter(request, response);
        }
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
		//this.context = fConfig.getServletContext();
        //this.context.log("AuthenticationFilter initialized");
		
	}

}
