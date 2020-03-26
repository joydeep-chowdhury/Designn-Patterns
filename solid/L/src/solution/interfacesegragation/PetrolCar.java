package solution.interfacesegragation;

public class PetrolCar implements NormalVehicle{

	@Override
	public void speedUp() {
		System.out.println("Speeding up petrol car");
		
	}

	@Override
	public void addFuel() {
		System.out.println("Fuel added for petrol car");
		
	}
      
}
