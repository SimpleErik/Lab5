package edu.wmich.cs1120.la5;

public class HighArea extends Area {
	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * Lets other classes be able to use the basicEnergyCost variable
	 * @return basicEnergyCosy
	 */
	@Override
	public double getBasicEnergyCost() {
		// TODO Auto-generated method stub
		return basicEnergyCost;
	}
	/**
	 * This sets the variable basicEnergyCost
	 * @param basicEnergyCost
	 */

	@Override
	public void setBasicEnergyCost(double BasicEnergyCost) {
		// TODO Auto-generated method stub
		this.basicEnergyCost = BasicEnergyCost; 
	}
	/**
	 * Allows other classes to be able to use the elevation variable
	 * @return elevation
	 */
	@Override
	public double getElevation() {
		// TODO Auto-generated method stub
		return elevation;
	}
	/**
	 * Sets the variable elevation
	 * @param elevation
	 */
	@Override
	public void setElevation(double elevation) {
		// TODO Auto-generated method stub
		this.elevation = elevation;
	}
	
	/**
	 * Lets other classes use the radiation variable 
	 * @return radiation
	 */
	@Override
	public double getRadiation() {
		// TODO Auto-generated method stub
		return radiation;
	}
	
	/**
	 * sets the radiation variable
	 * @param radiation
	 */
	@Override
	public void setRadiation(double radiation) {
		// TODO Auto-generated method stub
		this.radiation = radiation;
	}
	/**
	 * finds out what the consumed energy total is
	 */
	@Override
	public double calcConsumedEnergy(){
		return getBasicEnergyCost() * 2;
	}
}
