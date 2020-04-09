package nullobject;

public class Client {
  public static void main(String args[])
  {
	  CustomerFactory customerFactory=new CustomerFactory();
	  System.out.println(customerFactory.getCustomer("Joydeep").getCustomer());
	  System.out.println(customerFactory.getCustomer("Kaustav").getCustomer());
  }
}
