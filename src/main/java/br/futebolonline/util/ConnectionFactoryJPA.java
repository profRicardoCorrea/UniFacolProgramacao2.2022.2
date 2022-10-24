package  br.futebolonline.util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class ConnectionFactoryJPA {
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpateste");
	   public EntityManager getEntityManager(){
	      return entityManagerFactory.createEntityManager();
	   }                                   

}
