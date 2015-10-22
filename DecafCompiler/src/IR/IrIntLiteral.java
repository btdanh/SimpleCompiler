package IR;

public class IrIntLiteral extends IrLiteral{
	
	private int _value;
	
	public int GetValue(){
		return _value;
	}
	
	public IrIntLiteral(int v){
		super(IrType.INT);
		_value = v;		
	}
}