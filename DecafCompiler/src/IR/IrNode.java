package IR;

public class IrNode {
	
	static int labels = 0;
	
	void error(String s)
	{
		throw new Error(s);
	}

	public static int newLabel()
	{
		return ++labels;
	}
	
	public static void emitLabel(int i)
	{
		System.out.print("L" + i + ":");		
	}
	
	public static void emit(String s)
	{
		System.out.println("\t" + s);
	}
}
