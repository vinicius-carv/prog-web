

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletDatahora
 */
@WebServlet("/ServletDatahora")
public class ServletDatahora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy - hh:mm:ss");
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDatahora() {
        super();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void init() throws ServletException {
    	// TODO Auto-generated method stub
    	super.init();
    	log("Servlet iniciado as: " + format.format(new Date()));
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter saida = response.getWriter();
    	saida.write("<HTML><BODY>Olá a data/hora atual é: ");
    	saida.write(format.format(new Date()));
    	saida.write("</BODY><HTML>");
    	saida.close();
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	PrintWriter saida = response.getWriter();
    	saida.write("<HTML><BODY>Olá a data/hora atual é: ");
    	saida.write(format.format(new Date()));
    	saida.write("</BODY><HTML>");
    	saida.close();
    }
    @Override
    public void destroy() {
    	log("Servlet finalizado as: " + format.format(new Date()));
    	super.destroy();
    }
}
