package capturamak.temp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import JPA.PersistenceManager;


public class AccesorioJpaDAO implements AccesorioDAO {
	private EntityManager em;
		
	public AccesorioJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Accesorio> listarTodos() {
	Query q = em.createQuery("select a from Accesorio a");
	List<Accesorio> listado = q.getResultList();
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

	public String listaruno(String busqueda,String argumento) {
		//Query q = em.createQuery("select a from Accesorio a");
		 Accesorio unico= (Accesorio)em.createQuery("select a from Accesorio a  where a.modelo LIKE ?2")
		//.setParameter(1, "modelo")
		.setParameter(2, argumento)
		.getSingleResult();
		//.getResultList();
		String valor = unico.getModelo();
		return valor;	
		}
	public String listardos(String busqueda,int argumento) {
		Accesorio buscado=(Accesorio)em.find(Accesorio.class, argumento);
		String valor=buscado.getModelo();
		return valor;	
		}
	public List<Accesorio> listaralgo() {
		Query q = em.createQuery("select a from Accesorio a");
		List<Accesorio> listado = q.getMaxResults() getResultList();
		em.
		
		return listado;
		}
}
