package capturamak.temp;
import java.util.List;



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
  public List<Accesorio> listaruno() {
		return accesorioDAOlist.listaruno();
		}
} 