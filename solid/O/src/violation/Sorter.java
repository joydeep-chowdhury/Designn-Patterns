package violation;

public abstract class Sorter {
    protected SortType sortType;
    public Sorter() {}
    public Sorter(SortType sortType) {
    	this.sortType=sortType;
    }
    public abstract void sort();
}
