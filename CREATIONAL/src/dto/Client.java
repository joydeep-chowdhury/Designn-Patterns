package dto;



public class Client {
  public static void main(String args[])
  {
	  Person p = new Person("Joydeep Chowdhury", 894949, "CL 266 Sector 2 Salt Lake Kolkata",26,"M");
	  Person p2 = new Person("Ankit Bhattacharjee", 774883, "Kestopur Shitlamandir Kolkata",25,"M");
	  Person p3 = new Person("Arunabha Gupta", 7883899, "Busdroni Kolkata",26,"M");
	  PersonDao pd=new PersonDao();
	  pd.insert(p);
	  pd.insert(p2);
	  pd.insert(p3);
	  for(Person pt:pd.getAllPersons())
	  {
		  System.out.println(pt);
	  }
  }
}
