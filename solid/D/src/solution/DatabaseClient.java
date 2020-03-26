package solution;

public class DatabaseClient {

	public static void main(String[] args) {
		DatabaseHandler handler1=new DatabaseHandler(new MySqlConnection());
		handler1.connect();
		handler1.disconnect();
		DatabaseHandler handler2=new DatabaseHandler(new OracleConnection());
        handler2.connect();
        handler2.disconnect();
	}

}
