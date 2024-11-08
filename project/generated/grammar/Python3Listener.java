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
	 * Enter a parse tree produced by {@link Python3Parser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_stmt(Python3Parser.Assignment_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assignment_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_stmt(Python3Parser.Assignment_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(Python3Parser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(Python3Parser.Assignment_operatorContext ctx);
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
	 * Enter a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(Python3Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(Python3Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void enterArithmetic_operator(Python3Parser.Arithmetic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#arithmetic_operator}.
	 * @param ctx the parse tree
	 */
	void exitArithmetic_operator(Python3Parser.Arithmetic_operatorContext ctx);
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