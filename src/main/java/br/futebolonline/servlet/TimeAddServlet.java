package br.futebolonline.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.futebolonline.entidades.Time;
import br.futebolonline.repositorios.TimeMySqlRepositorio;
 

@WebServlet("/TimeAddServlet")
public class TimeAddServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	
    	
    	
    	String nome = req.getParameter("nome");
        String tecnico = req.getParameter("tecnico");
        
    	
        System.out.println("nome :: " + nome);
    	 
    	
    	try {
    		  Time time=new Time(nome, tecnico, true);
    		  TimeMySqlRepositorio.getInstance().salvar(time);
    		  
			
		} catch ( Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			 System.out.println(e);
			
		}

        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Time Salvo</h1>");
        printWriter.print("<p> nome :: " + nome + "</p>");
        printWriter.print("<p> Tecnico :: " + tecnico  + "</p>");
        
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

        
    }
    
    
}
