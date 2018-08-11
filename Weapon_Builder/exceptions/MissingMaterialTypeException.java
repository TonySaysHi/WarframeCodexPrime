package exceptions;

public class MissingMaterialTypeException extends Exception{

	public MissingMaterialTypeException() {
		
	}
	
	public MissingMaterialTypeException(String message)
    {
       super(message);
    }
}
