package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.*;


public class MapCreatorFromDat implements IMapCreator {
	TerrainScanner tc = new TerrainScanner();
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		String [] field = new String[3];
		IArea [][] board = new IArea[10][10];
		
		try{
			RandomAccessFile raf = new RandomAccessFile(fileName, "r");
			int count = 0;
			double elev;
			double rad;
			raf.seek(count);
		while( ){
				raf.readDouble();
				raf.seek(count+1);
				raf.readDouble();
				raf.seek(count+2);
				raf.readDouble();
				raf.seek(count+3);
				raf.readChar();
			 }
		 
        	
		
        }
		catch(IOException e){
        	e.printStackTrace();
        }
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
