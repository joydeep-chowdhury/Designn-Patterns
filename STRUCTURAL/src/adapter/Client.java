package adapter;

public class Client {
 public static void main(String args[])
 {
	 Vehicle bus=new Bus();
	 bus.accelerate();
	 Vehicle car=new Car();
	 car.accelerate();
	 Vehicle bicycle=new BicycleAdapter(new Bicycle());
	 bicycle.accelerate();
 }
}
