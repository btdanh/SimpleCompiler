package IR;

public class IrConstant extends IrExpression{

	public IrConstant(String tok, IrType p)
	{
		super(tok, p);
	}
	public IrConstant(int i)
	{
		super("" + i, IrType.INT);
	}
	
	public static final IrConstant True = new IrConstant("true", IrType.BOOLEAN);
	public static final IrConstant False = new IrConstant("false", IrType.BOOLEAN);
	
	public void jumping(int trueClause, int falseClause)
	{
		if(this == True && trueClause != 0)
			emit("goto L" + trueClause);
		else if(this == False && falseClause != 0)
			emit("goto L" + falseClause);
	}
	
}
