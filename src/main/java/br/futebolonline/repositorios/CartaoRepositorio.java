package  br.futebolonline.repositorios;

import java.util.ArrayList;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.futebolonline.entidades.Cartao;
import br.futebolonline.interfaces.repositorio.IBasicoRepositorio;
 
public class CartaoRepositorio implements IBasicoRepositorio<Cartao> {
	
	private static CartaoRepositorio instance;
    protected EntityManager entityManager;
    
    public static CartaoRepositorio getInstance(){
        if (instance == null){
           instance = new CartaoRepositorio();
        }

        return instance;
      }

      private CartaoRepositorio() {
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
      
 
	public void salvar(Cartao cartao) {
		try {
			 
            entityManager.getTransaction().begin();
            entityManager.persist(cartao);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }		
	}

 
	public void alterar(Cartao cartao) {
		try {
            entityManager.getTransaction().begin();
            entityManager.merge(cartao);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }		
	}

	 
	@SuppressWarnings("unchecked")
 
	public ArrayList<Cartao> listarTodos() {
		return (ArrayList<Cartao>)entityManager.createQuery("FROM " +Cartao.class.getName()).getResultList();
	}

	 
	public void excluir(Cartao cartao) {
		try {
            entityManager.getTransaction().begin();
            cartao = entityManager.find(Cartao.class, cartao.getCodigo());
            entityManager.remove(cartao);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }		
	}

 
	public Cartao listarPorCodigo(long condigo) {
		 return entityManager.find(Cartao.class, condigo);	 
	}	 
	 
	public void excluirPorCodigo(long condigo) {
		 try {
			 Cartao cartao = listarPorCodigo(condigo);
	            excluir(cartao);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }
		
	}
 

	 
}
