package IR;

public class IrType extends IrNode {
	
	private int _size = 0; //size in byte(s)
	private String _name = ""; // name of type
	
	public String GetName(){
		return _name;
	}
	
	public int GetSize(){
		return _size;
	}
	public IrType(String name, int size){
		_size = size;
		_name = name;	
	}
	
	public static final IrType INT = new IrType("int", 4);
	public static final IrType BOOLEAN = new IrType("boolean", 1);
	public static final IrType CHAR = new IrType("char", 1);
	public static final IrType DECAFVOID = new IrType("void", 0);
	
	public static boolean numeric(IrType p)
	{
		return p == IrType.CHAR || p == IrType.INT;
	}
	
	public static IrType max(IrType p1, IrType p2)
	{
		if(!numeric(p1) || !numeric(p2)) return null;
		else if(p1 == IrType.INT) return IrType.INT;
		else return IrType.CHAR;
	}
}
