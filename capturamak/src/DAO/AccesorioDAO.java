package DAO;
import java.util.List;

import entities.Accesorio;

public interface AccesorioDAO {
	List<Accesorio> listarTodos();
	List listaruno();
	void crear (Accesorio accesorio);
	void actualizar(Accesorio accesorio);
		
}
