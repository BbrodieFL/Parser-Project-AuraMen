// Generated from grammar/Python3.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Python3Parser}.
 */
public interface Python3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Python3Parser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(Python3Parser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(Python3Parser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Python3Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Python3Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(Python3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(Python3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#statement_inif}.
	 * @param ctx the parse tree
	 */
	void enterStatement_inif(Python3Parser.Statement_inifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#statement_inif}.
	 * @param ctx the parse tree
	 */
	void exitStatement_inif(Python3Parser.Statement_inifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Python3Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Python3Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(Python3Parser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(Python3Parser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void enterElif_statement(Python3Parser.Elif_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#elif_statement}.
	 * @param ctx the parse tree
	 */
	void exitElif_statement(Python3Parser.Elif_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(Python3Parser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(Python3Parser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_statement(Python3Parser.For_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#for_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_statement(Python3Parser.For_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(Python3Parser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(Python3Parser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_statement(Python3Parser.Comment_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#comment_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_statement(Python3Parser.Comment_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(Python3Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(Python3Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#block_inif}.
	 * @param ctx the parse tree
	 */
	void enterBlock_inif(Python3Parser.Block_inifContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#block_inif}.
	 * @param ctx the parse tree
	 */
	void exitBlock_inif(Python3Parser.Block_inifContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(Python3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(Python3Parser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(Python3Parser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(Python3Parser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(Python3Parser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(Python3Parser.ListContext ctx);
}