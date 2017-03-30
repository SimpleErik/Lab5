package edu.wmich.cs1120.la5;


import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {

	private ArrayList<IArea> path = new ArrayList<IArea>();
	 private String analysis;
	 /**
	  * This is the method that allows other classes the use the variable path
	  * @return path
	  */
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}
	/**
	 * This method sets the variable path
	 * @param path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}
	/**
	 * This analyzes the path to see what the energy is for the path
	 */
	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		analysis = "0";
		double ans = Double.parseDouble(analysis);
		for(int i = 0; i < getPath().size(); i++){
			ans += getPath().get(i).calcConsumedEnergy(); 
		}
		analysis = Double.toString(ans);
	}

	/**
	 * This allows other classes to be able to use the variable analysis
	 * @return path
	 */
	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysis;
	}

	/**
	 * This sets the analysis variable
	 * @param analysis
	 */
	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		this.analysis = analysis;
	}

}
