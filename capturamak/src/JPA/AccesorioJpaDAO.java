package JPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import DAO.AccesorioDAO;
import entities.Accesorio;


public class AccesorioJpaDAO implements AccesorioDAO {
	private EntityManager em;
		
	public AccesorioJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Accesorio> listarTodos() {
	Query q = em.createQuery("select a from Accesorio a");
	List<Accesorio> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Accesorio accesorio) {
		em.getTransaction().begin();
		em.persist(accesorio);
		em.getTransaction().commit();
		em.close();
		PersistenceManager.INSTANCE.close();
	}
	@Override
	public void actualizar(Accesorio accesorio) {
		em.getTransaction().begin();
		em.persist(accesorio);
		em.getTransaction().commit();
		em.close();
		PersistenceManager.INSTANCE.close();
	}
}
