package IR;

import java.util.*;
public class IrProgram extends IrNode {
	private List<IrFieldDecl> _fields;
	private List<IrMethodDecl> _methods;
	
	public IrProgram(){
		_fields = new ArrayList<IrFieldDecl>();
		_methods = new ArrayList<IrMethodDecl>();
	}
	
	public List<IrFieldDecl> GetFields(){
		return _fields;
	}
	
	public List<IrMethodDecl> GetMethods(){
		return _methods;
	}
	
	public void PushField(IrFieldDecl f){
		_fields.add(f);
	}
	
	public void PushMethod(IrMethodDecl m){
		_methods.add(m);
	}
}
