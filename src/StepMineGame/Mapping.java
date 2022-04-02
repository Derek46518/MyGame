package StepMineGame;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Mapping {
	public int[][] map;
	public int Height=50;
	public int Width=50;
	
	public Mapping(int row, int col) {
		map=new int[row][col];
		for(int i=0;i<map.length;i++) {
			for (int j=0;j<map[0].length;j++) {
				map[i][j]=1;
			}
		}
		
	}
	public void draw(Graphics2D g) {
		for(int i=0;i<map.length;i++) {
			for(int j=0;j<map[0].length;j++) {
				//如果沒被擊中就畫
				if(map[i][j]==1) {
					g.setColor(Color.white);
					g.fillRect(j*Width+50, i*Height +50, Width, Height);
					
					g.setStroke(new BasicStroke(3));
					g.setColor(Color.green);
					g.drawRect(j*Width+50, i*Height +50, Width, Height);
				}
				
				
			}
		}
	}
}
