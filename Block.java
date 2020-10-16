package objects;

import gameState.State;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Block extends Rectangle {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public Block(int x,int y,int w, int h){
		setBounds(x,y,w,h);
		
}
public void persec(){
	
	
}
public void draw(Graphics g){
	g.setColor(Color.BLACK);
	
	g.fillRect(x-(int)State.xOff, y-(int)State.yOff, width, height);
}
	
	
	
}
