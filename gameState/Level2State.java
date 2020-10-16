package gameState;

import image.Images;

import java.awt.Font;
import java.awt.Graphics;

import objects.Block;
import objects.Spikes;
import entities.Player;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class creates level one and updates the blocks and spikes
 */
public class Level2State extends State {
	private Player p;
	private Block[] b;//arrays for blocks and spikes
	private Spikes[] s;
	public static boolean gg = false; //level indicator


	public Level2State(StateManager gm) {
		super(gm);
		gg = true;//makes level2 selected trues
		
	}
	/*This method creates all the blocks and spikes in the level
	 * Pre: null
	 * Post: null
	 */
	public void init() {

		b = new Block[62];//Initializes the arrays for spikes and blocks
		s = new Spikes[52];

		p = new Player(38, 38, gm,20254);//calls the player class to create player

		b[0] = new Block(100, 345, 60000, 500);//Calls the spikes and blocks class at different points to construct the obstacles and platforms for the level
		s[0] = new Spikes(1205, 1245, 1225, 300, 300, 265);
		s[1] = new Spikes(2105, 2145, 2125, 345, 345, 310);
		s[2] = new Spikes(2145, 2185, 2165, 345, 345, 310);
		s[3] = new Spikes(2805, 2845, 2825, 345, 345, 310);
		s[4] = new Spikes(2845, 2885, 2865, 345, 345, 310);

		b[1] = new Block(-700, -1000, 900, 5000);
		b[2] = new Block(1000, 300, 700, 50);
		b[3] = new Block(2885, 300, 35, 50); 
		b[4] = new Block(3050, 250, 35, 100);
		b[5] = new Block(3195, 190, 35, 200);
		s[5] = new Spikes(3600, 3600 + 40, 3600 + (((3600 + 40) - 3600) / 2), 345, 345, 345 - 35);
		b[6] = new Block(3900, 300, 300, 50);
		b[7] = new Block(4300, 300, 300, 50);
		s[6] = new Spikes(4160, 4160 + 40, 4160 + (((4160 + 40) - 4160) / 2), 300, 300, 300 - 35);
		s[7] = new Spikes(4560, 4560 + 40, 4560 + (((4560 + 40) - 4560) / 2), 300, 300, 300 - 35);
		b[8] = new Block(4900, 300, 40, 15);// Steps
		b[9] = new Block(5090, 260, 40, 15);
		b[10] = new Block(5280, 220, 40, 15);
		b[11] = new Block(5470, 180, 40, 15);
		b[12] = new Block(5650, 140, 50, 15);//
		b[13] = new Block(5700, 140, 900, 300);
		s[8] = new Spikes(5900, 5900 + 40, 5900 + (((5900 + 40) - 5900) / 2), 140, 140, 140 - 35);// triple spike
		s[9] = new Spikes(5940, 5940 + 40, 5940 + (((5940 + 40) - 5940) / 2), 140, 140, 140 - 35);
		s[10] = new Spikes(5980, 5980 + 40, 5980 + (((5980 + 40) - 5980) / 2), 140, 140, 140 - 35);//
		b[14] = new Block(5900, 95, 120, 10);
		s[11] = new Spikes(6280, 6280 + 40, 6280 + (((6280 + 40) - 6280) / 2), 140, 140, 140 - 35);// triple spike
		s[12] = new Spikes(6320, 6320 + 40, 6320 + (((6320 + 40) - 6320) / 2), 140, 140, 140 - 35);
		s[13] = new Spikes(6360, 6360 + 40, 6360 + (((6360 + 40) - 6360) / 2), 140, 140, 140 - 35);//
		b[15] = new Block(6280, 95, 120, 10);
		b[16] = new Block(6600, 180, 400, 300);
		b[17] = new Block(6700, 80, 160, 20);
		s[14] = new Spikes(6700, 6700 + 40, 6700 + (((6700 + 40) - 6700) / 2), 80, 80, 80 - 35);
		s[15] = new Spikes(6740, 6740 + 40, 6740 + (((6740 + 40) - 6740) / 2), 80, 80, 80 - 35);
		s[16] = new Spikes(6780, 6780 + 40, 6780 + (((6780 + 40) - 6780) / 2), 80, 80, 80 - 35);
		s[17] = new Spikes(6820, 6820 + 40, 6820 + (((6820 + 40) - 6820) / 2), 80, 80, 80 - 35);
		b[18] = new Block(6960, 140, 250, 300);
		b[19] = new Block(7400, 180, 205, 20);
		b[20] = new Block(7750, 240, 205, 20);
		s[18] = new Spikes(7565, 7565 + 40, 7565 + (((7565 + 40) - 7565) / 2), 180, 180, 180 - 35);
		s[19] = new Spikes(7915, 7915 + 40, 7915 + (((7915 + 40) - 7915) / 2), 240, 240, 240 - 35);
		s[20] = new Spikes(8345, 8345 + 40, 8345 + (((8345 + 40) - 8345) / 2), 345, 345, 345 - 35);
		s[21] = new Spikes(8600, 8600 + 40, 8600 + (((8600 + 40) - 8600) / 2), 345, 345, 345 - 35);
		s[22] = new Spikes(8640, 8640 + 40, 8640 + (((8640 + 40) - 8640) / 2), 345, 345, 345 - 35);
		s[23] = new Spikes(8940, 8940 + 40, 8940 + (((8940 + 40) - 8940) / 2), 345, 345, 345 - 35);
		s[24] = new Spikes(8980, 8980 + 40, 8980 + (((8980 + 40) - 8980) / 2), 345, 345, 345 - 35);
		s[25] = new Spikes(9020, 9020 + 40, 9020 + (((9020 + 40) - 9020) / 2), 345, 345, 345 - 35);
		b[21] = new Block(9500, 300, 35, 50);
		b[22] = new Block(9645, 240, 35, 300);
		b[23] = new Block(9810, 180, 35, 300);
		b[24] = new Block(9975, 140, 35, 300);
		b[25] = new Block(10120, 90, 35, 300);
		b[26] = new Block(10300, 110, 300, 20);
		b[27] = new Block(10750, 180, 300, 20);
		b[28] = new Block(11150, 250, 300, 20);
		s[26] = new Spikes(10560, 10560 + 40, 10560 + (((10560 + 40) - 10560) / 2), 110, 110, 110 - 35);
		s[27] = new Spikes(11010, 11010 + 40, 11010 + (((11010 + 40) - 11010) / 2), 180, 180, 180 - 35);

		b[28] = new Block(11250, 250, 40, 15);
		b[29] = new Block(11440, 210, 40, 15);
		b[30] = new Block(11630, 180, 40, 15);
		b[31] = new Block(11820, 140, 40, 15);
		b[32] = new Block(12010, 100, 40, 15);
		s[28] = new Spikes(12010, 12010 + 40, 12010 + (((12010 + 40) - 12010) / 2), 100, 100, 100 - 35);

		b[33] = new Block(11970, 210, 800, 20);
		b[34] = new Block(12070, 230, 600, 150);
		b[35] = new Block(12070, -40, 600, 100);
		b[36] = new Block(12170, 60, 400, 30);

		b[37] = new Block(12840, 240, 40, 15);

		b[38] = new Block(12950, 280, 100, 100);

		b[39] = new Block(13090, 310, 40, 15);

		s[29] = new Spikes(13500, 13500 + 40, 13500 + (((13500 + 40) - 13500) / 2), 345, 345, 345 - 35);
		s[30] = new Spikes(13800, 13800 + 40, 13800 + (((13800 + 40) - 13800) / 2), 345, 345, 345 - 35);
		s[31] = new Spikes(13840, 13840 + 40, 13840 + (((13840 + 40) - 13840) / 2), 345, 345, 345 - 35);

		b[40] = new Block(13880, 305, 40, 100);
		b[42] = new Block(14020, 260, 100, 20);
		b[41] = new Block(14200, 300, 200, 100);

		b[43] = new Block(14540, 260, 100, 20);
		b[44] = new Block(14800, 220, 100, 20);

		b[45] = new Block(15000, 300, 200, 100);

		s[32] = new Spikes(15200, 15200 + 40, 15200 + (((15200 + 40) - 15200) / 2), 345, 345, 345 - 35);
		s[33] = new Spikes(15240, 15240 + 40, 15240 + (((15240 + 40) - 15240) / 2), 345, 345, 345 - 35);
		s[34] = new Spikes(15750, 15750 + 40, 15750 + (((15750 + 40) - 15750) / 2), 345, 345, 345 - 35);
		s[35] = new Spikes(15710, 15710 + 40, 15710 + (((15710 + 40) - 15710) / 2), 345, 345, 345 - 35);
		s[36] = new Spikes(15930, 15930 + 40, 15930 + (((15930 + 40) - 15930) / 2), 345, 345, 345 - 35);
		s[37] = new Spikes(15970, 15970 + 40, 15970 + (((15970 + 40) - 15970) / 2), 345, 345, 345 - 35);
		s[38] = new Spikes(16010, 16010 + 40, 16010 + (((16010 + 40) - 16010) / 2), 345, 345, 345 - 35);
		s[39] = new Spikes(16240, 16240 + 40, 16240 + (((16240 + 40) - 16240) / 2), 345, 345, 345 - 35);
		s[40] = new Spikes(16540, 16540 + 40, 16540 + (((16540 + 40) - 16540) / 2), 345, 345, 345 - 35);
		s[41] = new Spikes(16580, 16580 + 40, 16580 + (((16580 + 40) - 16580) / 2), 345, 345, 345 - 35);

		b[46] = new Block(16620, 305, 40, 50);
		b[47] = new Block(16785, 250, 40, 100);
		b[48] = new Block(16950, 190, 40, 200);
		b[49] = new Block(16990, 190, 40, 15);
		b[50] = new Block(17120, 230, 40, 15);
		b[51] = new Block(17250, 270, 40, 15);
		b[52] = new Block(17380, 310, 40, 15);

		s[42] = new Spikes(17500, 17500 + 40, 17500 + (((17500 + 40) - 17500) / 2), 345, 345, 345 - 35);
		s[43] = new Spikes(17540, 17540 + 40, 17540 + (((17540 + 40) - 17540) / 2), 345, 345, 345 - 35);
		s[44] = new Spikes(18100, 18100 + 40, 18100 + (((18100 + 40) - 18100) / 2), 345, 345, 345 - 35);
		s[45] = new Spikes(18350, 18350 + 40, 18350 + (((18350 + 40) - 18350) / 2), 345, 345, 345 - 35);
		s[46] = new Spikes(18390, 18390 + 40, 18390 + (((18390 + 40) - 18390) / 2), 345, 345, 345 - 35);

		b[53] = new Block(17670, 220, 160, 15);
		s[47] = new Spikes(17670, 17670 + 40, 17670 + (((17670 + 40) - 17670) / 2), 235, 235, 235 + 35);
		s[48] = new Spikes(17710, 17710 + 40, 17710 + (((17710 + 40) - 17710) / 2), 235, 235, 235 + 35);
		s[49] = new Spikes(17750, 17750 + 40, 17750 + (((17750 + 40) - 17750) / 2), 235, 235, 235 + 35);
		s[50] = new Spikes(17790, 17790 + 40, 17790 + (((17790 + 40) - 17790) / 2), 235, 235, 235 + 35);

		b[54] = new Block(18700, 305, 40, 15);
		b[55] = new Block(18865, 250, 40, 15);
		b[56] = new Block(19030, 190, 40, 15);
		b[57] = new Block(19195, 150, 200, 15);

		b[58] = new Block(19600, 190, 40, 40);
		b[59] = new Block(19730, 230, 40, 40);
		b[60] = new Block(19860, 270, 40, 40);
		b[61] = new Block(19990, 310, 40, 40);
		s[51] = new Spikes(20030, 20030 + 40, 20030 + (((20030 + 40) - 20030) / 2), 345, 345, 345 - 35);
		// spike = new Spikes(x,x+40,x+(((x+40)-x)/2),y,y,y-35); //spikes formula 

	}
	/*This method checks collision and updates player values
	 * Pre: null
	 * Post: null
	 */
	public void perSecond() {

		p.perSecond(b, s); //updates the player values and checks collisions, 60 times a second

	}
	/*This method draws all the elements of the level
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) {
		System.out.println(xOff); //print location of player for reference and testing
		System.out.println(yOff);
		g.drawImage(Images.background[0], 19400 - (int) State.xOff, -1000 - (int) State.yOff, 10000, 2001, null);//draws the background thrice
		g.drawImage(Images.background[0], 9400 - (int) State.xOff, -1000 - (int) State.yOff, 10000, 2001, null);
		g.drawImage(Images.background[0], -500 - (int) State.xOff, -1000 - (int) State.yOff, 10000, 2001, null);

		g.setFont(new Font("Impact", Font.BOLD, 20));
		g.drawString("Score: " + (String.valueOf((int) (xOff / 25))), 890, 30);//displays the score of the player on top right
		p.draw(g);//updates the players location
		for (int i = 0; i < b.length; i++) {
			b[i].draw(g);//updates the blocks location

		}
		for (int i = 0; i < s.length; i++) {
			s[i].draw(g);//updates the spikes location
		}

	}
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {

		p.keyPressed(k);
		//passes keyPressed to player class
			}

	public void keyReleased(int k) {

		p.keyReleased(k);//passes keyReleased to player class
	
	}

}