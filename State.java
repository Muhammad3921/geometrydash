package gameState;

import java.awt.Graphics;

public abstract class State {	
	public StateManager gm;
	public static double xOff;
	public static double yOff;
	
	public State(StateManager gm){
		this.gm = gm;
		xOff =0;
		yOff =0;
		intit();
		
	}
	public abstract void intit();
	public abstract void persec();
	public abstract void draw(Graphics g);
	public abstract void keypres(int k);
	public abstract void keyrel(int k);
}
