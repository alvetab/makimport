package JPA;

import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.annotations.Where;

import DAO.DespiecepormaquinaDAO;
import DAO.UrlsmaqmakDAO;
import entities.Despiecepormaquina;
import entities.Urlsmaqmak;


public class DespiecepormaquinaJpaDAO implements DespiecepormaquinaDAO {
	private EntityManager em;
		
	public DespiecepormaquinaJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Despiecepormaquina> listarTodos() {
	Query q = em.createQuery("select a from Despiecepormaquina a");
	List<Despiecepormaquina> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Despiecepormaquina despiecepormaquina) {
		em.getTransaction().begin();
		em.persist(despiecepormaquina);
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
	public String getStringPorId(int i) {
		Despiecepormaquina despiecepormaquina = em.find(Despiecepormaquina.class,i);
		String url = despiecepormaquina.toString();
		return url;
	}


	public void crear(String modelo, String posicion, String codigopieza, String descripcion) throws SQLException{
		try {
		Despiecepormaquina despiecepormaquina = new Despiecepormaquina(modelo,posicion,codigopieza,descripcion);
		em.getTransaction().begin();
		em.persist(despiecepormaquina);
		em.getTransaction().commit();
		em.close();
		}
		catch(Exception e) {
			
		}
		//PersistenceManager.INSTANCE.close();
	}
		
}
	

