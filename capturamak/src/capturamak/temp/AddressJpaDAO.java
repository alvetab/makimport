package capturamak.temp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import JPA.PersistenceManager;


public class AddressJpaDAO implements AddressDAO {
	private EntityManager em;
		
	public AddressJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Address> listarTodos() {
	Query q = em.createQuery("select a from Acesorio a");
	List<Address> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Address address) {
		em.getTransaction().begin();
		em.persist(address);
		em.getTransaction().commit();
		em.close();
		PersistenceManager.INSTANCE.close();
	}
	
}
