package JPA;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.annotations.Where;

import DAO.UrlscapturaDAO;
import DAO.UrlsdocsdolDAO;
import entities.Urlscaptura;


public class UrlscapturaJpaDAO2 implements UrlscapturaDAO {
	private EntityManager em;
		
	public UrlscapturaJpaDAO2() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlscaptura> listarTodos() {
	Query q = em.createQuery("select a from Urlscaptura a");
	List<Urlscaptura> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlscaptura urlsdocsdol) {
		em.getTransaction().begin();
		em.persist(urlsdocsdol);
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
		Urlscaptura urlsdocsdol = em.find(Urlscaptura.class,i);
		String url = urlsdocsdol.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlscaptura urlsdocsdol = new Urlscaptura(string,string2,i,b,c);
		em.getTransaction().begin();
		em.persist(urlsdocsdol);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

