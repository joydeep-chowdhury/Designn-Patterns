package decorator;

public class Milk extends BeverageDecorator
{

	private Beverage beverage;
	
	public Milk(Beverage beverage) {
		super(beverage);
		this.beverage=beverage;
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.beverage.getCost()+35;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return this.beverage.getDescription()+" Milk";
	}

}
