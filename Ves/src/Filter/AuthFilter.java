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
        
        String uriPath = req.getRequestURI().substring(req.getContextPath().length()); //�������� ���� �� ��������
        System.out.println(uriPath);
        //this.context.log("Requested Resource::"+uri);
         
        HttpSession session = req.getSession(false);
        
        if ("reg.jsp".equals(uriPath)/* ||  "logout.jsp".equals(uriPath)*/) {
        	
        	res.sendRedirect("reg.jsp");
       // 	break;
        	filterChain.doFilter(request, response);
         
        }
        if(session == null && !(uri.endsWith("jsp") || uri.endsWith("LoginServlet"))){
        	
        	//if ("/reg.jsp".equals(uriPath) ||  "logout.jsp".equals(uriPath)) {
           //filterChain.doFilter(request, response);  // �������� ��������� ������.
            
            //this.context.log("Unauthorized access request");
            res.sendRedirect("index.jsp");
           
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
