// Generated from Hello.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link HelloParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface HelloVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link HelloParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(HelloParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(HelloParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(HelloParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(HelloParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(HelloParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(HelloParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(HelloParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#while_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_condition(HelloParser.While_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(HelloParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(HelloParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#condition_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_expression(HelloParser.Condition_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#func}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc(HelloParser.FuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#func_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_declaration(HelloParser.Func_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#fname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFname(HelloParser.FnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#func_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body(HelloParser.Func_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(HelloParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#func_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_name(HelloParser.Func_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#fcall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFcall(HelloParser.FcallContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#paramlist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamlist(HelloParser.ParamlistContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stack}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack(HelloParser.StackContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stack_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_declaration(HelloParser.Stack_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stack_push}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_push(HelloParser.Stack_pushContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stack_pop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_pop(HelloParser.Stack_popContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#stack_empty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStack_empty(HelloParser.Stack_emptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#popt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPopt(HelloParser.PoptContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(HelloParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by {@link HelloParser#alphanumeric}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphanumeric(HelloParser.AlphanumericContext ctx);
}