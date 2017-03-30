package edu.wmich.cs1120.la5;

public class BinaryExpression implements IExpression {
	
	private char op;
	private int left;
	private int right;
	Integer val;
	/**
	 * sets the binary expressions
	 * @param left
	 * @param right
	 * @param op
	 */
	public BinaryExpression(int left, int right, char op){
		this.op = op;
		this.left = left;
		this.right = right;
	}
	/**
	 * gets the value
	 * @param val
	 */
	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return val;
	}

}
