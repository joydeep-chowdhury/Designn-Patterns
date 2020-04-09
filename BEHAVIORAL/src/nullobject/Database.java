package nullobject;

import java.util.ArrayList;
import java.util.List;

public class Database {
  private List<String> customerNames;

public Database() {
	this.customerNames=new ArrayList<String>();
	this.customerNames.add("Joydeep");
	this.customerNames.add("Arunabha");
	this.customerNames.add("Ankit");
	this.customerNames.add("Samir");
	this.customerNames.add("Preshika");
	this.customerNames.add("Sachin");
}
  
  public boolean existsCustomer(String name)
  {
	  for(String s:this.customerNames)
	  {
		  if(s.equals(name))
			  return true;
	  }
	  return false;
  }
}
