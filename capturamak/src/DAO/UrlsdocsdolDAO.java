package DAO;
import java.util.List;

import entities.Urlscaptura;;

public interface UrlsdocsdolDAO {
	List<Urlscaptura> listarTodos();
	List listaruno();
	void crear (Urlscaptura urlsdocsdol);
	String geturl(int i);	
}
