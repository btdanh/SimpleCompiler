package IR;

public class IrArray extends IrType{
	public int _capacity = 1;
	public IrType _typeOf;
	
	public IrArray(IrType type, int capacity){		 
		super("[]", capacity * type._size);
		_capacity = capacity;
		_typeOf = type;
	}
	
}
