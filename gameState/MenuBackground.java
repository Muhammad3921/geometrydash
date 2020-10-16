package gameState;

import java.awt.Graphics;

import java.awt.event.KeyEvent;



import image.Images;
import main.Gamepanel;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class displays the initial geometry dash logo
 */
public class MenuBackground extends State { //extends state

	public MenuBackground(StateManager gm) {
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
		g.drawImage(Images.background[1],0, 0, Gamepanel.width, Gamepanel.height,null);
	}
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {
		if (k == KeyEvent.VK_ENTER){
			StateManager.st.push(new Menu(gm)); //if enter pressed pushes it to menu
		}

	}


	@Override
	public void keyReleased(int k) {

	}

}