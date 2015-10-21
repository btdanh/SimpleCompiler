package IR;

public class IrIntLiteral extends IrLiteral{
	
	public int _value;
	
	public IrIntLiteral(int v){
		super(IrType.INT);
		_value = v;		
	}
}