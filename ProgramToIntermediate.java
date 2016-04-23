import java.util.*;


public class ProgramToIntermediate extends HelloBaseListener {

	//Stores all the variables used in the program
	public ArrayList<String> variables = new ArrayList<String>();
	//For generating Temp variables
	TempVariable temp_variable = new TempVariable(this);
	//For Assignment of variables
	HashMap<String,String> ass_dict = new HashMap<String,String>();
	Stack<String> ass_stack = new Stack<String>();
	//the statement array
	ArrayList<String> statements = new ArrayList<String>();
	//Expression stack
	Stack<String> expr_stack = new Stack<String>();
	//Stack for maintaining If,while end conditions & relational operations order
	Stack<String> block_stack = new Stack<String>();
	ArrayList<String> ops = new ArrayList<String>();






	
	@Override public void enterProgram(HelloParser.ProgramContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitProgram(HelloParser.ProgramContext ctx) { 
		for(String line:statements){
			System.out.println(line);
		}

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterLine(HelloParser.LineContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitLine(HelloParser.LineContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAssignment(HelloParser.AssignmentContext ctx) { 
		String identifier = String.valueOf(ctx.ID(0));
		ass_dict.put(identifier,"");
		ass_stack.push(identifier);		
		if (ctx.BOOLEXPR()!=null)
		{
			System.out.println(ctx.BOOLEXPR());			
			ass_dict.put(identifier,ctx.BOOLEXPR().getText().toString());		
		}
		if (ctx.ID(1)!=null)
		{
			ass_dict.put(identifier,ctx.ID(1).toString());			
		}
		if (ctx.NUMBER()!=null)
		{	
			ass_dict.put(identifier,String.valueOf(ctx.NUMBER().getText()));				
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAssignment(HelloParser.AssignmentContext ctx) { 
		String identifier = String.valueOf(ctx.ID(0));
		statements.add("MOVE "+identifier+" "+ass_dict.get(identifier));
		ass_stack.pop();
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterExpr(HelloParser.ExprContext ctx) { 							
			if (ctx.term(0).NUMBER()!=null && ctx.term(1).NUMBER()!=null)
			{
				//They're both literals add em
				int m = Integer.valueOf(ctx.term(0).NUMBER().getText());
				int n = Integer.valueOf(ctx.term(1).NUMBER().getText());
				if (ctx.ARITHOPERATOR().getText().equals("+"))
				{					
					expr_stack.push(String.valueOf(m+n));				
				}
				if (ctx.ARITHOPERATOR().getText().equals("-"))
				{					
					expr_stack.push(String.valueOf(m-n));				
				}
				if (ctx.ARITHOPERATOR().getText().equals("*"))
				{					
					expr_stack.push(String.valueOf(m*n));				
				}
				if (ctx.ARITHOPERATOR().getText().equals("/"))
				{					
					expr_stack.push(String.valueOf(m/n));				
				}
				
			}
			else if (ctx.term(0).ID()!=null && ctx.term(1).ID()!=null)
			{
				//They're both literals add em
				String id1 = String.valueOf(ctx.term(0).ID());
				String id2 = String.valueOf(ctx.term(1).ID());				
				String temp = temp_variable.get_variable();
				this.expression_string(temp,id1,id2,ctx.ARITHOPERATOR().getText());
				expr_stack.push(temp);
			}
			else if (ctx.term(0).ID()!=null)
			{
				String id1 = String.valueOf(ctx.term(0).ID());
				String temp = temp_variable.get_variable();
				String temp2 = temp_variable.get_variable();
				statements.add("MOVE "+temp+" "+String.valueOf(ctx.term(1).NUMBER().getText()));
				this.expression_string(temp2,id1,temp,ctx.ARITHOPERATOR().getText());
				expr_stack.push(temp2);				
			}
			else
			{
				String id1 = String.valueOf(ctx.term(1).ID());
				String temp = temp_variable.get_variable();
				String temp2 = temp_variable.get_variable();
				statements.add("MOVE "+temp+" "+String.valueOf(ctx.term(0).NUMBER().getText()));
				this.expression_string(temp2,temp,id1,ctx.ARITHOPERATOR().getText());
				expr_stack.push(temp2);				
			}										
	}

	private void expression_string(String temp,String id1,String id2,String operation)
	{
		if (operation.equals("+"))
			{					
				statements.add("ADD "+temp+" "+id1+" "+id2);				
			}
			if (operation.equals("-"))
			{					
				statements.add("SUB "+temp+" "+id1+" "+id2);				
			}
			if (operation.equals("*"))
			{					
				statements.add("MUL "+temp+" "+id1+" "+id2);				
			}
			if (operation.equals("/"))
			{					
				statements.add("DIV "+temp+" "+id1+" "+id2);				
			}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitExpr(HelloParser.ExprContext ctx) { 
		ass_dict.put(ass_stack.peek(),expr_stack.pop());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterTerm(HelloParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitTerm(HelloParser.TermContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterIf_condition(HelloParser.If_conditionContext ctx) { 
			 statements.add("ISTR");
	         block_stack.push(String.valueOf("IEND"));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitIf_condition(HelloParser.If_conditionContext ctx) { 
  		     statements.add(block_stack.pop());	

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterElse_statement(HelloParser.Else_statementContext ctx) { 
		     statements.add("ESTR");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitElse_statement(HelloParser.Else_statementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterWhile_condition(HelloParser.While_conditionContext ctx) { 
	         statements.add("WSTR");
			 block_stack.push(String.valueOf("WEND"));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitWhile_condition(HelloParser.While_conditionContext ctx) { 
			 statements.add(block_stack.pop());	
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondition(HelloParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondition(HelloParser.ConditionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStatement(HelloParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStatement(HelloParser.StatementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterCondition_expression(HelloParser.Condition_expressionContext ctx) { 
		ops.clear();
		String operand ="";

		if (ctx.ID(0) !=null )
			 ops.add(ctx.ID(0).getText());
		if (ctx.NUMBER(0) !=null)
			 ops.add(ctx.NUMBER(0).getText());
		if (ctx.ID(1)!=null)
			 ops.add(ctx.ID(1).getText());
		if (ctx.NUMBER(1)!=null)
			 ops.add(ctx.NUMBER(1).getText());
		if (ctx.BOOLEXPR()!=null)
			 ops.add(ctx.BOOLEXPR().getText());	
	
		switch(ctx.RELOPERATORS().getText())
		{
			case "<":
			  operand = "CLES"; 
			  break;
			case ">":
			  operand = "CGTR"; 
			  break;  
			case "==":
			  operand = "CEQL";
			  break;  
			case "<=":
			  operand = "CLEQ"; 
			  break;
			case ">=":
			  operand = "CGEQ" ;
			  break; 
            case "!=":
			  operand = "NTEQ" ;
			  break; 
			default:
				break;
		}
		statements.add(operand+" "+ops.get(0)+" "+ops.get(1));
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitCondition_expression(HelloParser.Condition_expressionContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc(HelloParser.FuncContext ctx) { 

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc(HelloParser.FuncContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_declaration(HelloParser.Func_declarationContext ctx) { 
		// System.out.println(ctx.fname().func_name().ID());
		statements.add("FSTR "+ctx.fname().func_name().ID().toString());

	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_declaration(HelloParser.Func_declarationContext ctx) { 
		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFname(HelloParser.FnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFname(HelloParser.FnameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_body(HelloParser.Func_bodyContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_body(HelloParser.Func_bodyContext ctx) { 
		statements.add("FEND");
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterReturn_statement(HelloParser.Return_statementContext ctx) { 
		if (ctx.ID()!=null)
		{
			statements.add("SEND "+ctx.ID().toString());			
		}
		else
		{
			statements.add("SEND "+String.valueOf(ctx.NUMBER().getText()));				
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitReturn_statement(HelloParser.Return_statementContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFunc_name(HelloParser.Func_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFunc_name(HelloParser.Func_nameContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterFcall(HelloParser.FcallContext ctx) { 
		statements.add("FCALL "+ ctx.fname().func_name().ID().toString());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitFcall(HelloParser.FcallContext ctx) { 
		statements.add("LOAD "+ ctx.ID());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterParamlist(HelloParser.ParamlistContext ctx) {
		System.out.println("In param list");
		System.out.println(ctx.getParent().getParent().getClass().toString());
		if (ctx.getParent().getParent().getClass().toString().equals(HelloParser.FcallContext.class.toString())) 
		{
			statements.add("PSTART");
			for (int i=0;i<ctx.ID().size() ;i++ )
				{
					statements.add("PUSH "+ctx.ID(i).toString());			
				}
			statements.add("PSTART");
		}		
		else
		{
			for (int i=0;i<ctx.ID().size() ;i++ )
				{
					statements.add("LOAD "+ctx.ID(i).toString());			
				}
		}
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitParamlist(HelloParser.ParamlistContext ctx) { 		
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStack(HelloParser.StackContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStack(HelloParser.StackContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStack_declaration(HelloParser.Stack_declarationContext ctx) {
		//	: 'stack' ID;
		statements.add("STACK"+" "+ctx.ID().getText());
	 }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStack_declaration(HelloParser.Stack_declarationContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStack_push(HelloParser.Stack_pushContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStack_push(HelloParser.Stack_pushContext ctx) { 
		//	: ID 'push(' NUMBER ')'
		statements.add("SPUSH "+ctx.ID().getText()+" "+ctx.NUMBER().getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterStack_pop(HelloParser.Stack_popContext ctx) { 
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitStack_pop(HelloParser.Stack_popContext ctx) { 
		//stack_pop : ID '=' ID 'pop()'
		statements.add("MOV "+ctx.ID(0).getText()+" SPOP "+ctx.ID(1).getText());
	}
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterComments(HelloParser.CommentsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitComments(HelloParser.CommentsContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void enterAlphanumeric(HelloParser.AlphanumericContext ctx) { }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */
	@Override public void exitAlphanumeric(HelloParser.AlphanumericContext ctx) { }

	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation does nothing.</p>
	 */

}

class TempVariable{
	private String temp = "Temp";
	private char var = 'A';
	ProgramToIntermediate prog_to_inter;

	public TempVariable(ProgramToIntermediate prog)
	{
		this.prog_to_inter = prog;
	}

	public String get_variable()
	{
		String to_return = temp+String.valueOf(var);
		this.prog_to_inter.variables.add(to_return);
		++var;
		return to_return;
	}
}
