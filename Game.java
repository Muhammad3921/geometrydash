/**
 * 
 */
package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author Muhammad and Sanaa
 *
 */
public class Game {
	static JFrame f = new JFrame("Platformer");
		
	public static void main(String[] args) {
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLayout(new BorderLayout());
		f.add(BorderLayout.CENTER, new Gamepanel());
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		
	}
	public static void diss(){
		f.setVisible(false);
	}
	public static void appear(){
		f.setVisible(true);
	}

}
