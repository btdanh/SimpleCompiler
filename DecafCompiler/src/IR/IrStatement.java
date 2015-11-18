package IR;

public class IrStatement extends IrNode {

	public IrStatement() 
	{
		
	}
	
	public static IrStatement NullStmt = new IrStatement();
	public void generate(int b, int a) 
	{
		
	}
	
	int after = 0;
	public static IrStatement EnclosingStmt = IrStatement.NullStmt;
}
