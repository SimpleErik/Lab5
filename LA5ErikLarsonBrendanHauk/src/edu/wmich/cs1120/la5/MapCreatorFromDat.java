package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.*;


public class MapCreatorFromDat implements IMapCreator {
	TerrainScanner tc = new TerrainScanner();
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return tc;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		tc = scanner;
	}

}
