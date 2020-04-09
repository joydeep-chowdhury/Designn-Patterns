package iterator;

public class NameIterator implements Iterator {
	private String[] names;
	private int index;

	public NameIterator(String[] names) {
		this.names = names;
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return index<names.length;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		if(this.hasNext())
			return this.names[index++];
	    return null;
	}

}
