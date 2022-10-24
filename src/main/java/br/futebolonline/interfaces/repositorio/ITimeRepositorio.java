package  br.futebolonline.interfaces.repositorio;

import java.util.ArrayList;

import br.futebolonline.entidades.Time;

 

 

public interface ITimeRepositorio {
	 
	public ArrayList<Time> persquisarPorNome(String nome);
	public ArrayList<Time> persquisarClassificacao();
	 
	

}
