package DAO;
import java.util.List;

import entities.Maquinacompleta;


public interface MaquinacompletaDAO {
	List<Maquinacompleta> listarTodos();
	List listaruno();
	void crear (Maquinacompleta maquinacompleta);
		
}
