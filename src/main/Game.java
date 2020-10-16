
package main;

import java.awt.BorderLayout;

import javax.swing.JFrame;

/**
 * @author Muhammad and Sanaa
 *
 */
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class is the main class and starts the construction of game
 */
public class Game {
	static JFrame f = new JFrame("Geometry dash"); //creates the JFrame

	public static void main(String[] args) {

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLayout(new BorderLayout()); //sets to border layout
		f.add(BorderLayout.CENTER, new Gamepanel()); //adds gamepanel class to the middle
		f.pack();
		f.setLocationRelativeTo(null); //places in the middle of the screen
		f.setVisible(true); //makes it visible
	}

	

}
