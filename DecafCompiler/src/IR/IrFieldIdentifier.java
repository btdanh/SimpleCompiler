package IR;

public class IrFieldIdentifier extends IrNode {
	
	public static final int SINGLE = 1;
	public static final int ARRAY = 2;
	private String _name;
	private int _category;
	private int _size;
	
	public String GetName(){
		return _name;
	}
	
	public int GetCategory(){
		return _category;
	}
	
	public int GetSize(){
		return _size;
	}
	
	public IrFieldIdentifier(String name, int category, int size){
		_name = name;
		_category = category;
		_size = size;
	}
}
