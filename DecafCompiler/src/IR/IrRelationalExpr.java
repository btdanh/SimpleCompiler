package IR;

public class IrRelationalExpr extends IrLogicalExpr{

	public IrRelationalExpr(String tok, IrExpression x1, IrExpression x2) 
	{ 
		super(tok, x1, x2); 
	}
	
	public IrType check(IrType p1, IrType p2) 
	{
		if (p1 instanceof IrArray || p2 instanceof IrArray) 
			return null;
		else if (p1 == p2) 
			return IrType.BOOLEAN;
		else 
			return null;
	}
	
	public void jumping(int trueClause, int falseClause)
	{
		IrExpression a = _left.reduce();
		IrExpression b = _right.reduce();
		String test = a.toString() + " " + _text + " " + b.toString();
		emitJumps(test, trueClause, falseClause);
	}
}
