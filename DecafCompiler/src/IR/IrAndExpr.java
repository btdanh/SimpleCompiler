package IR;

public class IrAndExpr extends IrLogicalExpr {

	public IrAndExpr(IrExpression x1, IrExpression x2)
	{
		super ("&&", x1, x2);
	}
	
	public void jumping(int trueClause, int falseClause)
	{
		int label = falseClause != 0 ? falseClause : newLabel();
		_left.jumping(0, label);
		_right.jumping(trueClause,  falseClause);
		
		if(falseClause == 0) 
			emitLabel(label);
	}
}
