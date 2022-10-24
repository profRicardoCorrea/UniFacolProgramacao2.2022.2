package  br.futebolonline.interfaces.servico;

import java.util.ArrayList;
import java.util.Date;

import br.futebolonline.entidades.Time;
import br.futebolonline.enums.TimeStatusEnum;



public interface ITimeServico {
	public void cadastrar(Time time);
	public void cadastrar(String nome ,int idTecnico,Date dataCriacao,TimeStatusEnum statusEnum);
	public void alterar(Time time);
	public ArrayList<Time> persquisar(String nome);
	public void excluir(Time time);

}
