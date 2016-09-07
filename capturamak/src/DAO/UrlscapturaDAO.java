package DAO;
import java.util.List;

import entities.Urlscaptura;;

public interface UrlscapturaDAO {
	List<Urlscaptura> listarTodos();
	List listaruno();
	List<Urlscaptura> listarTipo(int i);
	
	void crear (Urlscaptura urlsdocsdol);
	String geturl(int i);
	void update(Urlscaptura urlscaptura);	
}
