package solution;

public class DatabaseHandler {
    private DatabaseConnection connection;
    
    public DatabaseHandler() {
        	
    }
   
    
    public DatabaseHandler(DatabaseConnection connection) {
		super();
		this.connection = connection;
	}


	public void connect()
    {
 	   this.connection.connect();
    }
    
    
    public void disconnect()
    {
    	this.connection.disconnect();
    }
    
}
