package br.futebolonline.servicos;

import java.util.Date;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Funcionario;
import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;
import br.futebolonline.interfaces.servico.IAtletaServico;
import br.futebolonline.interfaces.servico.IFuncionarioServico;
import br.futebolonline.repositorios.AtletaRepositorio;
import br.futebolonline.repositorios.FuncionarioRepositorio;
import br.futebolonline.repositorios.TimeMySqlRepositorio;

public class FuncionarioServico implements IFuncionarioServico {

	public void cadastrar(String nome, String cpf, Date dtNascimento, SexoEnum sexoEnum, GeneroEnum generoEnum,
			int matricula, Date dtContratacao, Date dtDemissao, Date dtRenovacao, TipoFuncionarioEnum tipoFuncionario,
			float salario) {
		try {

			Funcionario  funcionario = new Funcionario(nome, cpf);
			funcionario.setDataContratacao(dtContratacao);
			//funcionario.setDataDemissao(dtDemissao);
			funcionario.setDataNascimento(dtNascimento);
			//funcionario.setDataRenovacao(dtRenovacao);
			funcionario.setSexo(sexoEnum);
			funcionario.setGenero(generoEnum);
			funcionario.setMatricula(matricula);
			funcionario.setTipoFuncionario(tipoFuncionario);
			funcionario.setSalario(salario);
			 

			FuncionarioRepositorio.getInstance().salvar(funcionario);
		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}

	}

}
