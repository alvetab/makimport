package DAO;
import java.util.List;

import entities.Urlsaccmak;;

public interface UrlsaccmakDAO {
	List<Urlsaccmak> listarTodos();
	List listaruno();
	void crear (Urlsaccmak urlsaccmak);
	String geturl(int i);	
}
