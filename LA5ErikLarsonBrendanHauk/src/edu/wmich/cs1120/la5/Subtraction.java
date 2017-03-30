package edu.wmich.cs1120.la5;

public class Subtraction implements IOperation {

	/**
	 * Subtracts the left and right expressions
	 * @param left
	 * @param right
	 * @return left.getValue() - right.getValue()
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		// TODO Auto-generated method stub
		return left.getValue() - right.getValue();
	}

}
