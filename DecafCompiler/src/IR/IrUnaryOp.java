package IR;

public class IrUnaryOp extends IrOp {
	protected IrExpression _expr;
	
	public IrUnaryOp(String tok, IrExpression e)
	{
		super(tok, null);
		_expr = e;
		_type = IrType.max(IrType.INT, _expr.GetType());
		
		if(_type == null) error("type error");
	}
	
	public IrExpression generate()
	{
		return new IrUnaryOp(_text, _expr.reduce());
	}
	
	public String toString() 
	{
		return _text + " " + _expr.toString();
	}
}
