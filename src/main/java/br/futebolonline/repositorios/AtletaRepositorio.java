package  br.futebolonline.repositorios;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.futebolonline.entidades.Atleta;
import br.futebolonline.entidades.Pessoa;
import br.futebolonline.entidades.Time;
import br.futebolonline.enums.PosicaoJogadorEnum;
import br.futebolonline.interfaces.repositorio.IBasicoRepositorio;
import br.futebolonline.interfaces.repositorio.ITimeRepositorio;
public class AtletaRepositorio implements IBasicoRepositorio<Atleta> {
	
	private static AtletaRepositorio instance;
    protected EntityManager entityManager;
    
    public static AtletaRepositorio getInstance(){
        if (instance == null){
           instance = new AtletaRepositorio();
        }

        return instance;
      }

      private AtletaRepositorio() {
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
      
 
	public void salvar(Atleta atleta) {
		try {
			 
            entityManager.getTransaction().begin();
            entityManager.persist(atleta);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

 
	public void alterar(Atleta atleta) {
		try {
            entityManager.getTransaction().begin();
            entityManager.merge(atleta);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

	 
	@SuppressWarnings("unchecked")
 
	public ArrayList<Atleta> listarTodos() {
		return (ArrayList<Atleta>)entityManager.createQuery("FROM " +Pessoa.class.getName()).getResultList();
	}

	 
	public void excluir(Atleta atleta) {
		try {
            entityManager.getTransaction().begin();
            atleta = entityManager.find(Atleta.class, atleta.getCodigo());
            entityManager.remove(atleta);
            entityManager.getTransaction().commit();
         } catch (Exception ex) {
            ex.printStackTrace();
            entityManager.getTransaction().rollback();
         }
		
	}

 
	public Atleta listarPorCodigo(long condigo) {
		 return entityManager.find(Atleta.class, condigo);
	 
	}
	
	public ArrayList<Atleta>  listarPorPosicao(PosicaoJogadorEnum posicao) {
		Class<? extends Pessoa> sublcass = Atleta.class;
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		 
		CriteriaQuery<Atleta> criteria = builder.createQuery(Atleta.class);		 
		Root<Atleta> root = criteria.from(Atleta.class);
		 
		criteria.where(
				 builder.and(
		    builder.equal(root.get("posicao"), posicao.toString()),
		    builder.equal(root.type(), sublcass))
		);
		 try {
			
		
		 List<Atleta> atletas =  entityManager
				.createQuery(criteria)
				.getResultList();
		 
		System.out.println(">>>>"+atletas.size());
		 return  (ArrayList<Atleta>)atletas;
		 } catch (Exception e) {
				return new ArrayList<Atleta>();
			}
	 
	}

 
	 
	 
	public void excluirPorCodigo(long condigo) {
		 try {
			 Atleta atleta = listarPorCodigo(condigo);
	            excluir(atleta);
	         } catch (Exception ex) {
	            ex.printStackTrace();
	         }
		
	}
 

	 
}
