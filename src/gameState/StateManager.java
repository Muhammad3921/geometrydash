package gameState;

import java.awt.Graphics;
import java.util.Stack;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class controls the different states of the game
 */
public class StateManager {
	public static Stack<State> st; //starts a java stack with the abstract classes

	public StateManager() {
		st = new Stack<State>(); //Initializes it
		menu(); //pushes start to menu backgroung
	}
	/*This method pushes to the first screen
	 * Pre: null
	 * Post: null
	 */
	public static void menu() {
		st.push(new MenuBackground(null));
	}
	/*This method pushes different states to their persecond method
	 * Pre: null
	 * Post: null
	 */
	public void perSecond() {
		st.peek().perSecond();
	}
	/*This method pushes different states to their draw method
	 * Pre: null
	 * Post: null
	 */
	public void draw(Graphics g) {
		st.peek().draw(g);
	}
	/*This method pushes different states to their key pressed method
	 * Pre: null
	 * Post: null
	 */
	public void keyPressed(int y) {
		st.peek().keyPressed(y);
	}
	/*This method pushes different states to their key released method
	 * Pre: null
	 * Post: null
	 */
	public void keyReleased(int y) {
		st.peek().keyReleased(y);
	}
}
