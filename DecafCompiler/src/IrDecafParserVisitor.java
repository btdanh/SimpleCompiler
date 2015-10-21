import org.antlr.v4.runtime.misc.NotNull;

import DecafException.DecafError;
import DecafException.DecafErrorManager;
import IR.*;

public class IrDecafParserVisitor extends DecafParserBaseVisitor<IrNode> {

	SymbolTable _topTable = new SymbolTable(null);
	
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
	@Override public IrNode visitSingleFieldDecl(@NotNull DecafParser.SingleFieldDeclContext ctx) 
	{ 	
		if(_topTable.Lookup(ctx.getText()) != null){
			int line = ctx.start.getCharPositionInLine();
			String message = "\"" + ctx.getText() + "\" already declared";
			DecafError error = new DecafError(message, line);
			
			DecafErrorManager.Instance().Push(error);
			return null;
		}
		return IrNameNode(ctx.getText());
		
		if(_topTable.Push(ctx.getText(), null, 0))
		{
			return new IrFieldDecl(ctx.getText(), null);
		}
		else{
			
		}		 
	}
	
	@Override public IrNode visitArrayFieldDecl(@NotNull DecafParser.ArrayFieldDeclContext ctx) 
	{ 
		if(_topTable.Push(ctx.getText(), null, 0))
		{
			return new IrFieldDecl(ctx.getText(), null);
		}
		else{
			int line = ctx.start.getCharPositionInLine();
			String message = "\"" + ctx.getText() + "\" already declared";
			DecafError error = new DecafError(message, line);
			
			DecafErrorManager.Instance().Push(error);
			return null;
		}
	}
}
