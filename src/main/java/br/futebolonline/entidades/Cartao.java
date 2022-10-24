package br.futebolonline.entidades;

import java.io.Serializable; 
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.futebolonline.enums.CartoesEnum;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

 
@Entity
public class Cartao  extends EntidadeBasica implements Serializable{ 
	private static final long serialVersionUID = 1087297295945517459L;
	
	@Column( nullable = false)
	@Enumerated(EnumType.STRING)
	private CartoesEnum cartao;
	@Column( nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataAplicacao;	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fimAplicacao;
	private float valorMulta;
	@ManyToMany(cascade = CascadeType.ALL)
	  @JoinTable(name="CARTAO_ATLETA",
	             joinColumns={@JoinColumn(name="cartao_codigo")},
	             inverseJoinColumns={@JoinColumn(name="funcionario_codigo")})
	private List<Atleta> atletas ;
	
	
	public List<Atleta> getAtletas() {
		return atletas;
	}
	public void setAtletas(List<Atleta> atletas) {
		this.atletas = atletas;
	}
	public CartoesEnum getCartao() {
		return cartao;
	}
	public void setCartao(CartoesEnum cartao) {
		this.cartao = cartao;
	}
	public Date getDataAplicacao() {
		return dataAplicacao;
	}
	public void setDataAplicacao(Date dataAplicacao) {
		this.dataAplicacao = dataAplicacao;
	}
	public Date getFimAplicacao() {
		return fimAplicacao;
	}
	public void setFimAplicacao(Date fimAplicacao) {
		this.fimAplicacao = fimAplicacao;
	}
	public float getValorMulta() {
		return valorMulta;
	}
	public void setValorMulta(float valorMulta) {
		this.valorMulta = valorMulta;
	}
	

}
