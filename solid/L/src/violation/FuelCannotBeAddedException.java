package violation;

public class FuelCannotBeAddedException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String err="Unable to add fuel";
	
	public FuelCannotBeAddedException() {
		System.out.println(err);
	}
	
	
}
