package assignments.chap3;

public class PE321 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 1;
		int y = 2;
		
		//x = y && y;
			//- Comparing identical expressions
			//- The operator && is undefined for the argument type(s) int, int
		//x > y > 0;
			//- Syntax error on token ">", invalid AssignmentOperator
			//- Type mismatch: cannot convert from boolean to int
		//x /= y;
			//This one works.
		//x or y;
			//- x cannot be resolved to a type
			//- Syntax error on token "y", delete this token
		//x and y;
			//- Syntax error on token "y", delete this token
			//- x cannot be resolved to a type
		//(x != 0) || (x = 0);
			//- The left-hand side of an assignment must be a variable
		 	//- Syntax error on token "||", invalid AssignmentOperator
		
		
//It seems that "x /= y" is the only legal Java expression in this list.
		
		
	}

}
