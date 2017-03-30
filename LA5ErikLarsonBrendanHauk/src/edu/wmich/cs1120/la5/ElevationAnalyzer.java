package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	/**
	 * This method is so other classes can get the the value of path
	 * @return path
	 */
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}
	
	/**
	 * This is the method that sets the variable path
	 * @param path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}
	
	/**
	 * This method analyzes the path to see what the elevation of the path is
	 */
	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		double counter = 0;
		double ans = 0;
		analysis = "0.0";
		double toDouble = Double.parseDouble(analysis);
		for(int i = 0; i < getPath().size(); i++){
			toDouble += getPath().get(i).getElevation();
			counter++;
		}
		ans = toDouble / counter;
		analysis = Double.toString(ans);
	}
	/**
	 * This method is so other classes can be able to call and use the variable analysis 
	 * @return analysis
	 */
	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysis;
	}

	/**
	 * This is the method that sets the variable analysis
	 * @param analysis
	 */
	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		this.analysis = analysis; 
	}

}
