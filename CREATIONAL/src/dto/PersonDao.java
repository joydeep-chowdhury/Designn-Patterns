package dto;

import java.util.ArrayList;
import java.util.List;

public class PersonDao implements DatabaseOperation {

	private List<Person> persons;
	
	public PersonDao()
	{
		this.persons=new ArrayList<Person>();
	}
	@Override
	public void insert(Person p) {
		// TODO Auto-generated method stub
		this.persons.add(p);
	}

	@Override
	public void remove(Person p) {
		this.persons.remove(p);
		
	}
	@Override
	public List<Person> getAllPersons() {
		// TODO Auto-generated method stub
		return this.persons;
	}
       
	
	
	
}
