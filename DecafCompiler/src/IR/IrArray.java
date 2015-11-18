package IR;

public class IrArray extends IrType{
	private int _capacity = 1;
	private IrType _typeOf;
	
	public int GetCapacity(){
		return _capacity;
	}
	
	public IrType GetType(){
		return _typeOf;
	}
	
	public IrArray(IrType type, int capacity){		 
		super("[]", capacity * type.GetSize());
		_capacity = capacity;
		_typeOf = type;
	}
	
	public String toString() {
		return "[" + _capacity + "]" + _typeOf.toString();
	}
}
