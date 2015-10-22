// Generated from DecafParser.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DecafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DecafParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code locationExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationExpr(@NotNull DecafParser.LocationExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var_decl_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl_s(@NotNull DecafParser.Var_decl_sContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralExpr(@NotNull DecafParser.LiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull DecafParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#bin_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBin_op(@NotNull DecafParser.Bin_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull DecafParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#callout_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallout_arg(@NotNull DecafParser.Callout_argContext ctx);
	/**
	 * Visit a parse tree produced by the {@code firstLocation}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirstLocation(@NotNull DecafParser.FirstLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_call(@NotNull DecafParser.Method_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExpr(@NotNull DecafParser.NegativeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#param_decl_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl_s(@NotNull DecafParser.Param_decl_sContext ctx);
	/**
	 * Visit a parse tree produced by the {@code secondLocation}
	 * labeled alternative in {@link DecafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecondLocation(@NotNull DecafParser.SecondLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleFieldDecl}
	 * labeled alternative in {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFieldDecl(@NotNull DecafParser.SingleFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_name(@NotNull DecafParser.Method_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(@NotNull DecafParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#statement_s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement_s(@NotNull DecafParser.Statement_sContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayFieldDecl}
	 * labeled alternative in {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayFieldDecl(@NotNull DecafParser.ArrayFieldDeclContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binLiteralExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinLiteralExpr(@NotNull DecafParser.BinLiteralExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull DecafParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull DecafParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#field_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitField_decl(@NotNull DecafParser.Field_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#param_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_decl(@NotNull DecafParser.Param_declContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(@NotNull DecafParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code methodCallExpr}
	 * labeled alternative in {@link DecafParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCallExpr(@NotNull DecafParser.MethodCallExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(@NotNull DecafParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod_decl(@NotNull DecafParser.Method_declContext ctx);
}