package edu.wmich.cs1120.la5;

public class Literal implements IExpression {
	
	private Integer val;
	
	/**
	 * sets the variable val
	 * @param value
	 */
	public Literal(Integer value){
		val = value;
	}
	/**
	 * returns the value
	 * @return val
	 */
	@Override
	public Integer getValue() {
		// TODO Auto-generated method stub
		return val;
	}

}
