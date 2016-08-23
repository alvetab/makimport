package JPA;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import DAO.UrlsaccmakDAO;
import entities.Urlsaccmak;




public class UrlsaccmakJpaDAO implements UrlsaccmakDAO {
	private EntityManager em;
		
	public UrlsaccmakJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlsaccmak> listarTodos() {
	Query q = em.createQuery("select a from Urlsaccmak a");
	List<Urlsaccmak> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlsaccmak urlsaccmak) {
		em.getTransaction().begin();
		em.persist(urlsaccmak);
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
		Urlsaccmak urlsaccmak = em.find(Urlsaccmak.class,i);
		String url = urlsaccmak.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlsaccmak urlsaccmak = new Urlsaccmak(string,string2,i,b,c);
		em.getTransaction().begin();
		em.persist(urlsaccmak);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

