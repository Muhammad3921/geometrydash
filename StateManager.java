package gameState;

import java.awt.Graphics;
import java.util.Stack;

public class StateManager {
	public static Stack<State> st;
	
	public StateManager(){
		st = new  Stack<State>();
		menu();
	}
	public static void menu(){
		st.push(new MenuBackground(null));
	}
	public void persec(){
		st.peek().persec();
	}
	public void draw(Graphics g){
		st.peek().draw(g);
	}
	public void keypressed(int y){
		st.peek().keypres(y);
	}
	public void keyreleased(int y){
		st.peek().keyrel(y);
	}
}
