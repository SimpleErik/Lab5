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

	@Override
	public String getAnalysis() {
		// TODO Auto-generated method stub
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		// TODO Auto-generated method stub
		this.analysis = analysis; 
	}

}
