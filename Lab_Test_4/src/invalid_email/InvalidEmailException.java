package invalid_email;

public class InvalidEmailException extends Exception{
	public InvalidEmailException(String e){
//		This will call parent class "Exception"
		super(e);
	}
}
