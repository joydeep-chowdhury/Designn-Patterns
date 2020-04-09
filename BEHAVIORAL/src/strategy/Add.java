package strategy;

public class Add implements Strategy
{

	@Override
	public void calculate(int a, int b) {
		System.out.println(a+b);
		
	}

}
