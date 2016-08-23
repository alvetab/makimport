package DAO;
import java.util.List;

import entities.Urlsdocsmak;;

public interface UrlsdocsmakDAO {
	List<Urlsdocsmak> listarTodos();
	List listaruno();
	void crear (Urlsdocsmak urlsdocsmak);
	String geturl(int i);	
}
