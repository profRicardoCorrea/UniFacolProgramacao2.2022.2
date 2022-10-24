package br.futebolonline.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.futebolonline.enums.TipoFuncionarioEnum;

 
@Entity
public class Funcionario extends Pessoa implements Serializable{	 
	private static final long serialVersionUID = 7705291799444067178L;
	
	private int matricula;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataContratacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataDemissao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataRenovacao;
	@Enumerated(EnumType.STRING)
	private TipoFuncionarioEnum tipoFuncionario;
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
	public TipoFuncionarioEnum getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(TipoFuncionarioEnum tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
 

}
