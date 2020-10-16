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
 *This Class displays the win screen and controls the next steps afterwards
 */
public class WinS extends State{ //extends state
	public String[] ar = {"Main Menu", "Quit" };//creates array for selection options
	public int select = 0;
	public int score;
	public WinS(StateManager gm,int f) {
		super(gm);
		this.score = f; //inputs the position
		
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
	/*This method draws the death screen 
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) {
		g.drawImage(Images.background[4], 0, 0, Gamepanel.width, Gamepanel.height, null); //inputs and draw background
		g.setColor(Color.white);
		g.setFont(new Font("Impact", Font.BOLD, 30));
		g.drawString("Score: " + (String.valueOf((int) (score / 25))), 420, 300);//draws the score
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(128, 231, 44));//changes selected colour to blue
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 55));
			g.drawString(ar[i], 225 + i * 400, Gamepanel.height / 2+125);//Draws all the different options for next steps onto screen

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
			if (select == 0) {//if main menu selected reset all boolean values
				Player.death = false;
				Player.win = false;;
				Level1State.gg = false;
				Level2State.gg = false;
				StateManager.st.push(new Menu(gm)); //pushes to menu
				
			}

			if (select == 1) { //if exit selected closes program
				System.exit(0);
			}

			
		}

	}

	@Override
	public void keyReleased(int k) {

	}

}
