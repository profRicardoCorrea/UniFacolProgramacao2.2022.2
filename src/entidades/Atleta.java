package entidades;

import java.util.ArrayList;

import enums.CartoesEnum;
import enums.PosicaoJogadorEnum;

public class Atleta extends Funcionario{
	
	private PosicaoJogadorEnum posicao;
	private boolean isTitular;
	private ArrayList<CartoesEnum> cartoes=new ArrayList<>();
	
	public Atleta(String nome, String cpf) {
		super(nome, cpf);
		// TODO Auto-generated constructor stub
	}
	
	public PosicaoJogadorEnum getPosicao() {
		return posicao;
	}
	public void setPosicao(PosicaoJogadorEnum posicao) {
		this.posicao = posicao;
	}
	public boolean isTitular() {
		return isTitular;
	}
	public void setTitular(boolean isTitular) {
		this.isTitular = isTitular;
	}
	public ArrayList<CartoesEnum> getCartoes() {
		return cartoes;
	}
	public void setCartoes(ArrayList<CartoesEnum> cartoes) {
		this.cartoes = cartoes;
	}
	
	

}
