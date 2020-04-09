package template;

public class InsertionSort  extends Algorithm
{
    private int[] numbers;
    
    
	public InsertionSort(int[] numbers) {
	
		this.numbers = numbers;
	}

	@Override
	public void initialize() {
		// TODO Auto-generated method stub
		System.out.println("Initializing insertion sort");
	}

	@Override
	public void sorting() {
		System.out.println("Sorting by insertion sort");
		
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
