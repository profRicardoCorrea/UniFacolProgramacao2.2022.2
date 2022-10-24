package br.futebolonline.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.futebolonline.entidades.Time;
import br.futebolonline.repositorios.TimeMySqlRepositorio;
 

@WebServlet("/TimeListServlet")
public class TimeListServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {  
	     response.setContentType("text/html");  
	     PrintWriter out=response.getWriter(); 
	     try {
		    
		      
		     out.println("<a href='index.html'>Add New Time</a>");  
		     out.println("<h1>Lista de Times</h1>");  
		       
		     
		     List<Time> times=TimeMySqlRepositorio.getInstance().listarTodos();
		     out.print("<table border='1' width='100%'");  
		     out.print("<tr><th>Id</th><th>NOME</th><th>CPF</th><th>Email</th><th>Edit</th><th>Delete</th></tr>");  
		     System.out.println("nome :: " + times.size());
		     for(Time e:times){  
		      out.print("<tr><td>"+e.getCodigo()+"</td><td>"+e.getNome()+"</td><td>"+e.getTecnico()+"</td> <a href='EditServlet?id="+e.getCodigo()+
		    		  "'>edit</a></td><td><a href='DeleteServlet?id="+e.getCodigo()+"'>delete</a></td></tr>");  
		     }  
		     out.print("</table>");  
		       
		     out.close(); 
	     } catch (Exception e) {
				System.out.println("Error - Conversao indisponivel:"+e.getMessage());
		}
		finally {
		      System.out.println("OPERACAO FINALIZADA");
	    }
 } 
    
    
}
