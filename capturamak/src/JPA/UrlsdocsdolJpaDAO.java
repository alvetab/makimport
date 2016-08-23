package JPA;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.annotations.Where;

import DAO.UrlsdocsdolDAO;
import entities.Urlsdocsdol;


public class UrlsdocsdolJpaDAO implements UrlsdocsdolDAO {
	private EntityManager em;
		
	public UrlsdocsdolJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Urlsdocsdol> listarTodos() {
	Query q = em.createQuery("select a from Urlsdocsdol a");
	List<Urlsdocsdol> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Urlsdocsdol urlsdocsdol) {
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
		Urlsdocsdol urlsdocsdol = em.find(Urlsdocsdol.class,i);
		String url = urlsdocsdol.getUrl();
		return url;
	}


	public void crear(String string, String string2, int i, boolean b, boolean c) throws SQLException{
		try {
		Urlsdocsdol urlsdocsdol = new Urlsdocsdol(string,string2,i,b,c);
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
	

