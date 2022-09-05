package BrickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		
//		J-frame (outer border and minimize ,maximize window)
		
		JFrame obj = new JFrame();
		Gameplay gamePlay = new Gameplay();
		obj.setBounds(10,10,700,600);
		obj.setTitle("Brick Breaker");
		obj.setResizable(false);
		obj.setVisible(true);
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(gamePlay);
		
		
		

	}

}
