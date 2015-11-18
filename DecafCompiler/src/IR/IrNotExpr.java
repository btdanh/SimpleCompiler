package IR;

public class IrNotExpr extends IrLogicalExpr{
	public IrNotExpr(IrExpression x2)
	{
		super("!", x2, x2);
	}
	
	public void jumping(int trueClause, int falseClause)
	{
		_right.jumping(falseClause, trueClause);
	}
	
	public String toString()
	{
		return _text + " " + _right.toString();
	}
}
