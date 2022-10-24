package br.futebolonline.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.futebolonline.entidades.Funcionario;
import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.interfaces.servico.IFuncionarioServico;
import br.futebolonline.repositorios.TimeMySqlRepositorio;
import br.futebolonline.servicos.AtletaServico;
import br.futebolonline.servicos.FuncionarioServico;
import br.futebolonline.util.DatetimeExtensions;

/**
 * Servlet implementation class CadastrarFuncionarioServlet
 */
@WebServlet("/CadastrarFuncionario")
public class CadastrarFuncionarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastrarFuncionarioServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList<String> tipoFuncionario = new ArrayList<String>();
		for (TipoFuncionarioEnum posicao : TipoFuncionarioEnum.values()) {
			tipoFuncionario.add(posicao.getDescricao());
		}
		ArrayList<String> sexos = new ArrayList<String>();
		for (SexoEnum sexo : SexoEnum.values()) {
			sexos.add(sexo.getDescricao());
		}
		ArrayList<String> generos = new ArrayList<String>();
		for (GeneroEnum genero : GeneroEnum.values()) {
			generos.add(genero.getDescricao());
		}
		request.setAttribute("listTipoFuncionario", tipoFuncionario);
		request.setAttribute("listSexo", sexos);
		request.setAttribute("listGenero", generos);
		RequestDispatcher dispatcher = request.getRequestDispatcher("./form_funcionario.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			System.out.println(">>"+request.getParameter("dt_nascimento"));
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			Date dtNascimento = DatetimeExtensions.toDate(request.getParameter("dt_nascimento"));
			SexoEnum sexoEnum = SexoEnum.getEnum(request.getParameter("sexo"));
			GeneroEnum generoEnum = GeneroEnum.getEnum(request.getParameter("genero"));
			int matricula = Integer.parseInt(request.getParameter("matricula"));
			Date dtContratacao = DatetimeExtensions.toDate(request.getParameter("dt_contratacao"));
			//Date dtDemissao = DatetimeExtensions.toDate(request.getParameter("dt_demissao"));
			//Date dtRenovacao = DatetimeExtensions.toDate(request.getParameter("dt_renovacao"));
			TipoFuncionarioEnum tipoFuncionario = TipoFuncionarioEnum.getEnum(request.getParameter("tipo_funcionario"));
			float salario = Float.parseFloat(request.getParameter("salario"));
			FuncionarioServico funcServico = new FuncionarioServico();
			funcServico.cadastrar(nome, cpf, dtNascimento, sexoEnum, generoEnum, matricula, dtContratacao, null,
					null, tipoFuncionario, salario);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR:"+e.getMessage());
		}
		doGet(request, response);
	}

}
