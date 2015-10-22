package IR;

public class IrExpression extends IrNode {
	private IrType _type;
	
	public IrType GetType(){
		return _type;
	}
	public IrExpression(IrType type){		
		_type = type;
	}
}

