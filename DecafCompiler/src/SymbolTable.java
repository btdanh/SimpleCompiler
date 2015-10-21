import java.util.Hashtable;

import IR.IrType;

public class SymbolTable {
	private Hashtable<String, SymbolId> _table;
	protected SymbolTable _outer;
	
	public SymbolTable(SymbolTable parent){
		_table = new Hashtable<String, SymbolId>();
		_outer = parent;	
	}
	
	
	public boolean Push(String token, IrType idType, int offset )
	{
		SymbolId id = Lookup(token);
		if(id == null){
			_table.put(token, new SymbolId(token, idType, offset));
			return true;
		}
		return false;
	}
	
	public SymbolId Lookup(String token){
		SymbolTable t = this;
		while(t != null){
			SymbolId id = t._table.get(token);
			if(id != null) return id;
			t = t._outer;
		}
		return null;
	}
	
}
