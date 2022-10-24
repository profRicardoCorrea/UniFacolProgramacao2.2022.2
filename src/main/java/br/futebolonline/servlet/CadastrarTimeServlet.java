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
import br.futebolonline.repositorios.AtletaRepositorio;
import br.futebolonline.repositorios.TimeMySqlRepositorio;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			 
			ArrayList<String> timeStatusEnum = new ArrayList<String>();
			for (TimeStatusEnum timeStatus : TimeStatusEnum.values()) {				 
				timeStatusEnum.add(timeStatus.getDescricao());
			}			 
			request.setAttribute("listTimeStatus", timeStatusEnum);			 
			request.setAttribute("listTecnicos", AtletaRepositorio.getInstance().listarPorPosicao(PosicaoJogadorEnum.Tecnico));
			RequestDispatcher dispatcher = request.getRequestDispatcher("./form_time.jsp");
			dispatcher.forward(request, response);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("ERROR:"+e.getMessage());
		}
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nome = request.getParameter("nome");
		/*String cpf = request.getParameter("cpf");
		Date dataCriacao = DatetimeExtensions.toDate(request.getParameter("dt_nascimento"));
		SexoEnum sexoEnum = SexoEnum.getEnum(request.getParameter("sexo"));
		GeneroEnum generoEnum = GeneroEnum.getEnum(request.getParameter("genero"));
		int matricula=Integer.parseInt(request.getParameter("matricula"));
		Date dtContratacao = DatetimeExtensions.toDate(request.getParameter("dt_contratacao"));
		Date dtDemissao = DatetimeExtensions.toDate(request.getParameter("dt_demissao"));
		Date dtRenovacao = DatetimeExtensions.toDate(request.getParameter("dt_renovacao"));
		TipoFuncionario tipoFuncionario = TipoFuncionario.getEnum(request.getParameter("tipo_funcionario"));
		PosicaoJogadorEnum posicaoJogadorEnum = PosicaoJogadorEnum.getEnum(request.getParameter("posicao_jogador"));
		JogadorStatusEnum jogadorStatusEnum = JogadorStatusEnum.getEnum(request.getParameter("status_jogador"));
		long timeId = Long.parseLong(request.getParameter("time"));*/
		doGet(request, response);
	}

}
