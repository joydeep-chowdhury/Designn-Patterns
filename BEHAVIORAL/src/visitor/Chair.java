package visitor;

public class Chair implements ShoppingItem{
	private String type;
	private double price;
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Chair(String type, double price) {
		super();
		this.type = type;
		this.price = price;
	}


	@Override
	public double accept(ShoppingCartVisitor visitor) {
		// TODO Auto-generated method stub
		return visitor.visit(this);
	}
   
}
