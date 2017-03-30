package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	/**
	 * allows other classes to get the expressions
	 * @param operator
	 * @param val1
	 * @param val2
	 * @return i
	 */
	public static IExpression getExpression(char operator, int val1, int val2) {
		IExpression i = new BinaryExpression(val1, val2, operator);
		return i;
	}
}
