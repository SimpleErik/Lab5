package edu.wmich.cs1120.la5;

public class LowArea extends Area {
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * lets other classes to use the basicEnergyCost 
	 */
	@Override
	public double getBasicEnergyCost() {
		// TODO Auto-generated method stub
		return basicEnergyCost;
	}
	/**
	 * sets the basicEnergyCost variable
	 * @param double BasicEnergyCost
	 */
	
	@Override
	public void setBasicEnergyCost(double BasicEnergyCost) {
		// TODO Auto-generated method stub
		this.basicEnergyCost = BasicEnergyCost; 
	}
	/**
	 * lets other classes use the elevation variable
	 */
	@Override
	public double getElevation() {
		// TODO Auto-generated method stub
		return elevation;
	}
	/**
	 * sets the variable elevation
	 * @param double elevation
	 */
	@Override
	public void setElevation(double elevation) {
		// TODO Auto-generated method stub
		this.elevation = elevation;
	}
	/**
	 * allows other classes to use the variable radiation
	 */
	@Override
	public double getRadiation() {
		// TODO Auto-generated method stub
		return radiation;
	}
	/**
	 * sets the radiation variable
	 * @param double radiation
	 */
	@Override
	public void setRadiation(double radiation) {
		// TODO Auto-generated method stub
		this.radiation = radiation;
	}
	/**
	 * finds the total of consumed energy
	 */
	@Override
	public double calcConsumedEnergy(){
		return getBasicEnergyCost() * 2;
	}
}
