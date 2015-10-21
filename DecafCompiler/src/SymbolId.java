import IR.IrType;

public class SymbolId {
	public int _offset;
	public String _name;
	public IrType _type;
	
	public SymbolId(String name, IrType idType, int offset){
		_offset = offset;
		_name = name;
		_type = idType;
	}
}
