package IR;

public class IrAccess extends IrOp {
	public IrFieldIdentifier array;
	public IrExpression index;
	
	public IrAccess(IrFieldIdentifier a, IrExpression i, IrType p)
	{
		super("[]", p);		
		array = a;
		index = i;
	}
	
	public IrExpression generate()
	{
		return new IrAccess(array, index.reduce(), GetType());
	}
	
	public void jumping(int trueClause, int falseClause)
	{
		emitJumps(reduce().toString(), trueClause, falseClause);
	}
	
	public String toString()
	{
		return array.toString() + " [ " + index.toString() + " ]";
	}
	
}
