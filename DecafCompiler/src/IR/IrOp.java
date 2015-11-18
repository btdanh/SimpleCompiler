package IR;

public class IrOp extends IrExpression {

	public IrOp(String tok, IrType p)
	{
		super(tok, p);
	}
	
	public IrExpression reduce()
	{
		IrExpression x = generate();
		IrTemp t = new IrTemp(GetType());
		emit(t.toString() + " = " + x.toString());
		
		return t;
	}
}
