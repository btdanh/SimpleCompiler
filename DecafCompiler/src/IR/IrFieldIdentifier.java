package IR;

public class IrFieldIdentifier extends IrExpression {
	
	public int _offset;
	public IrFieldIdentifier(String name, IrType p, int b){
		super(name, p);
		_offset = b;
	}
}
