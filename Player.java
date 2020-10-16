package entities;


import gameState.DeathS;
import gameState.PlayerSelect;
import gameState.State;
import gameState.StateManager;
import image.Images;

import java.awt.*;
import java.awt.event.KeyEvent;

import objects.Block;
import objects.Spikes;
import physics.Collision;


import main.Gamepanel;

public class Player {
 
	/**
	 * 
	 */boolean right,left = false;
	 boolean fall, jump=false;
	 boolean death = false;
	public double x;
	public double y;
	private double jumpsp = 5;
	private double currentj = jumpsp;
	private double fallsp = 5;
	private double currentf = 0.1;
	private double mspeed =4.5;
	private int width,height;
	private boolean topcol = false;
	private StateManager gm;
	public Player(int width, int height, StateManager gm){
		this.gm = gm;
		this.width = width;
		this.height = height;
		x= Gamepanel.width/2;
		y= Gamepanel.height/2;
	}
	public void persec(Block [] b, Spikes[] s){ 
		
		int ix = (int)x;
		int iy = (int)y;
		if (State.yOff>350)
			death=true;
		
		for (int f =0; f<s.length;f++){
			if (Collision.sBlock(new Point(ix+width+(int)State.xOff,iy+(int)State.yOff), s[f])
					||Collision.sBlock(new Point(ix+width+(int)State.xOff,iy+height+(int)State.yOff), s[f]))
			
				 {
				
				death = true;
			}
			if (Collision.sBlock(new Point(ix+(int)State.xOff,iy+height+(int)State.yOff), s[f])//left corner
			||Collision.sBlock(new Point(ix+(int)State.xOff+2,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+4,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+6,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+8,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+10,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+12,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+14,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+16,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+18,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+20,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+22,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+24,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+26,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+(int)State.xOff+28,iy+height+(int)State.yOff), s[f])
			||Collision.sBlock(new Point(ix+width+(int)State.xOff,iy+height+(int)State.yOff), s[f])){//right corner
				death=true;
			}	
			
		}
		
			for (int i =0; i<b.length;i++){
			if (Collision.pBlock(new Point(ix+width+(int)State.xOff,iy+(int)State.yOff), b[i])
					||Collision.pBlock(new Point(ix+width+(int)State.xOff,iy+height+(int)State.yOff), b[i]))
			
				 {
				right = false;
				death = true;
			}
			
			if (Collision.pBlock(new Point(ix+(int)State.xOff-1,iy+(int)State.yOff+2), b[i])
					||Collision.pBlock(new Point(ix+(int)State.xOff-1,iy+height+(int)State.yOff-1), b[i])){
				left = false;
			}
			
			if (Collision.pBlock(new Point(ix+(int)State.xOff+1,iy+(int)State.yOff-2), b[i])
					||Collision.pBlock(new Point(ix+width+(int)State.xOff-2,iy+(int)State.yOff-2), b[i])){
				jump = false;
				fall=true;
			}	
			if (Collision.pBlock(new Point(ix+(int)State.xOff,iy+height+(int)State.yOff), b[i])
					||Collision.pBlock(new Point(ix+width+(int)State.xOff-2,iy+height+(int)State.yOff+4), b[i])){
				

				
				fall=false;
				topcol = true;
				
			}	else{
				if(!topcol&&!jump){
					fall=true;
				}
			}
			
			}
			
		
		
		topcol=false;
		if (death){
			StateManager.st.push(new DeathS(gm));
			
				}
			
	
		if(right){
			State.xOff+=mspeed;
		}
		if (left){
			State.xOff-=mspeed;
		}
		if(jump){
			State.yOff-=currentj;
			currentj-=0.2;
			if(currentj<=0){
				currentj=jumpsp;
				jump =false;
				fall=true;
			}
			
		}
			
		if(fall){
			State.yOff+=currentf;
			if(currentf<=fallsp){
				currentf+=0.2;
			}
		}
		if(!fall){
			currentf= 0.2;
		}
	}
	public void draw (Graphics g){
		g.setColor(Color.black);
		if(PlayerSelect.selectionp==0)
		g.drawImage(Images.player[2],(int)x, (int)y, width, height,null);
		if(PlayerSelect.selectionp==1)
		g.drawImage(Images.player[1],(int)x, (int)y, width, height,null);
		if(PlayerSelect.selectionp==2)
		g.drawImage(Images.player[0],(int)x, (int)y, width, height,null);
	
	}
	public void Keypres(int k){
		
		if (k==KeyEvent.VK_RIGHT) right = true;
		if (k==KeyEvent.VK_LEFT) left = true;
		if (k==KeyEvent.VK_SPACE && !jump && !fall) jump=true;
	}
	public void Keyrel(int k){
		if (k==KeyEvent.VK_RIGHT) right = false;
		if (k==KeyEvent.VK_LEFT) left = false;
	}
}
