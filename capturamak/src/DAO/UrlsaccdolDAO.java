package DAO;
import java.util.List;

import entities.Urlsaccdol;;

public interface UrlsaccdolDAO {
	List<Urlsaccdol> listarTodos();
	List listaruno();
	void crear (Urlsaccdol urlsaccdol);
	String geturl(int i);	
}
