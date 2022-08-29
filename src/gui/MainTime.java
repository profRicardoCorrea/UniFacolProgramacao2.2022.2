package gui;

import entidades.Atleta;
import entidades.Funcionario;
import entidades.Pessoa;
import entidades.Time;
import interfaces.ITimeServico;
import servicos.TimeServico;

public class MainTime {
	public static void main(String[] args) {
		
		//Cadastrar Time
		
		Atleta tec =new  Atleta();
		tec.setNome("Prof Fulano");
		Time t= new Time("Vasco", tec);	
		
		TimeServico tservice=new TimeServico();
		tservice.cadastrar(t);
		tservice.listarTodosTimes();
		System.out.println("Código:"+t.getCodigo());
		Time result= tservice.pesquisarPorCodigo(1);
		if(result!=null)
			System.out.println("Time Encontrado:"+tservice.pesquisarPorCodigo(1).getNome());
		result.setNome("VASCO FUTEBOL CLUBE");
		result= tservice.pesquisarPorCodigo(1);
		if(result!=null)
			System.out.println("Time Alterado Encontrado:"+tservice.pesquisarPorCodigo(1).getNome());
		 
		
		
	}
}
