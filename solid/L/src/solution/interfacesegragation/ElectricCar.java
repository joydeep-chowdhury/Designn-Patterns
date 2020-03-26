package solution.interfacesegragation;

public class ElectricCar implements ElectricVehicle{

	@Override
	public void speedUp() {
		System.out.println("Speeding up electric car");
		
	}

	@Override
	public void chargeBattery() {
		// TODO Auto-generated method stub
		System.out.println("Charging up electric car");
	}
   
}
