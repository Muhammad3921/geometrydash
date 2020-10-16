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
 *This Class displays the player select screen and controls the selection
 */
public class LevelSelect extends State {//extends abstract class
	public String[] ar = { "Level One", "Level Two" };//creates array for selection options
	public int select = 0;

	public LevelSelect(StateManager gm) {
		super(gm);

	}

	@Override
	public void init() {

	}

	@Override
	public void perSecond() {

	}

	@Override
	/*This method draws the level select 
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) {
		g.drawImage(Images.background[2], 0, 0, Gamepanel.width, Gamepanel.height, null); //inputs background
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(128, 231, 44));//changes colour of the selected item 
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 80));
			g.drawString(ar[i], Gamepanel.width / 2 - 155, 185 + i * 155);//Draws all the different options for next steps onto screen

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
			if (select == 0) { //if level1 selected 
				StateManager.st.push(new Level1State(gm)); //pushes to level1
			}

			if (select == 1) { //if level12 selected 
				StateManager.st.push(new Level2State(gm));//pushes to level1
			}
		}

	}

	@Override
	public void keyReleased(int k) {

	}

}