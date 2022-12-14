package interfaces;

import java.util.ArrayList;

 

public interface IBasicoRepositorio<Entidade> {
	public void salvar(Entidade et);
	public void alterar(Entidade et); 
	public ArrayList<Entidade> listarTodos();
	public Entidade listarPorCodigo(int condigo);
	public void excluir(Entidade et);
}
