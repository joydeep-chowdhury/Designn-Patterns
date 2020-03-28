package adapter;

public class BicycleAdapter implements Vehicle
{
    private Bicycle bicycle;
    
    
	
	public BicycleAdapter(Bicycle bicycle) {
		
		this.bicycle = bicycle;
	}



	@Override
	public void accelerate() {
		// TODO Auto-generated method stub
		this.bicycle.go();
	}

}
