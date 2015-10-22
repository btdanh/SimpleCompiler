import org.antlr.v4.runtime.misc.NotNull;

import DecafException.DecafError;
import DecafException.DecafErrorManager;
import IR.*;


public class IrDecafParserVisitor extends DecafParserBaseVisitor<IrNode> {

	private SymbolTable _topTable;

	public IrDecafParserVisitor(){
		_topTable = new SymbolTable(null);
	}
	@Override public IrNode visitProgram(@NotNull DecafParser.ProgramContext ctx) 
	{
		IrProgram node = new IrProgram();
		for (DecafParser.Field_declContext fieldCtx : ctx.field_decl()) {
			IrFieldDecl f = (IrFieldDecl)visit(fieldCtx);
			node.PushField(f);
		}
		return node;
	}
	
	@Override public IrNode visitType(@NotNull DecafParser.TypeContext ctx) 
	{		
		switch (ctx.op.getType()) {
		case DecafLexer.INT:
			return IrType.INT;		
			
		case DecafLexer.BOOLEAN:
			return IrType.BOOLEAN;
		
		default:
			return null;			
		}			
	}
	
	@Override public IrNode visitLiteral(@NotNull DecafParser.LiteralContext ctx) 
	{ 
		switch (ctx.op.getType()) {
		case DecafLexer.INT_LITERAL:
			int number = Integer.parseInt(ctx.op.getText());
			return new IrIntLiteral(number);		
			
		case DecafLexer.BOOL_LITERAL:
			Boolean b = ctx.op.getText().equals("true") ? true : false;
			return new IrBooleanLiteral(b);
			
		case DecafLexer.CHAR_LITERAL:			
			return new IrCharLiteral(ctx.op.getText().charAt(0));
			
		default:
			return null;
		}		
	}
	
	/* -------------- Implement for Expr ----------------------
	 * 
	 */
	@Override public IrNode visitLocationExpr(@NotNull DecafParser.LocationExprContext ctx) 
	{ 
		return visit(ctx.location()); 
	}
	
	@Override public IrNode visitMethodCallExpr(@NotNull DecafParser.MethodCallExprContext ctx) 
	{ 
		return visit(ctx.method_call()); 
	}	
	
	@Override public IrNode visitLiteralExpr(@NotNull DecafParser.LiteralExprContext ctx) 
	{ 
		return visit(ctx.literal()); 
	}
	
	@Override public IrNode visitBinLiteralExpr(@NotNull DecafParser.BinLiteralExprContext ctx) 
	{ 
		return visitChildren(ctx); 
	}
	
	@Override public IrNode visitParenExpr(@NotNull DecafParser.ParenExprContext ctx) 
	{ 
		return visit(ctx.expr());		 
	}	
	/*
	 *  ------------------ Field declare ------------------------
	 */
	@Override public IrNode visitField_decl(@NotNull DecafParser.Field_declContext ctx) 
	{ 
		IrFieldDecl declNode = new IrFieldDecl();
		
		IrType typeNode = (IrType)visit(ctx.type());

		for (DecafParser.Field_decl_nameContext nameCtx : ctx.field_decl_name()) {
			IrNode node = visit(nameCtx);
			if (node == null) continue;
			IrFieldIdentifier field = (IrFieldIdentifier)node;
			if (field.GetCategory() == IrFieldIdentifier.SINGLE){
				declNode.Add(field.GetName(), typeNode);
			}
			else{
				declNode.Add(field.GetName(), new IrArray(typeNode, field.GetSize()));
			}
		}
		return declNode;
	}
	
	@Override public IrNode visitSingleFieldDecl(@NotNull DecafParser.SingleFieldDeclContext ctx) 
	{ 	
		String identifier = ctx.IDENTIIER().getText();
		int line = ctx.start.getCharPositionInLine();
		if(_topTable.Lookup(identifier) != null){
			
			String message = "\"" + ctx.getText() + "\" already declared";
			DecafErrorManager.Instance().Push(new DecafError(message, line));
			return null;
		}
		return new IrFieldIdentifier(ctx.getText(), IrFieldIdentifier.SINGLE, 0);		 
	}
	
	@Override public IrNode visitArrayFieldDecl(@NotNull DecafParser.ArrayFieldDeclContext ctx) 
	{ 
		String identifier = ctx.IDENTIIER().getText();
		int line = ctx.start.getCharPositionInLine();
		if(_topTable.Lookup(identifier) != null){
			// Error duplicate name
			String message = "\"" + ctx.getText() + "\" already declared";
			DecafError error = new DecafError(message, line);
			
			DecafErrorManager.Instance().Push(error);
			return null;
		}
		int size = Integer.parseInt(ctx.INT_LITERAL().getText());
		if(size > 0)
			return new IrFieldIdentifier(ctx.getText(), IrFieldIdentifier.ARRAY, size);
		
		String message = "Size of array " + identifier + " should be greater than 0";
		DecafErrorManager.Instance().Push(new DecafError(message, line));
		return null;
		
	}
}
