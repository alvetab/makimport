package DAO;
import java.util.List;

import javax.persistence.Id;

import com.sun.xml.internal.fastinfoset.algorithm.IEEE754FloatingPointEncodingAlgorithm;

import entities.Accesorio;

public interface AccesorioDAO {
	List<Accesorio> listarTodos();
	String listaruno(String busqueda,String argumento);
	String listardos(String busqueda,int argumento);
	void crear (Accesorio accesorio);
	void actualizar(Accesorio accesorio);
		
}
