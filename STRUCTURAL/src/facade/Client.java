package facade;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         SortingManager sm=new SortingManager();
         sm.doBubbleSort();
         sm.doMergeSort();
         sm.doQuickSort();
	}

}
