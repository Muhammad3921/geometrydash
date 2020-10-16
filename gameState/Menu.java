package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.KeyEvent;


import image.Images;
import main.Gamepanel;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class displays the main menu and controls the next steps afterwards
 */
public class Menu extends State {//extends abstract class
	public String[] ar = { "Start", "Help", "Quit" };//creates array for selection options
	public int select = 0;

	public Menu(StateManager gm) {
		super(gm);

	}

	@Override
	public void init() {

	}

	@Override
	public void perSecond() {

	}

	@Override
	/*This method draws the menu
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) {
		g.drawImage(Images.background[2],0, 0, Gamepanel.width, Gamepanel.height,null);//inputs background
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(128, 231, 44)); //changes selected color to blue
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 80));
			g.drawString(ar[i], Gamepanel.width / 2 - 95, 125 + i * 125); //draws all the different options

		}

	}
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {
		if (k == KeyEvent.VK_DOWN) {
			select++;//moves selection to the right
			if (select >= ar.length) {
				select = 0;
			}
		} else if (k == KeyEvent.VK_UP) {
			select--;//moves selection to the left
			if (select < 0) {
				select = ar.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) {
			if (select == 0) {//if start selected 
				StateManager.st.push(new PlayerSelect(gm));//pushes to player select
			}

			if (select == 1) {//if help selected 
				StateManager.st.push(new Help(gm));//pushes to help
			}

			if (select == 2) {//if exit selected, closes program
				System.exit(0);
			}
		}

	}

	@Override
	public void keyReleased(int k) {

	}

}