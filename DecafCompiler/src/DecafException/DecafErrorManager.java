package DecafException;
import java.util.*;

public class DecafErrorManager {
	List<DecafError> _semanticErrors;
	
	public static DecafErrorManager _instance = null;
	
	public DecafErrorManager(){
		_semanticErrors = new ArrayList<DecafError>();
	}
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
	
	public List<DecafError> GetErrors(){
		return _semanticErrors;
	}
}
