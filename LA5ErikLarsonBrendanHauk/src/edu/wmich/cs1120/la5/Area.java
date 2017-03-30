package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {

	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	/**
	 * allows classes to call basicEnergyCost
	 * @return basicEnergyCost
	 */
	@Override
	public double getBasicEnergyCost() {
		// TODO Auto-generated method stub
		return basicEnergyCost;
	}
	/**
	 * sets the basicEnergyCost
	 * @param basicEnergyCost
	 */
	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		// TODO Auto-generated method stub
		this.basicEnergyCost = basicEnergyCost;
	}

	/**
	 * allows classes to use the elevation
	 * @return elevation
	 */
	@Override
	public double getElevation() {
		// TODO Auto-generated method stub
		return elevation;
	}

	/**
	 * sets the elevation
	 * @param elevation
	 */
	@Override
	public void setElevation(double elevation) {
		// TODO Auto-generated method stub
		this.elevation = elevation;
	}

	/**
	 * allows classes to use the radiation
	 * @return radiation
	 */
	@Override
	public double getRadiation() {
		// TODO Auto-generated method stub
		return radiation;
	}

	/**
	 * gives radiation a value
	 * @param radiation
	 */
	@Override
	public void setRadiation(double radiation) {
		// TODO Auto-generated method stub
		this.radiation = radiation;
	}

	/**
	 * finds the value of consumed energy
	 * return getBasicEnergyCost()*2
	 */
	@Override
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return getBasicEnergyCost() * 2;
	}

}
