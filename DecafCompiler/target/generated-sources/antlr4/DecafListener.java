// Generated from Decaf.g4 by ANTLR 4.4
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DecafParser}.
 */
public interface DecafListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DecafParser#method_decl_s}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl_s(@NotNull DecafParser.Method_decl_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl_s}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl_s(@NotNull DecafParser.Method_decl_sContext ctx);
	/**
	 * Enter a parse tree produced by {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void enterInt_literal(@NotNull DecafParser.Int_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#int_literal}.
	 * @param ctx the parse tree
	 */
	void exitInt_literal(@NotNull DecafParser.Int_literalContext ctx);
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
	 * Enter a parse tree produced by {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 */
	void enterField_decl_name(@NotNull DecafParser.Field_decl_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_decl_name}.
	 * @param ctx the parse tree
	 */
	void exitField_decl_name(@NotNull DecafParser.Field_decl_nameContext ctx);
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
	 * Enter a parse tree produced by {@link DecafParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(@NotNull DecafParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(@NotNull DecafParser.IdContext ctx);
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
	 * Enter a parse tree produced by {@link DecafParser#field_decl_s}.
	 * @param ctx the parse tree
	 */
	void enterField_decl_s(@NotNull DecafParser.Field_decl_sContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#field_decl_s}.
	 * @param ctx the parse tree
	 */
	void exitField_decl_s(@NotNull DecafParser.Field_decl_sContext ctx);
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
	 * Enter a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void enterMethod_decl(@NotNull DecafParser.Method_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link DecafParser#method_decl}.
	 * @param ctx the parse tree
	 */
	void exitMethod_decl(@NotNull DecafParser.Method_declContext ctx);
}