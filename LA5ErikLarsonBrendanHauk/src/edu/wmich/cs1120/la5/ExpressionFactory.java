package edu.wmich.cs1120.la5;

public class ExpressionFactory {

	public static IExpression getExpression(char operator, int val1, int val2) {
		IExpression i = new BinaryExpression(val1, val2, operator);
		return i;
	}
}
