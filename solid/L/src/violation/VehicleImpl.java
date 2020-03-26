package violation;

public class VehicleImpl {

    public static void main(String args[])
    {
        Vehicle vehicle=new ElectricCar();
        Vehicle vehicle2=new PetrolCar();
        vehicle2.addFuel();
//        vehicle.addFuel();
        vehicle2.speedUp();
//        vehicle.speedUp();
        if(vehicle instanceof ElectricCar )
        {
        	System.out.println("Electric cars run on charge");
        	vehicle.speedUp();
        }
        
        
        
        
        
    }
}
