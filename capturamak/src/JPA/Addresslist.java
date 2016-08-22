package JPA;
import java.util.List;

import capturamak.temp.Address;
import capturamak.temp.AddressDAO;
import capturamak.temp.AddressJpaDAO;

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