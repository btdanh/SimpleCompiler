package IR;

public class IrCharLiteral extends IrLiteral{
	private char _value;
	
	public char GetValue(){
		return _value;
	}
	public IrCharLiteral(char c){
		super(IrType.CHAR);
		_value = c;
		
	}
}