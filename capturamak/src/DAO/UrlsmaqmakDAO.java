package DAO;
import java.util.List;

import model.Urlsmaqmak;;

public interface UrlsmaqmakDAO {
	List<Urlsmaqmak> listarTodos();
	List listaruno();
	void crear (Urlsmaqmak urlsmaqmak);
	String geturl(int i);	
}
