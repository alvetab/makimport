package DAO;
import java.util.List;

import entities.Urlsdocsdol;;

public interface UrlsdocsdolDAO {
	List<Urlsdocsdol> listarTodos();
	List listaruno();
	void crear (Urlsdocsdol urlsdocsdol);
	String geturl(int i);	
}
