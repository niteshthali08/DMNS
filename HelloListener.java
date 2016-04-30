// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(HelloParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(HelloParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(HelloParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(HelloParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(HelloParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(HelloParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(HelloParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(HelloParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(HelloParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statement(HelloParser.Else_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statement(HelloParser.Else_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void enterWhile_condition(HelloParser.While_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#while_condition}.
	 * @param ctx the parse tree
	 */
	void exitWhile_condition(HelloParser.While_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(HelloParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(HelloParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(HelloParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void enterCondition_expression(HelloParser.Condition_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#condition_expression}.
	 * @param ctx the parse tree
	 */
	void exitCondition_expression(HelloParser.Condition_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func}.
	 * @param ctx the parse tree
	 */
	void enterFunc(HelloParser.FuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func}.
	 * @param ctx the parse tree
	 */
	void exitFunc(HelloParser.FuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void enterFunc_declaration(HelloParser.Func_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func_declaration}.
	 * @param ctx the parse tree
	 */
	void exitFunc_declaration(HelloParser.Func_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fname}.
	 * @param ctx the parse tree
	 */
	void enterFname(HelloParser.FnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fname}.
	 * @param ctx the parse tree
	 */
	void exitFname(HelloParser.FnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func_body}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body(HelloParser.Func_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func_body}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body(HelloParser.Func_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(HelloParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(HelloParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#func_name}.
	 * @param ctx the parse tree
	 */
	void enterFunc_name(HelloParser.Func_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#func_name}.
	 * @param ctx the parse tree
	 */
	void exitFunc_name(HelloParser.Func_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#fcall}.
	 * @param ctx the parse tree
	 */
	void enterFcall(HelloParser.FcallContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#fcall}.
	 * @param ctx the parse tree
	 */
	void exitFcall(HelloParser.FcallContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void enterParamlist(HelloParser.ParamlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#paramlist}.
	 * @param ctx the parse tree
	 */
	void exitParamlist(HelloParser.ParamlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stack}.
	 * @param ctx the parse tree
	 */
	void enterStack(HelloParser.StackContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stack}.
	 * @param ctx the parse tree
	 */
	void exitStack(HelloParser.StackContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stack_declaration}.
	 * @param ctx the parse tree
	 */
	void enterStack_declaration(HelloParser.Stack_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stack_declaration}.
	 * @param ctx the parse tree
	 */
	void exitStack_declaration(HelloParser.Stack_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stack_push}.
	 * @param ctx the parse tree
	 */
	void enterStack_push(HelloParser.Stack_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stack_push}.
	 * @param ctx the parse tree
	 */
	void exitStack_push(HelloParser.Stack_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stack_pop}.
	 * @param ctx the parse tree
	 */
	void enterStack_pop(HelloParser.Stack_popContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stack_pop}.
	 * @param ctx the parse tree
	 */
	void exitStack_pop(HelloParser.Stack_popContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#stack_empty}.
	 * @param ctx the parse tree
	 */
	void enterStack_empty(HelloParser.Stack_emptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#stack_empty}.
	 * @param ctx the parse tree
	 */
	void exitStack_empty(HelloParser.Stack_emptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#popt}.
	 * @param ctx the parse tree
	 */
	void enterPopt(HelloParser.PoptContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#popt}.
	 * @param ctx the parse tree
	 */
	void exitPopt(HelloParser.PoptContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(HelloParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(HelloParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void enterAlphanumeric(HelloParser.AlphanumericContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#alphanumeric}.
	 * @param ctx the parse tree
	 */
	void exitAlphanumeric(HelloParser.AlphanumericContext ctx);
}