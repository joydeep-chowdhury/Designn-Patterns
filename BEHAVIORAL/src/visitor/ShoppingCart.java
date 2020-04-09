package visitor;

public class ShoppingCart implements ShoppingCartVisitor {

	@Override
	public double visit(Table table) {
		// TODO Auto-generated method stub
		return table.getPrice();
	}

	@Override
	public double visit(Chair chair) {
		// TODO Auto-generated method stub
		return chair.getPrice();
	}

}
