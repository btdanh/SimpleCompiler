package IR;

public class IrBiopExpr extends IrExpression {
	private IrExpression _left;
	private IrExpression _right;	
	
	public IrExpression GetLeft(){
		return _left;
	}
	
	public IrExpression GetRight(){
		return _right;
	}
	public IrBiopExpr(String name, IrExpression left, IrExpression right){
		super(null);		
		_left = left;
		_right = right;
	}
}
