package decorator;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Beverage beverage=new Sugar(new Milk(new PlainBeverage()));
       System.out.println(beverage.getCost());
       System.out.println(beverage.getDescription());
;	}

}
