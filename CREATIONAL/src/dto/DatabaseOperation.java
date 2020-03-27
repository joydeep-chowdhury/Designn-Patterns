package dto;

import java.util.List;

public interface DatabaseOperation {
   public void insert(Person p);
   public void remove(Person p);
   public List<Person> getAllPersons();
   
}
