package br.futebolonline.servicos;

import java.util.Date;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.interfaces.servico.IAtletaServico;
import br.futebolonline.repositorios.AtletaRepositorio;
import br.futebolonline.repositorios.TimeMySqlRepositorio;

public class AtletaServico implements IAtletaServico{

	public void cadastrar(String nome, String cpf, Date dtNascimento, SexoEnum sexoEnum, GeneroEnum generoEnum,
			int matricula, Date dtContratacao, Date dtDemissao, Date dtRenovacao, TipoFuncionarioEnum tipoFuncionario,
			PosicaoJogadorEnum posicaoJogadorEnum, JogadorStatusEnum jogadorStatusEnum, long timeId) {
		try {
			
			Atleta novoAtleta=new Atleta(nome, cpf);
			novoAtleta.setDataContratacao(dtContratacao);
			novoAtleta.setDataDemissao(dtDemissao);
			novoAtleta.setDataNascimento(dtNascimento);
			novoAtleta.setDataRenovacao(dtRenovacao);
			novoAtleta.setSexo(sexoEnum);
			novoAtleta.setGenero(generoEnum);
			novoAtleta.setMatricula(matricula);
			novoAtleta.setTipoFuncionario(tipoFuncionario);
			novoAtleta.setPosicao(posicaoJogadorEnum);
			novoAtleta.setStatus(jogadorStatusEnum);
			novoAtleta.setTime(TimeMySqlRepositorio.getInstance().listarPorCodigo(timeId));
			
			AtletaRepositorio.getInstance().salvar(novoAtleta);
		} catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
		}
		
	}

}
