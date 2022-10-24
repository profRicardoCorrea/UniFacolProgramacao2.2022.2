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

import br.futebolonline.entidades.Atleta;
import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TimeOperacaoEnum;
import br.futebolonline.enums.TimeStatusEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.repositorios.AtletaRepositorio;
import br.futebolonline.repositorios.TimeMySqlRepositorio;
import br.futebolonline.servicos.TimeServico;
import br.futebolonline.util.DatetimeExtensions;

/**
 * Servlet implementation class CadastrarTimeServlet
 */
@WebServlet("/CadastrarTime")
public class CadastrarTimeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadastrarTimeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			System.out.println(">>>" + request.getParameter("op"));
			TimeOperacaoEnum operacao = TimeOperacaoEnum.getEnum(request.getParameter("op"));
			switch (operacao) {
			case cadastrar:
				cadastrar(request, response);
				break;
			case listar:
				listar(request, response);
				break;
			case atualizar:
				atualizar(request, response);
				break;

			default:
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR:2" + e.getMessage());
		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			ArrayList<String> timeStatusEnum = new ArrayList<String>();
			for (TimeStatusEnum timeStatus : TimeStatusEnum.values()) {
				timeStatusEnum.add(timeStatus.getDescricao());
			}
			ArrayList<Atleta> at = AtletaRepositorio.getInstance().listarPorPosicao(PosicaoJogadorEnum.Tecnico);
			for (Atleta atleta : at) {
				System.out.println(">>>" + atleta.getCodigo() + " - " + atleta.getNome());
			}
			request.setAttribute("listTimeStatus", timeStatusEnum);
			request.setAttribute("listTecnicos",
					AtletaRepositorio.getInstance().listarPorPosicao(PosicaoJogadorEnum.Tecnico));
			request.setAttribute("listAtletas", AtletaRepositorio.getInstance().listarTodos());
			RequestDispatcher dispatcher = request.getRequestDispatcher("./form_time.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR:1" + e.getMessage());
		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void listar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			request.setAttribute("listTimes", TimeMySqlRepositorio.getInstance().listarTodos());

			RequestDispatcher dispatcher = request.getRequestDispatcher("./listar_time.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR:1" + e.getMessage());
		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void atualizar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			int idTime = request.getParameter("idTime").length() > 0 ? Integer.parseInt(request.getParameter("idTime"))
					: 0;
			if (idTime > 0) {
				ArrayList<String> timeStatusEnum = new ArrayList<String>();
				for (TimeStatusEnum timeStatus : TimeStatusEnum.values()) {
					timeStatusEnum.add(timeStatus.getDescricao());
				}
				ArrayList<Atleta> at = AtletaRepositorio.getInstance().listarPorPosicao(PosicaoJogadorEnum.Tecnico);
				for (Atleta atleta : at) {
					System.out.println(">>>" + atleta.getCodigo() + " - " + atleta.getNome());
				}
				request.setAttribute("editarTime", TimeMySqlRepositorio.getInstance());
				request.setAttribute("listTimeStatus", timeStatusEnum);
				request.setAttribute("listTecnicos",
						AtletaRepositorio.getInstance().listarPorPosicao(PosicaoJogadorEnum.Tecnico));
				request.setAttribute("listAtletas", AtletaRepositorio.getInstance().listarTodos());
				RequestDispatcher dispatcher = request.getRequestDispatcher("./atualizar_form_time.jsp");
				dispatcher.forward(request, response);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR:1" + e.getMessage());
		}
		// response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String nome = request.getParameter("nome");
			int idTecnico = request.getParameter("tecnico").length() > 0
					? Integer.parseInt(request.getParameter("tecnico"))
					: 0;

			Date dataCriacao = DatetimeExtensions.toDate(request.getParameter("dt_criacao"));

			TimeStatusEnum statusEnum = TimeStatusEnum.getEnum(request.getParameter("status_time"));
			new TimeServico().cadastrar(nome, idTecnico, dataCriacao, statusEnum);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);

	}

}
