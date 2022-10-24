package  br.futebolonline.repositorios;

import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.futebolonline.entidades.Funcionario;
import br.futebolonline.entidades.Pessoa;
import br.futebolonline.interfaces.repositorio.IBasicoRepositorio;
public class FuncionarioRepositorio  implements IBasicoRepositorio<Funcionario> {
	
	private static FuncionarioRepositorio instance;
    protected EntityManager entityManager;
    
    public static FuncionarioRepositorio getInstance(){
        if (instance == null){
           instance = new FuncionarioRepositorio();
        }

        return instance;
      }

      private FuncionarioRepositorio() {
        entityManager = getEntityManager();
      }
      private EntityManager getEntityManager() {
          EntityManagerFactory factory =
          Persistence.createEntityManagerFactory("futebbol_online_persistencia");
          if (entityManager == null) {
            entityManager = factory.createEntityManager();
          }

          return entityManager;
         }
      
 
	public void salvar(Funcionario funcionario) {
		try {
			 
            entityManager.getTransaction().begin();
            entityManager.persist(funcionario);
            entityManager.getTransaction().commit();
            System.out.println("AQUI:"  );
         } catch (Exception ex) {
        	 System.out.println("Error:" + ex.getMessage());
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

 
	public void alterar(Funcionario funcionario) {
		try {
            entityManager.getTransaction().begin();
            entityManager.merge(funcionario);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

	 
	@SuppressWarnings("unchecked")
 
	public ArrayList<Funcionario> listarTodos() {
		return (ArrayList<Funcionario>)entityManager.createQuery("FROM " +Pessoa.class.getName()).getResultList();
	}

	 
	public void excluir(Funcionario funcionario) {
		try {
            entityManager.getTransaction().begin();
            funcionario = entityManager.find(Funcionario.class, funcionario.getCodigo());
            entityManager.remove(funcionario);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

 
	public Funcionario listarPorCodigo(long condigo) {
		 return entityManager.find(Funcionario.class, condigo);
	 
	}

 
	 
	 
	public void excluirPorCodigo(long condigo) {
		 try {
			 Funcionario funcionario = listarPorCodigo(condigo);
	            excluir(funcionario);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }
		
	}
 

	 
}
