package IR;

public class IrTemp extends IrExpression {
	static int count = 0;
	int number;
	
	public IrTemp(IrType p)
	{
		super("t", p);
		number = ++count;
	}
	public String toString()
	{
		return "t" + number;
	}
}
