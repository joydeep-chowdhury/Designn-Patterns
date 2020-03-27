package singleton.synchronous;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      SingletonClass.INSTANCE.setCounter(10);
      System.out.println(SingletonClass.INSTANCE.getCounter());
	}

}
