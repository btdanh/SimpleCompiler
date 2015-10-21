package DecafException;

public class DecafError {
	public String _message;
	public int _line;
	
	public DecafError(String message, int line){
		_message = message;
		_line = line;
	}
}
