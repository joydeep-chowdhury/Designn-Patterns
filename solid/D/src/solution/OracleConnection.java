package solution;

public class OracleConnection implements DatabaseConnection
{

	@Override
	public void connect() {
		System.out.println("Connecting to Oracle db");
		
	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting from Oracle db");
		
	}

}
