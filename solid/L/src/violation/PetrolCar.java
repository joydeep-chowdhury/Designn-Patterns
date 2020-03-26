package violation;

public class PetrolCar implements Vehicle{

	@Override
	public void speedUp() {
		System.out.println("Speeding up petrol car");
		
	}

	@Override
	public void addFuel() {
		System.out.println("Fuel added for petrol car");
		
	}
      
}
