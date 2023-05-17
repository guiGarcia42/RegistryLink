package br.fiap.repositorio.controle;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.fiap.repositorio.controle.dao.ClienteDAO;
import br.fiap.repositorio.modelo.Cliente;
import br.fiap.repositorio.modelo.Pessoa_fisica;
import br.fiap.repositorio.modelo.Pessoa_juridica;
import br.fiap.repositorio.util.Util;

/**
 * Servlet implementation class CadastroServlet
 */
@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Util util = new Util();
		ClienteDAO clienteDao = new ClienteDAO();
		String telefone01, telefone02, tp_cliente, email, senha;
		
		senha = util.criptografar(request.getParameter("senha"));
		telefone01 = request.getParameter("telefone01");
		telefone02 = request.getParameter("telefone02");
		tp_cliente = request.getParameter("tp_cliente");
		email = request.getParameter("email");
		
		tp_cliente = request.getParameter("tp_cliente");
		if(tp_cliente.equals("PF")) {
			
			String cpf = request.getParameter("cpf");
			String nm_cliente = request.getParameter("nm_cliente");
			LocalDate dt_nascimento = util.formatarData(request.getParameter("dt_nascimento"));
			String sexo = request.getParameter("sexo");
			String estado_civil = request.getParameter("estado_civil");
			
			clienteDao.inserirPF(new Pessoa_fisica(telefone01, telefone02, tp_cliente, email, senha, cpf, nm_cliente, dt_nascimento, sexo, estado_civil));
		} else {
			
			String cnpj = request.getParameter("cnpj");
			String razao_social = request.getParameter("razao_social");
			String porte = request.getParameter("porte");
			LocalDate dt_abertura_emp = util.formatarData(request.getParameter("dt_abertura_emp"));
			
			clienteDao.inserirPJ(new Pessoa_juridica(telefone01, telefone02, tp_cliente, email, senha, cnpj, razao_social, porte, dt_abertura_emp));
		}
		
		// redireciona para index.jsp
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
		
	}
}
