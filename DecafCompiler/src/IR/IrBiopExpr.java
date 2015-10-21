package IR;

public class IrBiopExpr extends IrExpression {
	public IrExpression _left;
	public IrExpression _right;	
	
	public IrBiopExpr(String name, IrExpression left, IrExpression right){
		super(null);		
		_left = left;
		_right = right;
		
		_type = CheckType(left, right);
	}
	
	public static IrType CheckType(IrExpression expr1, IrExpression expr2){
		if(expr1._type == IrType.BOOLEAN && expr2._type == IrType.BOOLEAN)
			return IrType.BOOLEAN;
		return null;
	}
}
