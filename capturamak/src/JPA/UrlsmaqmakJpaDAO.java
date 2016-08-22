package JPA;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.annotations.Where;

import DAO.UrlsmaqmakDAO;
import model.Urlsmaqmak;


public class UrlsmaqmakJpaDAO implements UrlsmaqmakDAO {
	private EntityManager em;
		
	public UrlsmaqmakJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlsmaqmak> listarTodos() {
	Query q = em.createQuery("select a from Urlsmaqmak a");
	List<Urlsmaqmak> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlsmaqmak urlsmaqmak) {
		em.getTransaction().begin();
		em.persist(urlsmaqmak);
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
		Urlsmaqmak urlsmaqmak = em.find(Urlsmaqmak.class,i);
		String url = urlsmaqmak.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlsmaqmak urlsmaqmak = new Urlsmaqmak(string,string2,i,b,c);
		em.getTransaction().begin();
		em.persist(urlsmaqmak);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

