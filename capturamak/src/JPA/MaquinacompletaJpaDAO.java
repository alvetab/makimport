package JPA;

import java.sql.SQLException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import DAO.MaquinacompletaDAO;
import DAO.UrlsaccmakDAO;
import capturamak.maquinacompletadsg;
import entities.Maquinacompleta;
import entities.Urlsaccmak;




public class MaquinacompletaJpaDAO implements MaquinacompletaDAO {
	private EntityManager em;
		
	public MaquinacompletaJpaDAO() {
	em = PersistenceManager.INSTANCE.getEntityManager();
	}
	
	
	@Override
	public List<Maquinacompleta> listarTodos() {
	Query q = em.createQuery("select a from Maquinacompleta a");
	List<Maquinacompleta> listado =  q.getResultList();
		return listado;
	}

	@Override
	public void crear(Maquinacompleta maquinacompleta) {
		em.getTransaction().begin();
		em.persist(maquinacompleta);
		em.getTransaction().commit();
		em.close();
		PersistenceManager.INSTANCE.close();
	}
	

	@Override
	public List listaruno() {
		// TODO Auto-generated method stub
		return null;
	}
		
}
	

