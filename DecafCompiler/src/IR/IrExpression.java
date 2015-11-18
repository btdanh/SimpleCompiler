package IR;

public class IrExpression extends IrNode {
	protected IrType _type;
	protected String _text;
	
	public IrType GetType(){
		return _type;
	}
	
	public IrExpression(String tok, IrType type){		
		_type = type;
		_text = tok;
	}
	
	public IrExpression generate()
	{
		return this;
	}
	
	public IrExpression reduce()
	{
		return this;
	}
	
	public void emitJumps(String condition, int trueClause, int falseClause)
	{
		if (trueClause != 0 && falseClause != 0)
		{
			emit("if " + condition + " goto L" + trueClause);
			emit("goto L" + falseClause);
		}
		else if(trueClause != 0)
		{
			emit("if " + condition + " goto L" + trueClause);
		}
		else if(falseClause != 0)
		{
			emit("iffalse " + condition + " goto L" + falseClause);
		}
	}
	
	public void jumping(int trueClause, int falseClause)
	{
		emitJumps(toString(), trueClause, falseClause);
	}
	
	public String toString() 
	{
		return _text;
	}

}

