package servicos;

import java.util.ArrayList;

import entidades.Time;
import interfaces.ITimeServico;
import repositorios.BasicoRepositorio;
import repositorios.TimeArrayListRepositorio;


public class TimeServico implements ITimeServico{

	private TimeArrayListRepositorio repositorioTime= null;
 
	
	public TimeServico(TimeArrayListRepositorio repositorioTime) {
	 
		this.repositorioTime =  repositorioTime;
	}

	@Override
	public void cadastrar(Time time) {
		
		if((time.getTecnico()!=null )
				&& !time.getTecnico().getNome().isBlank()
				&& !time.getTecnico().getNome().isEmpty() && time.getTecnico().getNome().length()>3) {
			
		
			if(!time.getNome().isBlank() && !time.getNome().isEmpty() 
					&& time.getNome().length()>=4) {
				
				 
				time.setCodigo(repositorioTime.gerarCodigo());
				repositorioTime.salvar(time);
				
			}
			else {
				
				System.out.println("Os dados do time estão incorretos");
			}
			
		}else {
			
			System.out.println("Os dados do tecnico estão incorretos");
		}
		
		
		
	}

	@Override
	public void cadastrar(String nomeTime) {
		// TODO Auto-generated method stub
		
	}
	
	public void teste() {
		System.out.println("alguma coisa");
	}
	public void teste1() {
		System.out.println("alguma coisa");
	}

	@Override
	public void alterar(Time time) {
		if((time.getTecnico()!=null )
				&& !time.getTecnico().getNome().isBlank()
				&& !time.getTecnico().getNome().isEmpty() && time.getTecnico().getNome().length()>3) {
			
		
			if(!time.getNome().isBlank() && !time.getNome().isEmpty() 
					&& time.getNome().length()>=4) {
				
				 
				try {
					repositorioTime.alterar(time);
				} catch (Exception e) {
					System.out.println("Erro ao alterar os dados do time");
				}
				
				
			}
			else {
				
				System.out.println("Os dados do time estão incorretos");
			}
			
		}else {
			
			System.out.println("Os dados do tecnico estão incorretos");
		}
		 
		
	}

	@Override
	public ArrayList<Time> persquisar(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void excluir(Time time) {
		String foiremovido="Time Não removido!";
		if(time.getTecnico()==null) {
			Time timeResult=repositorioTime.pesquisarPorCodigo(time.getCodigo());
			if(timeResult!=null)
				repositorioTime.excluir(timeResult);				
				foiremovido="Time removido!";
			}
		 
		System.out.println(foiremovido);
		
	}
	
	public void listarTodosTimes() {
		 
		for (Time time : this.repositorioTime.listarTodos()) {
			 System.out.println("Nome do Time:"+time.getNome());
		}
	}
	 
	public Time pesquisarPorCodigo(int codigoTime) {
		
		if(codigoTime>0)
			return repositorioTime.pesquisarPorCodigo(codigoTime);
		 
			
		System.out.println("Código Inválido");
		return null;
		 
			
	}

	 
	

}
