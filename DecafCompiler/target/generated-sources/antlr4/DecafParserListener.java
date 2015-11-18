// Generated from DecafParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code locationExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLocationExpr(@NotNull DecafParser.LocationExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code locationExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLocationExpr(@NotNull DecafParser.LocationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_decl_s}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl_s(@NotNull DecafParser.Var_decl_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_decl_s}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl_s(@NotNull DecafParser.Var_decl_sContext ctx);
	/**
	 * Enter a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpr(@NotNull DecafParser.LiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpr(@NotNull DecafParser.LiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull DecafParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull DecafParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void enterBin_op(@NotNull DecafParser.Bin_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 */
	void exitBin_op(@NotNull DecafParser.Bin_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull DecafParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull DecafParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void enterCallout_arg(@NotNull DecafParser.Callout_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 */
	void exitCallout_arg(@NotNull DecafParser.Callout_argContext ctx);
	/**
	 * Enter a parse tree produced by the {@code firstLocation}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterFirstLocation(@NotNull DecafParser.FirstLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code firstLocation}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitFirstLocation(@NotNull DecafParser.FirstLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void enterMethod_call(@NotNull DecafParser.Method_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 */
	void exitMethod_call(@NotNull DecafParser.Method_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegativeExpr(@NotNull DecafParser.NegativeExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegativeExpr(@NotNull DecafParser.NegativeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#param_decl_s}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl_s(@NotNull DecafParser.Param_decl_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#param_decl_s}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl_s(@NotNull DecafParser.Param_decl_sContext ctx);
	/**
	 * Enter a parse tree produced by the {@code secondLocation}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void enterSecondLocation(@NotNull DecafParser.SecondLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code secondLocation}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 */
	void exitSecondLocation(@NotNull DecafParser.SecondLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleFieldDecl}
	 * labeled alternative in {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 */
	void enterSingleFieldDecl(@NotNull DecafParser.SingleFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleFieldDecl}
	 * labeled alternative in {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 */
	void exitSingleFieldDecl(@NotNull DecafParser.SingleFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void enterMethod_name(@NotNull DecafParser.Method_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 */
	void exitMethod_name(@NotNull DecafParser.Method_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(@NotNull DecafParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(@NotNull DecafParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement_s}.
	 * @param ctx the parse tree
	 */
	void enterStatement_s(@NotNull DecafParser.Statement_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement_s}.
	 * @param ctx the parse tree
	 */
	void exitStatement_s(@NotNull DecafParser.Statement_sContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arrayFieldDecl}
	 * labeled alternative in {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 */
	void enterArrayFieldDecl(@NotNull DecafParser.ArrayFieldDeclContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arrayFieldDecl}
	 * labeled alternative in {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 */
	void exitArrayFieldDecl(@NotNull DecafParser.ArrayFieldDeclContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binLiteralExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBinLiteralExpr(@NotNull DecafParser.BinLiteralExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binLiteralExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBinLiteralExpr(@NotNull DecafParser.BinLiteralExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull DecafParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull DecafParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void enterField_decl(@NotNull DecafParser.Field_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 */
	void exitField_decl(@NotNull DecafParser.Field_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void enterParam_decl(@NotNull DecafParser.Param_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#param_decl}.
	 * @param ctx the parse tree
	 */
	void exitParam_decl(@NotNull DecafParser.Param_declContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(@NotNull DecafParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(@NotNull DecafParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMethodCallExpr(@NotNull DecafParser.MethodCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMethodCallExpr(@NotNull DecafParser.MethodCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(@NotNull DecafParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(@NotNull DecafParser.Method_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull DecafParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull DecafParser.LiteralContext ctx);
}