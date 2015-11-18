package IR;

public class IrArithExpr extends IrOp {
	private IrExpression _left;
	private IrExpression _right;	
	
	public IrExpression GetLeft(){
		return _left;
	}
	
	public IrExpression GetRight(){
		return _right;
	}
	public IrArithExpr(String name, IrExpression left, IrExpression right){
		super(name, null);		
		_left = left;
		_right = right;
		_type = IrType.max(left.GetType(), right.GetType());
		if (_type == null) error("type error");
	}
	
	public IrExpression generate()
	{
		return new IrArithExpr(_text, _left.reduce(), _right.reduce());
	}
	
	public String toString()
	{
		return _left.toString() + " " + _text + " " + _right.toString();
	}
}
