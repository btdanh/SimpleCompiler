package IR;

public class IrBooleanLiteral extends IrLiteral{
	
	public Boolean _value;
	public IrBooleanLiteral(Boolean v){
		super(IrType.BOOLEAN);
		_value = v;		
	}
}