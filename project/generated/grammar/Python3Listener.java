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
	 * Enter a parse tree produced by {@link Python3Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(Python3Parser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(Python3Parser.BlockStatementContext ctx);
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
	 * Enter a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(Python3Parser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(Python3Parser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(Python3Parser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(Python3Parser.AndExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpr(Python3Parser.StringExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpr(Python3Parser.StringExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(Python3Parser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(Python3Parser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFloatExpr(Python3Parser.FloatExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFloatExpr(Python3Parser.FloatExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(Python3Parser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SubExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(Python3Parser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NegExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegExpr(Python3Parser.NegExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NegExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegExpr(Python3Parser.NegExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(Python3Parser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(Python3Parser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(Python3Parser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OrExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(Python3Parser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(Python3Parser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DivExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(Python3Parser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompareExpr(Python3Parser.CompareExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompareExpr(Python3Parser.CompareExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVarExpr(Python3Parser.VarExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVarExpr(Python3Parser.VarExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(Python3Parser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(Python3Parser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIntExpr(Python3Parser.IntExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIntExpr(Python3Parser.IntExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListExpr(Python3Parser.ListExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListExpr(Python3Parser.ListExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModExpr(Python3Parser.ModExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModExpr(Python3Parser.ModExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(Python3Parser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(Python3Parser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFuncCallExpr(Python3Parser.FuncCallExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCallExpr}
	 * labeled alternative in {@link Python3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFuncCallExpr(Python3Parser.FuncCallExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link Python3Parser#paramExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamExpr(Python3Parser.ParamExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Python3Parser#paramExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamExpr(Python3Parser.ParamExprContext ctx);
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