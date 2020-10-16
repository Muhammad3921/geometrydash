package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import entities.Player;
import image.Images;
import main.Gamepanel;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class displays the death screen and controls the next steps afterwards
 */
public class DeathS extends State { //extends abstract class
	public String[] ar = { "Main Menu", "Quit" }; //creates array for selection options
	public int select = 0;
	public int score;
	public DeathS(StateManager gm, int i) {
		super(gm);
		this.score = i; //sets score to players position
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub

	}

	@Override
	public void perSecond() {
		// TODO Auto-generated method stub

	}

	/*This method draws the death screen 
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) {
		g.drawImage(Images.background[3], 0, 0, Gamepanel.width, Gamepanel.height, null); //inputs background
		g.setColor(Color.white);
		g.setFont(new Font("Impact", Font.BOLD, 30)); //changes font
		g.drawString("Score: " + (String.valueOf((int) (score / 25))), 420, 300); //displays the players score
		for (int i = 0; i < ar.length; i++) { //changes colour of the selected item 
			if (i == select) {
				g.setColor(new Color(128, 231, 44));
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 55));
			g.drawString(ar[i], 225 + i * 400, Gamepanel.height / 2 + 125);//Draws all the different options for next steps onto screen

		}
	}

	@Override
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {
		if (k == KeyEvent.VK_RIGHT) {
			select++;
			if (select >= ar.length) { //moves selection to the right
				select = 0;
			}
		} else if (k == KeyEvent.VK_LEFT) {//moves selection to the left
			select--;
			if (select < 0) {
				select = ar.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) { //if main menu selected
			if (select == 0) { //resets all win, death and level selected booleans
				Player.death = false;
				Player.win = false;;
				Level1State.gg = false;
				Level2State.gg = false;
				StateManager.st.push(new Menu(gm)); //pushes back to main menu

			}

			if (select == 1) { //closes the program if exit selected
				System.exit(0);
			}

		}

	}

	@Override
	public void keyReleased(int k) {

	}

}
