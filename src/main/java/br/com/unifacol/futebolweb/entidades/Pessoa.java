package br.com.unifacol.futebolweb.entidades;

import java.util.Date;

import br.com.unifacol.futebolweb.enums.SexoEnum;

public  abstract class Pessoa extends EntidadeBasica {
	private String nome;
	private String cpf;
	private Date dataNascimento;
	private SexoEnum sexo;
	
	public Pessoa(String nome, String cpf) {
		this.nome=nome;
		this.cpf=cpf;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public SexoEnum getSexo() {
		return sexo;
	}
	public void setSexo(SexoEnum sexo) {
		this.sexo = sexo;
	}
	
	
	 

}
