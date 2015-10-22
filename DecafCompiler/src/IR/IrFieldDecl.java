package IR;

import java.util.*;

public class IrFieldDecl extends IrMemberDecl{
	private List<Map.Entry<String, IrType>> _fields;
	
	public IrFieldDecl(){
		_fields = new ArrayList<Map.Entry<String, IrType>>();
	}
	
	public void Add(String name, IrType idType){
		_fields.add(new AbstractMap.SimpleEntry<String, IrType>(name, idType));
	}
	
	public int GetSize(){
		return _fields.size();
	}
	
	public Map.Entry<String, IrType> GetAt(int i){
		return _fields.get(i);
	}
	
}
