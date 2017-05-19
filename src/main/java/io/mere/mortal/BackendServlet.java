package io.mere.mortal;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/*"}, loadOnStartup = 1)
public class BackendServlet extends HttpServlet 
{
  @Override 
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException
  {
  	  if ("/oops".equals(request.getRequestURI())) {
  	  	response.sendError(500);
  	  } else {
      	response.getOutputStream().print("This sometimes serves stuff: "+request.getRequestURI());
      }
  }
}
