package br.com.unifacol.futebolweb.entidades;

import java.util.Date;

import br.com.unifacol.futebolweb.enums.TipoFuncionario;

 

public class Funcionario extends Pessoa{
	 
	
	private int matricula;
	private Date dataContratacao;
	private Date dataDemissao;
	private Date dataRenovacao;
	private TipoFuncionario tipoFuncionario;
	private float salario;
	
	public Funcionario(String nome, String cpf) {
		super(nome, cpf);
		
	}
	public int getMatricula() {
		return matricula;
	}
	 
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public Date getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(Date dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public Date getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	public Date getDataRenovacao() {
		return dataRenovacao;
	}
	public void setDataRenovacao(Date dataRenovacao) {
		this.dataRenovacao = dataRenovacao;
	}
	public TipoFuncionario getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(TipoFuncionario tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
 

}
