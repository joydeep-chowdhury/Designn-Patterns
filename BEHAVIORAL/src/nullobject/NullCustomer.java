package nullobject;

public class NullCustomer extends AbstractCustomer{

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getCustomer() {
		// TODO Auto-generated method stub
		return "Db doesnot contain any customer with such name";
	}

}
