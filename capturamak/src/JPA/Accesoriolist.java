package JPA;
import java.util.List;

import DAO.AccesorioDAO;
import entities.Accesorio;



public class Accesoriolist {
   
	private AccesorioDAO accesorioDAOlist;  
	 
  
  public Accesoriolist(){
	  if (accesorioDAOlist==null){
		  accesorioDAOlist = new AccesorioJpaDAO();
		  Accesorio accesorio = new Accesorio();
		  accesorio.setModelo("basico");
		  }
	  
  }
  public List<Accesorio> listarTodos() {
	return accesorioDAOlist.listarTodos();
	}
} 