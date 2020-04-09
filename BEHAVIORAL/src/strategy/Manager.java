package strategy;

public class Manager implements Strategy
  {
      private Strategy strategy;


	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}


	@Override
	public void calculate(int a, int b) {
		this.strategy.calculate(a, b);
		
	}
      
      
      
  }
