package  br.futebolonline.repositorios;

import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.futebolonline.entidades.Time;
import br.futebolonline.interfaces.repositorio.ITimeRepositorio;
public class TimeMySqlRepositorio implements ITimeRepositorio {
	
	private static TimeMySqlRepositorio instance;
    protected EntityManager entityManager;
    
    public static TimeMySqlRepositorio getInstance(){
        if (instance == null){
           instance = new TimeMySqlRepositorio();
        }

        return instance;
      }

      private TimeMySqlRepositorio() {
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
      
 
	public void salvar(Time time) {
		try {
			System.out.println(time.getNome()+"-"+time.getTecnico());
            entityManager.getTransaction().begin();
            entityManager.persist(time);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

 
	public void alterar(Time time) {
		try {
            entityManager.getTransaction().begin();
            entityManager.merge(time);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

	 
	@SuppressWarnings("unchecked")
 
	public ArrayList<Time> listarTodos() {
		return (ArrayList<Time>)entityManager.createQuery("FROM " +Time.class.getName()).getResultList();
	}

	 
	public void excluir(Time time) {
		try {
            entityManager.getTransaction().begin();
            time = entityManager.find(Time.class, time.getCodigo());
            entityManager.remove(time);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

 
	public Time listarPorCodigo(long condigo) {
		 return entityManager.find(Time.class, condigo);
	 
	}

 
	public ArrayList<Time> persquisarPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

 
	public ArrayList<Time> persquisarClassificacao() {
		// TODO Auto-generated method stub
		return null;
	}

	 
	public void excluirPorCodigo(long condigo) {
		 try {
			 Time time = listarPorCodigo(condigo);
	            excluir(time);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }
		
	}

	 
}
