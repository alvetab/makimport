package DAO;
import java.util.List;

import entities.Address;

public interface AddressDAO {
	List<Address> listarTodos();
	void crear (Address address);
	
}
