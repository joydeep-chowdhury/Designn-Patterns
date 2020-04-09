package strategy;

public class Multiply implements Strategy{

	@Override
	public void calculate(int a, int b) {
		System.out.println(a*b);
		
	}

}
