package JPA;
import java.util.List;

import DAO.AddressDAO;
import entities.Address;

public class Addresslist {
   
	private AddressDAO addressDAOlist;  
	 
  
  public Addresslist(){
	  if (addressDAOlist==null){
		  addressDAOlist = new AddressJpaDAO();
		  Address address = new Address();
		  address.setCity("Dhaka");
		  address.setCountry("Bangladesh");
		  address.setPostcode("1000");
		  address.setStreet("Poribagh");
	  }
	  
  }
  public List<Address> listarTodos() {
	return addressDAOlist.listarTodos();
	}
} 