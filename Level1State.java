package gameState;

import image.Images;

import java.awt.Font;
import java.awt.Graphics;

import objects.Block;
import objects.Spikes;
import entities.Player;

public class Level1State extends State {
	private Player p;
	private Block[] b;
	private Spikes[] s;

	public Level1State(StateManager gm) {
		super(gm);
	}

	public void intit() {
		
		b = new Block[5];
		s = new Spikes[5];
		
		p = new Player(35, 35,gm);
		
		s[0] = new Spikes(1205,1245,1225,300,300,265);
		s[1] = new Spikes(2105,2145,2125,345,345,310);
		s[2] = new Spikes(2145,2185,2165,345,345,310);
		s[3] = new Spikes(2805,2845,2825,345,345,310);
		s[4] = new Spikes(2845,2885,2865,345,345,310);
		b[0] = new Block(100, 345, 10000, 500);
		b[1] = new Block(-700, -1000, 900, 5000);
		b[2] = new Block(1000,300, 700, 50);
		b[3] = new Block(2885,310, 40, 40);
		b[4] = new Block(3050,250, 40, 100);
		

	}
	
	public void persec() {

		p.persec(b,s);

		for (int i = 0; i < b.length; i++) {
			b[i].persec();
			
		}

		for (int i = 0; i < s.length; i++) {
			s[i].persec();
		}
	}

	public void draw(Graphics g) {
		System.out.println(xOff);
		System.out.println(yOff);
		g.drawImage(Images.background[0], -200-(int)State.xOff, -200-(int)State.yOff, 10000, 2001, null);
		g.setFont(new Font("Times New Roman", Font.BOLD, 20));
		g.drawString("Score: "+(String.valueOf((int)(xOff/21))), 890,30);
		p.draw(g);
		for (int i = 0; i < b.length; i++) {
			b[i].draw(g);
			

		}
		for (int i = 0; i < s.length; i++) {
			s[i].draw(g);
		}

	}

	public void keypres(int k) {

		p.Keypres(k);
	}

	public void keyrel(int k) {

		p.Keyrel(k);
	}

}
