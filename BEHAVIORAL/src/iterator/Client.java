package iterator;

public class Client {
   public static void main(String args[])
   {
	   NameRepository nameRepository=new NameRepository();
	   for(Iterator iter=nameRepository.getIterator();iter.hasNext();)
	   {
		   System.out.println(iter.next());
	   }
   }
}
