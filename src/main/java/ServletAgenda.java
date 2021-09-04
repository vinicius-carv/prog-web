

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * Crie um Servlet chamado ServletAgenda que receba par�metros de uma entrada de agenda 
	 * (nome, telefone do usu�rio e data de nascimento) e que retorna uma p�gina HTML 
	 * apresentando os dados recebidos. Crie tamb�m uma classe chamada ServletPaginaAgenda
	 *  que retorna uma p�gina HTML com um formul�rio para enviar os dados para o ServletAgenda criado anteriormente.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		String nome = "Vinicius";
		int telefone = 996696051;
		String dta_nascimento = "25/11/2002";
		
		
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		String nome = request.getParameter("name");
		String telefone = request.getParameter("tel");
		String nascimento = request.getParameter("nasc");
		
		saida.write("<HTML><Body>");
		saida.write("<h1 style=text-align:center;>Agenda</h1>");
		saida.write("<div style=display:flex;justify-content:center;align-items:center;>");
		saida.write("<br>Nome: "+ name);
		saida.write("<br>Telefone: "+ tel);
		saida.write("<br>Data de nascimento: "+ nasc);
		saida.write("</div>");
		saida.write("</Body></HTML>");
		saida.close();
	}

}
