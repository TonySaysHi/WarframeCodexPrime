package weaponData;

public class MissingMaterialTypeException extends Exception{

	public MissingMaterialTypeException() {
		
	}
	
	public MissingMaterialTypeException(String message)
    {
       super(message);
    }
}
