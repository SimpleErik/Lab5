package edu.wmich.cs1120.la5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	
	private TerrainScanner tc = new TerrainScanner();

	/**
	 * this scans the txt file provided
	 * @param String fileName
	 * @param int threshold
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		FileReader inputFile = new FileReader(fileName);
		BufferedReader bufferReader = new BufferedReader(inputFile);
		String line;
		String [] field = new String[3];
		IArea [][] board = new IArea[10][10];
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[r].length; c++){
			line = bufferReader.readLine();
		field = line.split(" ");
			if(Double.parseDouble(field[1]) < threshold && Double.parseDouble(field[2]) < 0.5){
				Area low = new LowArea();
				low.setBasicEnergyCost(Double.parseDouble(field[0]));
				low.setElevation(Double.parseDouble(field[1]));
				low.setRadiation(Double.parseDouble(field[2]));
				board[r][c] = low;
			}else{
				Area high = new HighArea();
				high.setBasicEnergyCost(Double.parseDouble(field[0]));
				high.setElevation(Double.parseDouble(field[1]));
				high.setRadiation(Double.parseDouble(field[2]));
				board[r][c] = high;
			}
			}
		
		}
		bufferReader.close();
		getScanner().setTerrain(board);
		getScanner().getTerrain();
		getScanner().generateMap(threshold);
		
	}
	
	
	/**
	 * allows other classes to use the terrain scanner
	 */
	@Override
	public TerrainScanner getScanner() {
		// TODO Auto-generated method stub
		return tc;
	}
	/**
	 * sets the terrain scanner
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		// TODO Auto-generated method stub
		tc = scanner;
	}

}
