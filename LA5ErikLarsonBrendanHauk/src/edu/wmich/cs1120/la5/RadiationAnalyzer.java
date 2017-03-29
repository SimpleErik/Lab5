package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class RadiationAnalyzer implements IRover {

	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	
	/**
	 * allows other classes to use the path
	 */
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}

	/**
	 * sets the path
	 * @param ArrayList<IArea> path
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}

	/**
	 * this analyzes the path to find the radiation
	 */
	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		analysis = "0";
		double ans = Double.parseDouble(analysis);
		for(int i = 0; i < getPath().size(); i++){
			ans += getPath().get(i).getRadiation();
		}
		analysis = Double.toString(ans);
	}

	/**
	 * allows other classes to use the analysis
	 */
	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysis;
	}

	/**
	 * sets the analyzer
	 * @param String analysis
	 */
	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		this.analysis = analysis;
	}

}
