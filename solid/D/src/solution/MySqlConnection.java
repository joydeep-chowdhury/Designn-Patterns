package solution;

public class MySqlConnection implements DatabaseConnection{

	@Override
	public void connect() {
		System.out.println("Connecting to My SQL db");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from My SQL db");
		
	}

}
