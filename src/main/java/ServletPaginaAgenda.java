

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletPaginaAgenda
 */
@WebServlet("/ServletPaginaAgenda")
public class ServletPaginaAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPaginaAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<HTML><Body>");
		saida.write("<form action=ServletAgenda method=post>");
		saida.write("<label for=\"name\">Nome</label>");
		saida.write("<input id=\"name\" name=\"name\" type=\"text\">");
		saida.write("<label for=\"tel\">Telefone</label>");
		saida.write("<input id=\"tel\" name=\"tel\" type=\"text\">");
		saida.write("<label for=\"dta_nasc\">Data Nascimento</label>");
		saida.write("<input id=\"dta_nasc\" name=\"nasc\" type=\"text\">");
		saida.write("<input type=\"submit\">");
		saida.write("</form>");
		saida.write("</Body></HTML>");
		saida.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
