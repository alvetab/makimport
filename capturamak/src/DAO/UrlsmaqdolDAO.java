package DAO;
import java.util.List;

import model.Urlsmaqdol;
import model.Urlsmaqmak;;

public interface UrlsmaqdolDAO {
	List<Urlsmaqdol> listarTodos();
	List listaruno();
	void crear (Urlsmaqdol urlsmaqdol);
	String geturl(int i);	
}
