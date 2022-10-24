package br.futebolonline.interfaces.servico;

import java.util.Date;

import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.JogadorStatusEnum;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.enums.SexoEnum;
import br.futebolonline.enums.TipoFuncionarioEnum;

public interface IAtletaServico {
	void cadastrar(String nome, String cpf, Date dtNascimento, SexoEnum sexoEnum, GeneroEnum generoEnum, int matricula,
			Date dtContratacao, Date dtDemissao, Date dtRenovacao, TipoFuncionarioEnum tipoFuncionario,
			PosicaoJogadorEnum posicaoJogadorEnum, JogadorStatusEnum jogadorStatusEnum, long timeId);

}
