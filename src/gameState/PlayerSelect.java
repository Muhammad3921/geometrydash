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
public class PlayerSelect extends State {//extends abstract class
	public static int selectionp;

	public String[] ar = { "1", "2", "3" };//creates array for selection options
	public int select = 0;

	public PlayerSelect(StateManager gm) {
		super(gm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void perSecond() {
		// TODO Auto-generated method stub

	}

	@Override
	/*This method draws the level select 
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) {
		g.drawImage(Images.background[2], 0, 0, Gamepanel.width, Gamepanel.height, null);//inputs background
		g.drawImage(Images.player[0], 40, 100, 200, 200, null); //draws the different spites
		g.drawImage(Images.player[1], 400, 100, 200, 200, null);
		g.drawImage(Images.player[2], 740, 100, 200, 200, null);

		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(128, 231, 44));//changes colour of the selected item 
			} else {
				g.setColor(Color.white);
			}
			g.setFont(new Font("Impact", Font.BOLD, 70));
			g.drawString(ar[i], 125 + i * 350, Gamepanel.height / 2 + 125);//Draws all the different options for next steps onto screen
		}

	}

	@Override
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {
		if (k == KeyEvent.VK_RIGHT) {
			select++;//moves selection to the right
			if (select >= ar.length) {
				select = 0;
			}
		} else if (k == KeyEvent.VK_LEFT) {
			select--;//moves selection to the left
			if (select < 0) {
				select = ar.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) {
			if (select == 0) { //checks of option one is selected
				selectionp = 2;
				StateManager.st.push(new LevelSelect(gm)); //pushes to level select
			}

			if (select == 1) {//checks of option two is selected
				selectionp = 1;
				StateManager.st.push(new LevelSelect(gm));//pushes to level select

			}
			if (select == 2) {//checks of option three is selected
				selectionp = 0;
				StateManager.st.push(new LevelSelect(gm));//pushes to level select

			}

		}
	}

	@Override
	public void keyReleased(int k) {

	}

}