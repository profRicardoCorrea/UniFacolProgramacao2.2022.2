package br.futebolonline.entidades;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

//@SuppressWarnings("serial") // anota��o do java 
@MappedSuperclass // anota��o do hibernate
public abstract class EntidadeBasica {
	@Id// anota��o do hibernate anotations
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codigo;

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	
	

}
