package IR;

public class IrDoStmt extends IrStatement {
	IrExpression expr;
	IrStatement stmt;
	
	public IrDoStmt() 
	{
		// TODO Auto-generated constructor stub
		 expr = null; stmt = null; 
	}
	
	public void init(IrStatement s, IrExpression x) 
	{
		expr = x;
		stmt = s;
		if (expr.GetType() != IrType.BOOLEAN) 
			expr.error("boolean required in do");
	}
	
	public void generate(int b, int a) 
	{
		after = a;
		int label = newLabel();
		stmt.generate(b, label);
		emitLabel(label);
		expr.jumping(b, 0);
	}
}
