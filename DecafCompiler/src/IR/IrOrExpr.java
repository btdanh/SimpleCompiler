package IR;

public class IrOrExpr extends IrLogicalExpr{
	
	public IrOrExpr(IrExpression x1, IrExpression x2) 
	{ 
		super("||", x1, x2); 
	}
	
	public void jumping(int trueClause, int falseClause)
	{
		int label = trueClause != 0 ? trueClause : newLabel();
		_left.jumping(label, 0);
		_right.jumping(trueClause, falseClause);
		
		if ( trueClause == 0 ) 
			emitLabel(label);
	}
}
