package interfaces;

import java.util.ArrayList;

import entidades.Atleta;
import entidades.Time;
import enums.PosicaoJogadorEnum;

public interface IAtletaRepositorio {
	public ArrayList<Atleta> persquisarPorPosicao( PosicaoJogadorEnum posicao);
	public ArrayList<Atleta> persquisarPorCamisaNumero(  int numeroCamisa);

}
