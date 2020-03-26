package violation;

public class SorterImpl {
	public static void main(String args[]) {

		SorterManager sm=new SorterManager();
		sm.sort(new InsertionSorter());
		sm.sort(new QuickSorter());
		
	}
}
