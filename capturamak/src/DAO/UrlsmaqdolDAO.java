package DAO;
import java.util.List;

import entities.Urlsmaqdol;
import entities.Urlsmaqmak;;

public interface UrlsmaqdolDAO {
	List<Urlsmaqdol> listarTodos();
	List listaruno();
	void crear (Urlsmaqdol urlsmaqdol);
	String geturl(int i);	
}
