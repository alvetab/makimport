package DAO;
import java.util.List;

import model.Urlsaccmak;;

public interface UrlsaccmakDAO {
	List<Urlsaccmak> listarTodos();
	List listaruno();
	void crear (Urlsaccmak urlsaccmak);
	String geturl(int i);	
}
