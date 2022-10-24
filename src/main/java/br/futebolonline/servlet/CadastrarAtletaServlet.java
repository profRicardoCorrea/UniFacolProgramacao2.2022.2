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

import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TimeStatusEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.repositorios.TimeMySqlRepositorio;
import br.futebolonline.servicos.AtletaServico;
import br.futebolonline.util.DatetimeExtensions;

/**
 * Servlet implementation class CadastrarAtletaServlet
 */
@WebServlet("/CadastrarAtleta")
public class CadastrarAtletaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CadastrarAtletaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 
			ArrayList<String> posicaoJogador = new ArrayList<String>();
			for (PosicaoJogadorEnum posicao : PosicaoJogadorEnum.values()) {				 
				posicaoJogador.add(posicao.getDescricao());
			}
			
			ArrayList<String> jogadorStatus = new ArrayList<String>();
			for (JogadorStatusEnum posicao : JogadorStatusEnum.values()) {				 
				jogadorStatus.add(posicao.getDescricao());
			}
			
			 
			request.setAttribute("listPosicaoJogador", posicaoJogador);
			request.setAttribute("listJogadorStatus", jogadorStatus);
			request.setAttribute("listTimes", TimeMySqlRepositorio.getInstance().listarTodos());
			RequestDispatcher dispatcher = request.getRequestDispatcher("./form_atleta.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try {
			
		
		String nome = request.getParameter("nome");
		String cpf = request.getParameter("cpf");
		Date dtNascimento = DatetimeExtensions.toDate(request.getParameter("dt_nascimento"));
		SexoEnum sexoEnum = SexoEnum.getEnum(request.getParameter("sexo"));
		GeneroEnum generoEnum = GeneroEnum.getEnum(request.getParameter("genero"));
		int matricula=Integer.parseInt(request.getParameter("matricula"));
		Date dtContratacao = DatetimeExtensions.toDate(request.getParameter("dt_contratacao"));
		Date dtDemissao = DatetimeExtensions.toDate(request.getParameter("dt_demissao"));
		Date dtRenovacao = DatetimeExtensions.toDate(request.getParameter("dt_renovacao"));
		TipoFuncionarioEnum tipoFuncionario = TipoFuncionarioEnum.getEnum(request.getParameter("tipo_funcionario"));
		PosicaoJogadorEnum posicaoJogadorEnum = PosicaoJogadorEnum.getEnum(request.getParameter("posicao_jogador"));
		JogadorStatusEnum jogadorStatusEnum = JogadorStatusEnum.getEnum(request.getParameter("status_jogador"));
		long timeId = Long.parseLong(request.getParameter("time"));
		
		AtletaServico atletaServico=new AtletaServico();
		atletaServico.cadastrar(nome, cpf, dtNascimento, sexoEnum, generoEnum, matricula, dtContratacao, dtDemissao, dtRenovacao, tipoFuncionario, posicaoJogadorEnum, jogadorStatusEnum, timeId);
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		 
		
		doGet(request, response);
	}

}
