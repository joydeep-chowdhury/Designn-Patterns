package facade;

public class SortingManager {
   private Algorithm bubblesort;
   private Algorithm quicksort;
   private Algorithm mergesort;
   
   public SortingManager()
   {
	   this.bubblesort=new BubbleSort();
	   this.quicksort=new QuickSort();
	   this.mergesort=new MergeSort();
   }
   
   public void doBubbleSort()
   {
	   this.bubblesort.sort();
   }
   
   public void doMergeSort()
   {
	   this.mergesort.sort();
   }
   
   public void doQuickSort()
   {
	   this.quicksort.sort();
   }
   
}
