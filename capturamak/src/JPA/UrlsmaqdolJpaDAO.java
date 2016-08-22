package JPA;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.annotations.Where;

import DAO.UrlsmaqdolDAO;
import model.Urlsmaqdol;



public class UrlsmaqdolJpaDAO implements UrlsmaqdolDAO {
	private EntityManager em;
		
	public UrlsmaqdolJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlsmaqdol> listarTodos() {
	Query q = em.createQuery("select a from Urlsmaqdol a");
	List<Urlsmaqdol> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlsmaqdol urlsmaqdol) {
		em.getTransaction().begin();
		em.persist(urlsmaqdol);
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
		Urlsmaqdol urlsmaqdol = em.find(Urlsmaqdol.class,i);
		String url = urlsmaqdol.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlsmaqdol urlsmaqdol = new Urlsmaqdol(string,string2,i,b,c);
		em.getTransaction().begin();
		em.persist(urlsmaqdol);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

