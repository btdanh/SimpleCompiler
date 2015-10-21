package IR;

public class IrFieldDecl extends IrMemberDecl{
	public String _name;
	public IrType _type;
	
	public IrFieldDecl(String name, IrType idType){
		_name = name;
		_type = idType;
	}
}
