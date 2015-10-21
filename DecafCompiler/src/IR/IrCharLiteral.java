package IR;

public class IrCharLiteral extends IrLiteral{
	public char _value;
	public IrCharLiteral(char c){
		super(IrType.CHAR);
		_value = c;
		
	}
}