package IR;

public class IrType extends IrNode {
	
	public int _size = 0; //size in byte(s)
	public String _name = ""; // name of type
	
	public IrType(String name, int size){
		_size = size;
		_name = name;	
	}
	
	public static final IrType INT = new IrType("int", 4);
	public static final IrType BOOLEAN = new IrType("boolean", 1);
	public static final IrType CHAR = new IrType("char", 1);
	public static final IrType DECAFVOID = new IrType("void", 0);
}
