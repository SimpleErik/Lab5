package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {

	private double basicEnergyCost;
	private double elevation;
	private double radiation;
	
	@Override
	public double getBasicEnergyCost() {
		// TODO Auto-generated method stub
		return basicEnergyCost;
	}

	@Override
	public void setBasicEnergyCost(double basicEnergyCost) {
		// TODO Auto-generated method stub
		this.basicEnergyCost = basicEnergyCost;
	}

	@Override
	public double getElevation() {
		// TODO Auto-generated method stub
		return elevation;
	}

	@Override
	public void setElevation(double elevation) {
		// TODO Auto-generated method stub
		this.elevation = elevation;
	}

	@Override
	public double getRadiation() {
		// TODO Auto-generated method stub
		return radiation;
	}

	@Override
	public void setRadiation(double radiation) {
		// TODO Auto-generated method stub
		this.radiation = radiation;
	}

	@Override
	public double calcConsumedEnergy() {
		// TODO Auto-generated method stub
		return getBasicEnergyCost() * 2;
	}

}
