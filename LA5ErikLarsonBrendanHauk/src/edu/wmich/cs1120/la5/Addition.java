package edu.wmich.cs1120.la5;

public class Addition implements IOperation {

	/**
	 * adds the left and right expressions
	 * @return left.getValue() + right.getValue()
	 */
	@Override
	public Integer perform(IExpression left, IExpression right) {
		// TODO Auto-generated method stub
		return left.getValue() + right.getValue();
	}

}
