package DecafException;
import java.util.List;

public class DecafErrorManager {
	List<DecafError> _semanticErrors;
	
	public static DecafErrorManager _instance = null;
	
	public static DecafErrorManager Instance(){
		if(_instance == null)
			_instance = new DecafErrorManager();
		
		return _instance;
	}
	
	public void Push(DecafError e){
		_semanticErrors.add(e);
	}
	
	public void Reset(){
		_semanticErrors.clear();
	}
	
}
