
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
public class Level1State extends State {
	private Player p;
	private Block[] b; //arrays for blocks and spikes
	private Spikes[] s;
	public static boolean gg = false; //level indicator

	public Level1State(StateManager gm) {
		super(gm);
		gg = true; //makes level1 selected trues
	
	}
	/*This method creates all the blocks and spikes in the level
	 * Pre: null
	 * Post: null
	 */
	public void init() {

		b = new Block[57]; //Initializes the arrays for spikes and blocks
		s = new Spikes[40];

		p = new Player(38, 38, gm,15550); //calls the player class to create player

		s[0] = new Spikes(1205, 1245, 1225, 345, 345, 310); //Calls the spikes class at different points to construct the obstacles for the level
		s[1] = new Spikes(1245, 1285, 1265, 345, 345, 310);
		s[2] = new Spikes(1375, 1415, 1395, 190, 190, 155);
		s[3] = new Spikes(2080, 2120, 2100, 225, 225, 190);
		s[4] = new Spikes(2850, 2890, 2870, 345, 345, 310);
		s[5] = new Spikes(3150, 3190, 3170, 345, 345, 310);
		s[6] = new Spikes(3190, 3230, 3210, 345, 345, 310);
		s[7] = new Spikes(3490, 3530, 3510, 345, 345, 310);
		s[8] = new Spikes(3530, 3570, 3550, 345, 345, 310);
		s[9] = new Spikes(3570, 3610, 3590, 345, 345, 310);
		s[10] = new Spikes(4595, 4635, 4615, 160, 160, 125);
		s[11] = new Spikes(4635, 4675, 4655, 160, 160, 125);
		s[12] = new Spikes(4900, 4940, 4920, 110, 110, 75);
		s[13] = new Spikes(4940, 4980, 4960, 110, 110, 75);
		s[14] = new Spikes(4980, 5020, 5000, 110, 110, 75);
		s[15] = new Spikes(5165, 5205, 5185, 190, 190, 155);
		s[16] = new Spikes(5205, 5245, 5225, 230, 230, 195);
		s[17] = new Spikes(5850, 5890, 5870, 260, 260, 225);
		s[18] = new Spikes(6185, 6225, 6205, 290, 290, 255);
		s[19] = new Spikes(7130, 7170, 7150, 210, 210, 175);
		s[20] = new Spikes(8850, 8890, 8870, 345, 345, 310);
		s[21] = new Spikes(8890, 8930, 8910, 345, 345, 310);
		s[22] = new Spikes(9050, 9090, 9070, 345, 345, 310);
		s[23] = new Spikes(9090, 9130, 9110, 345, 345, 310);
		s[24] = new Spikes(9450, 9490, 9470, 345, 345, 310);
		s[25] = new Spikes(9490, 9530, 9510, 345, 345, 310);
		s[26] = new Spikes(9530, 9570, 9550, 345, 345, 310);
		s[27] = new Spikes(9910, 9950, 9930, 345, 345, 310);
		s[28] = new Spikes(10950, 10990, 10970, 345, 345, 310);
		s[29] = new Spikes(10950, 10990, 10970, 160, 160, 195);
		s[30] = new Spikes(10990, 11030, 11010, 345, 345, 310);
		s[31] = new Spikes(10990, 11030, 11010, 160, 160, 195);
		s[32] = new Spikes(11330, 11370, 11350, 345, 345, 310);
		s[33] = new Spikes(11370, 11410, 11390, 345, 345, 310);
		s[34] = new Spikes(14400, 14440, 14420, 345, 345, 310);
		s[35] = new Spikes(14700, 14740, 14720, 345, 345, 310);
		s[36] = new Spikes(14740, 14780, 14760, 345, 345, 310);
		s[37] = new Spikes(15040, 15080, 15060, 345, 345, 310);
		s[38] = new Spikes(15080, 15120, 15100, 345, 345, 310);
		s[39] = new Spikes(15120, 15160, 15140, 345, 345, 310);

		b[0] = new Block(100, 345, 20000, 500);//Calls the block class at different points to construct the platforms and walls for the level
		b[1] = new Block(-700, -1000, 900, 5000);
		b[2] = new Block(1375, 190, 40, 40);
		b[3] = new Block(1505, 325, 145, 25);
		b[4] = new Block(1750, 275, 60, 20);
		b[5] = new Block(1910, 225, 210, 120);
		b[6] = new Block(2240, 275, 60, 20);
		b[7] = new Block(2390, 315, 60, 20);
		b[8] = new Block(3890, 310, 40, 40);
		b[9] = new Block(4065, 260, 40, 85);
		b[10] = new Block(4240, 210, 40, 160);
		b[11] = new Block(4415, 160, 370, 215);
		b[12] = new Block(4600, 105, 80, 20);
		b[13] = new Block(4785, 190, 420, 200);
		b[14] = new Block(4900, 110, 120, 20);
		b[15] = new Block(5205, 230, 220, 150);
		b[16] = new Block(5205, 230, 320, 30);
		b[17] = new Block(5685, 260, 205, 20);
		b[18] = new Block(6020, 290, 205, 20);
		b[19] = new Block(6335, 310, 140, 20);
		b[20] = new Block(6635, 290, 50, 20);
		b[21] = new Block(6825, 250, 50, 20);
		b[22] = new Block(7005, 210, 50, 20);
		b[25] = new Block(7130, 210, 960, 30);
		b[26] = new Block(7260, 210, 700, 200);
		b[27] = new Block(7330, -400, 700, 500);
		b[28] = new Block(7450, 0, 460, 130);
		b[29] = new Block(8160, 250, 50, 20);
		b[30] = new Block(8260, 290, 50, 20);
		b[32] = new Block(9950, 305, 40, 40);
		b[33] = new Block(9990, 305, 40, 40);
		b[34] = new Block(10030, 305, 40, 40);
		b[35] = new Block(10140, 285, 80, 20);
		b[36] = new Block(10290, 240, 80, 20);
		b[37] = new Block(10430, 305, 40, 40);
		b[38] = new Block(10470, 305, 40, 40);
		b[39] = new Block(10510, 305, 40, 40);
		b[40] = new Block(10950, 120, 80, 40);
		b[41] = new Block(11410, 305, 40, 40);
		b[42] = new Block(11600, 265, 40, 100);
		b[43] = new Block(11790, 225, 40, 300);
		b[44] = new Block(11980, 185, 40, 300);
		b[45] = new Block(12020, 185, 50, 20);
		b[46] = new Block(12120, 225, 50, 20);
		b[47] = new Block(12220, 265, 50, 20);
		b[48] = new Block(12320, 305, 50, 20);
		b[49] = new Block(12720, 305, 40, 40);
		b[50] = new Block(12760, 305, 60, 20);
		b[51] = new Block(12920, 305, 60, 20);
		b[53] = new Block(13120, 305, 80, 40);
		b[54] = new Block(13120, 255, 40, 50);
		b[55] = new Block(13150, 255, 60, 20);
		b[56] = new Block(13340, 235, 60, 20);
		b[52] = new Block(13600, 265, 60, 20);
		b[24] = new Block(13700, 265, 100, 200);
		b[23] = new Block(13800, 285, 100, 200);
		b[31] = new Block(13900, 305, 100, 200);

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
		g.drawImage(Images.background[0], 9400 - (int) State.xOff, -1000 - (int) State.yOff, 10000, 2001, null); //draws the background twice
		g.drawImage(Images.background[0], -500 - (int) State.xOff, -1000 - (int) State.yOff, 10000, 2001, null);
		g.setFont(new Font("Impact", Font.BOLD, 20)); //changes font
		g.drawString("Score: " + (String.valueOf((int) (xOff / 25))), 890, 30);//displays the score of the player on top right
		p.draw(g); //updates the players location
		for (int i = 0; i < b.length; i++) {
			b[i].draw(g);//updates the blocks location

		}
		for (int i = 0; i < s.length; i++) {
			s[i].draw(g); //updates the spikes location
		}

	}
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {

		p.keyPressed(k); //passes keyPressed to player class
	}

	public void keyReleased(int k) {

		p.keyReleased(k);//passes keyReleased to player class
	}

}