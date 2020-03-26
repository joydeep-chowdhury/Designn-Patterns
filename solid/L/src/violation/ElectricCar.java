package violation;

public class ElectricCar implements Vehicle{

	@Override
	public void speedUp() {
		System.out.println("Speeding up electric car");
		
	}

	@Override
	public void addFuel() {
		// TODO Auto-generated method stub
		throw new FuelCannotBeAddedException();
	}
   
}
