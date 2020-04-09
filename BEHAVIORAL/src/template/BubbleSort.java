package template;

public class BubbleSort extends Algorithm
{
    private int[] numbers;
    
    
	public BubbleSort(int[] numbers) {
	
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Initializing bubble sort");
	}

	@Override
	public void sorting() {
		System.out.println("Sorting by bubble sort");
		
	}

	@Override
	public void printResult() {
		// TODO Auto-generated method stub
		for(Integer i:numbers)
		{
			System.out.println(i+" ");
		}
		
	}


	
	
}
