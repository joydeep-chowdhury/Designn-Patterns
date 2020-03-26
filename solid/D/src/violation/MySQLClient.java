package violation;

public class MySQLClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySQLDatabaseHandler handler=new MySQLDatabaseHandler();
		handler.connect();
		handler.disconnect();
	}

}
