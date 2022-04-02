package StepMineGame;

import java.awt.Component;

import javax.swing.JFrame;



public class MainClass {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		
		GameController control= new GameController();
		f.setBounds(10,10,600,600);
		f.setTitle("這是什麼鬼遊戲");
		f.setResizable(false);
		f.setVisible(true);
		//按叉叉關閉
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.add(control);
	}
}
