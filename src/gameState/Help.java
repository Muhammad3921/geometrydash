package gameState;


import java.awt.Graphics;

import java.awt.event.KeyEvent;




import image.Images;
import main.Gamepanel;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class displays the controls
 */
public class Help extends State{
	public String[] ar = { "Menu"}; //one option to go back to menu
	public int select = 0;

	public Help(StateManager gm) {
		super(gm);
		
	}

	@Override
	public void init() {

	}

	@Override
	public void perSecond() {

	}

	@Override
	/*This method draws the help screen 
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) { 
		g.drawImage(Images.background[5], 0, 0, Gamepanel.width, Gamepanel.height, null); //draws the image with controls
		
	}
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {
		if (k == KeyEvent.VK_ENTER) {
			StateManager.st.push(new Menu(gm)); //if enter is pressed pushes it back to menu 
		}

	}
	
	@Override
	public void keyReleased(int k) {

	}

}