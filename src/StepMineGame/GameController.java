package StepMineGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;

import javax.swing.JPanel;

public class GameController extends JPanel {
	private Mapping map = new Mapping(10,10);

	public void paint(Graphics g) {
		//背景
		g.setColor(Color.BLUE);
		g.fillRect(1,1,592,592);
		//地圖
		map.draw((Graphics2D)g);
		//邊界
		//g.setColor(Color.GREEN);
		//g.fillRect(0, 0, 3, 592);
		//g.fillRect(0, 0, 592, 3);
		//g.fillRect(0, 0, 3, 592);
		//g.fillRect(583, 0, 3, 592);
		//釋放資源
		g.dispose();
	}
	public void actionPerformed(ActionEvent e) {
		
	}
}

