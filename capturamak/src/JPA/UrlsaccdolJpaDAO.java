package JPA;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import DAO.UrlsaccdolDAO;
import entities.Urlsaccdol;


public class UrlsaccdolJpaDAO implements UrlsaccdolDAO {
	private EntityManager em;
		
	public UrlsaccdolJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlsaccdol> listarTodos() {
	Query q = em.createQuery("select a from Urlsaccdol a");
	List<Urlsaccdol> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlsaccdol urlsaccdol) {
		em.getTransaction().begin();
		em.persist(urlsaccdol);
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
		Urlsaccdol urlsaccdol = em.find(Urlsaccdol.class,i);
		String url = urlsaccdol.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlsaccdol urlsaccdol = new Urlsaccdol(string,string2,i,b,c);
		em.getTransaction().begin();
		em.persist(urlsaccdol);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

