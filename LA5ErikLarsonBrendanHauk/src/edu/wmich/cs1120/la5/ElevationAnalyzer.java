package edu.wmich.cs1120.la5;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	@Override
	public ArrayList<IArea> getPath() {
		// TODO Auto-generated method stub
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		// TODO Auto-generated method stub
		this.path = path;
	}

	@Override
	public void analyzePath() {
		// TODO Auto-generated method stub
		int counter = 0;
		for(int i = 0; i < getPath().size(); i++){
			analysis += getPath().get(i).getElevation();
			counter++;
		}
	}

	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub

	}

}
