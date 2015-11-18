package IR;

public class IrLogicalExpr extends IrExpression{
	protected IrExpression _left, _right;
	
	public IrLogicalExpr(String tok, IrExpression expr1, IrExpression expr2) {
		super(tok, null);
		_left = expr1;
		_right = expr2;
		
		_type = check(_left.GetType(), _right.GetType());
		if(_type == null) error("type error");
	}
	
	public IrType check(IrType p1, IrType p2)
	{
		if(p1 == IrType.BOOLEAN && p2 == IrType.BOOLEAN) 
			return IrType.BOOLEAN;
		else
			return null;
	}
	
	public IrExpression generate()
	{
		int f = newLabel();
		int a = newLabel();
		
		IrTemp temp = new IrTemp(_type);
		this.jumping(0, f);
		emit(temp.toString() + " = true");
		emit("goto L" + a);
		emitLabel(f);
		emit(temp.toString() + " = false");
		emitLabel(a);
		
		return temp;
	}
	
	public String toString()
	{
		return _left.toString() + " " + _text + " " + _right.toString();
	}
}
