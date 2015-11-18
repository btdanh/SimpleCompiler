package IR;

public class IrBreakStmt extends IrStatement{
	IrStatement stmt;
	public IrBreakStmt() {
		if (IrStatement.EnclosingStmt == null) 
			error("unenclosed break");
		stmt = IrStatement.EnclosingStmt;
	}
	
	public void generate(int b, int a) 
	{
		emit("goto L" + stmt.after);
	}
}
