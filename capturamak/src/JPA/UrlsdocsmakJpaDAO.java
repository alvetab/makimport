package JPA;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.annotations.Where;

import DAO.UrlsdocsmakDAO;
import entities.Urlsdocsmak;


public class UrlsdocsmakJpaDAO implements UrlsdocsmakDAO {
	private EntityManager em;
		
	public UrlsdocsmakJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlsdocsmak> listarTodos() {
	Query q = em.createQuery("select a from Urlsdocsmak a");
	List<Urlsdocsmak> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlsdocsmak urlsdocsmak) {
		em.getTransaction().begin();
		em.persist(urlsdocsmak);
		em.getTransaction().commit();
		em.close();
		PersistenceManager.INSTANCE.close();
	}
	

	@Override
	public List listaruno() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String geturl(int i) {
		Urlsdocsmak urlsdocsmak = em.find(Urlsdocsmak.class,i);
		String url = urlsdocsmak.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlsdocsmak urlsdocsmak = new Urlsdocsmak(string,string2,i,b,c);
		em.getTransaction().begin();
		em.persist(urlsdocsmak);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

