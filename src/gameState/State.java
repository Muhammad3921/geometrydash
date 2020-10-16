package gameState;

import java.awt.Graphics;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class abstract class which is extended by most classes
 */
public abstract class State {	
	public StateManager gm;
	public static double xOff; //sets position values
	public static double yOff;
	
	public State(StateManager gm){
		this.gm = gm;
		xOff =0; //sets position values to normal
		yOff =0;
		init(); //calls abstract methods
		
	}
	public abstract void init();
	public abstract void perSecond();
	public abstract void draw(Graphics g);
	public abstract void keyPressed(int k);
	public abstract void keyReleased(int k);
}