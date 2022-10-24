package br.futebolonline.servicos;

import java.util.ArrayList;
import java.util.Date;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Funcionario;
import br.futebolonline.entidades.Time;
import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TimeStatusEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.interfaces.servico.IAtletaServico;
import br.futebolonline.interfaces.servico.IFuncionarioServico;
import br.futebolonline.interfaces.servico.ITimeServico;
import br.futebolonline.repositorios.AtletaRepositorio;
import br.futebolonline.repositorios.FuncionarioRepositorio;
import br.futebolonline.repositorios.TimeMySqlRepositorio;

public class TimeServico implements ITimeServico {

	public void cadastrar(Time time) {
		// TODO Auto-generated method stub
		
	}

	public void cadastrar(String nome, int idTecnico, Date dataCriacao, TimeStatusEnum statusEnum) {
		try {
			Atleta tecnico=null;
			if(idTecnico>0)
				tecnico=AtletaRepositorio.getInstance().listarPorCodigo(idTecnico);
				
			Time novoTime= new Time(nome, dataCriacao, tecnico, null, statusEnum);
			TimeMySqlRepositorio.getInstance().salvar(novoTime);
			System.out.println("----cvd");
		} catch (Exception e) {
			System.out.println("Error:"+this.getClass()+" - "+e.getMessage());
		}
		
		
	}

	public void alterar(Time time) {
		// TODO Auto-generated method stub
		
	}

	public ArrayList<Time> persquisar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	public void excluir(Time time) {
		// TODO Auto-generated method stub
		
	}



	

	 

}
