package br.futebolonline.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.futebolonline.enums.GeneroEnum;
import br.futebolonline.enums.SexoEnum;

@Entity
public abstract class Pessoa extends EntidadeBasica  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8572298885247477868L;
	@Column(length = 150, nullable = false)
	private String nome;
	@Column(length = 11, nullable = false)
	private String cpf;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataNascimento;
	@Enumerated(EnumType.STRING)
	private SexoEnum sexo;
	@Enumerated(EnumType.STRING)
	private GeneroEnum genero;

	public Pessoa(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
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

	public GeneroEnum getGenero() {
		return genero;
	}

	public void setGenero(GeneroEnum genero) {
		this.genero = genero;
	}

}
