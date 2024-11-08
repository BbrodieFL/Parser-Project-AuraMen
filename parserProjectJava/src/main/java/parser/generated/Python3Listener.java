// Generated from Python3.g4 by ANTLR 4.9.2
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
}