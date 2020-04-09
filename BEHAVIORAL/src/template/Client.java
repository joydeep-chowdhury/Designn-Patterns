package template;

public class Client {
   public static void main(String args[])
   {
	   int numbers[]= {88,44,66,77,22};
	   Algorithm sortAlgorithm=new BubbleSort(numbers);
	   sortAlgorithm.sort();
	   Algorithm insertionAlgorithm=new InsertionSort(numbers);
	   insertionAlgorithm.sort();
   }
}
