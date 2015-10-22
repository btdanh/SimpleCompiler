package IR;

public class IrBooleanLiteral extends IrLiteral{
	
	private Boolean _value;
	
	public Boolean GetValue(){
		return _value;
	}
	public IrBooleanLiteral(Boolean v){
		super(IrType.BOOLEAN);
		_value = v;		
	}
}