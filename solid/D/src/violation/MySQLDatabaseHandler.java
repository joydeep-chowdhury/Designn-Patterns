package violation;

public class MySQLDatabaseHandler {
    private MySQLConnection connection;
    
    public MySQLDatabaseHandler() {
        this.connection=new MySQLConnection(); 	
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
