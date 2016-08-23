package DAO;
import java.util.List;

import entities.Despiecepormaquina;

public interface DespiecepormaquinaDAO {
	List<Despiecepormaquina> listarTodos();
	List listaruno();
	void crear (Despiecepormaquina despiecepormaquina);
	String getStringPorId(int i);	
}
