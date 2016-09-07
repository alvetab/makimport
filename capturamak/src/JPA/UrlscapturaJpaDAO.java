package JPA;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.annotations.Where;

import DAO.UrlscapturaDAO;
import entities.Urlscaptura;


public class UrlscapturaJpaDAO implements UrlscapturaDAO {
	private EntityManager em;
		
	public UrlscapturaJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlscaptura> listarTodos() {
	Query q = em.createQuery("select a from Urlscaptura a");
	List<Urlscaptura> listado =  q.getResultList();
		return listado;
	}
	
	@Override
	public List<Urlscaptura> listarTipo(int i) {
	Query q = em.createQuery("select a from Urlscaptura a where a.tipo=:arg0").setParameter("arg0", i);
	List<Urlscaptura> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlscaptura urlscaptura) {
		em.getTransaction().begin();
		em.persist(urlscaptura);
		em.getTransaction().commit();
		em.close();
		//PersistenceManager.INSTANCE.close();
	}
	
	@Override
	public void update(Urlscaptura urlscaptura) {
		em.getTransaction().begin();
		int urlid=urlscaptura.getId();
		Urlscaptura amodificar=em.find(Urlscaptura.class, urlid);
		amodificar=em.merge(urlscaptura);
		em.getTransaction().commit();
		em.close();
		}

	@Override
	public List listaruno() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String geturl(int i) {
		Urlscaptura urlscaptura = em.find(Urlscaptura.class,i);
		String url = urlscaptura.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlscaptura urlscaptura = new Urlscaptura(string,string2,i,b,c);
		em.getTransaction().begin();
		em.persist(urlscaptura);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

