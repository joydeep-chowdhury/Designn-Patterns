package solution.interfacesegragation;

public class VehicleImpl {

    public static void main(String args[])
    {

          ElectricVehicle ev=new ElectricCar();
          NormalVehicle nv=new PetrolCar();
          ev.speedUp();
          ev.chargeBattery();
          nv.speedUp();
          nv.addFuel();
          
        
        
    }
}
