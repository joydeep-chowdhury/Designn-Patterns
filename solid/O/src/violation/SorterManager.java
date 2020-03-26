package violation;

public class SorterManager {

	public void sort(Sorter sorter)
	{
		if(sorter.sortType==SortType.INSERTION_SORT)
		{
			doInsertionSort(sorter);
		}
		else if(sorter.sortType==SortType.QUICK_SORT)
		{
			doQuickSort(sorter);
		}
	}
	
	public void doInsertionSort(Sorter sorter)
	{
		sorter.sort();
	}
	
	public void doQuickSort(Sorter sorter)
	{
		sorter.sort();
	}
}
