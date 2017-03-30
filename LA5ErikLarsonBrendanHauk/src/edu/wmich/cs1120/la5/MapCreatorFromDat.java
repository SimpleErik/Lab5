package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.TerrainScanner;
import java.io.*;


public class MapCreatorFromDat implements IMapCreator {
	TerrainScanner tc = new TerrainScanner();
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		// TODO Auto-generated method stub
		IArea [][] board = new IArea[10][10];
		Integer position = 0;
		double elev = 0;
		double rad = 0; 
		double engy = 0;
		char op = ' ';
		Integer var1 = 0;
		Integer var2 = 0;
		RandomAccessFile raf = new RandomAccessFile(fileName, "r");
		try{
					int j = 0;
					int i = 0;
					raf.seek(position);
					while(position != -1){
					engy = raf.readDouble();
					elev = raf.readDouble();
					rad = raf.readDouble();
					if(elev < threshold && rad < 0.5){
						Area low = new LowArea();
						low.setBasicEnergyCost(engy);
						low.setElevation(elev);
						low.setRadiation(rad);
						board[i][j] = low;
					}else{
						Area high = new HighArea();
						high.setBasicEnergyCost(engy);
						high.setElevation(elev);
						high.setRadiation(rad);
						board[i][j] = high;
					}
					op = raf.readChar();
					var1 = raf.readInt();
					var2 = raf.readInt();
					IExpression num1 = new Literal(var1);
					IExpression num2 = new Literal(var2);
					
					if(op == '+'){
						IOperation add = new Addition();
						position = add.perform(num1, num2);
						
					}else{
						IOperation sub = new Subtraction();
						position = sub.perform(num1, num2);
					}
					if(j == 9){
						j = 0;
						i++;
					}else{
					j++;
					}
					
			}
			}catch(IOException e){
        	e.printStackTrace();
        }
		raf.close();
		getScanner().setTerrain(board);
		getScanner().getTerrain();
		getScanner().generateMap(threshold);
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
