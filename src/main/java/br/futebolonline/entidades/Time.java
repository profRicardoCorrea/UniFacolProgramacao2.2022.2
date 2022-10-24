package br.futebolonline.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.futebolonline.enums.TimeStatusEnum;

 


 
@Entity
public class Time extends EntidadeBasica implements Serializable {	 
	private static final long serialVersionUID = -7134297171378830526L;
	
	@Column(length = 50, nullable = false)
	private String nome;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCriacao;
	@OneToOne(cascade=CascadeType.ALL)
	private Atleta tecnico;
	@OneToMany(mappedBy = "time", cascade = CascadeType.ALL)
	private List<Atleta> jogadores ;
	@Enumerated(EnumType.STRING)
	private TimeStatusEnum status;
	public Time(String nome) {
		this.nome=nome;
	}
	
	public Time(String nome,Atleta tecnico) {
		this.nome=nome;
		this.tecnico= tecnico;
	}
	public Time() {
		
	}
	
	
	
	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public void setJogadores(List<Atleta> jogadores) {
		this.jogadores = jogadores;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Atleta getTecnico() {
		return tecnico;
	}
	public void setTecnico(Atleta tecnico) {
		this.tecnico = tecnico;
	}
	public List<Atleta> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Atleta> jogadores) {
		this.jogadores = jogadores;
	}

	public TimeStatusEnum getStatus() {
		return status;
	}

	public void setStatus(TimeStatusEnum status) {
		this.status = status;
	}
	
	
	
	

}
