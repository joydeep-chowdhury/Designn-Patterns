package strategy;

public class Client {
  public static void main(String args[])
  {
	  Manager manager=new Manager();
	  manager.setStrategy(new Add());
	  manager.calculate(2, 3);
  }
}
