package entities;

import gameState.DeathS;
import gameState.Level1State;
import gameState.Level2State;
import gameState.PlayerSelect;
import gameState.State;
import gameState.StateManager;
import gameState.WinS;
import image.Images;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;

import objects.Block;
import objects.Spikes;
import physics.Collision;

import main.Gamepanel;
/*Player Class
 *Muhammad Hasnain and Sanaa Syed
 *Ms.Kapustina
 *Jun 11th, 2019
 *This Class controls the player and all the different conditions of the player 
 */
public class Player {
	/*File l1 = new File("/Users/sanaa/Desktop/GamePics/level1song.wav");
	File l2 = new File("/Users/sanaa/Desktop/GamePics/level2song.wav");
	*/
	File l1 = new File("H:\\GamePics\\level1song.wav"); // Imports the 2 different audio files for background music
	File l2 = new File("H:\\GamePics\\level2song.wav");
	AudioClip s1, s2;

	boolean right, left = false; //Declares the different conditions the code utilizes 
	boolean fall, jump, uu = false;
	public static boolean death, m;	
	private int wincond;
	public static  boolean win = false;
	public double x; //declares parametric values required to control the player
	public double y;
	private double jumpsp = 5;
	private double currentj = jumpsp;
	private double fallsp = 5;
	private double currentf = 0.1;
	private double mspeed = 4.5;
	private int width, height;
	private boolean topcol = false;
	private StateManager gm;


	@SuppressWarnings("deprecation")//suppression for audio
	public Player(int width, int height, StateManager gm, int i) { //sets all the values for the parametric values
		this.gm = gm;
		this.width = width;
		m = false;
		this.wincond = i;
		this.height = height;
		x = Gamepanel.width / 2;
		y = Gamepanel.height / 2;
		try {
			s1 = Applet.newAudioClip(l1.toURL()); //stores level1 and 2 audio into audio clip s1 and s2
			s2 = Applet.newAudioClip(l2.toURL());
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	/*This method updates all the values of the player 60 times a second
	 * Pre: The blocks and spikes array which are used to store the levels
	 * Post: null
	 */
	public void perSecond(Block[] b, Spikes[] s) {
		if (!uu) {
			if (Level1State.gg) // if level1 play level1 soundtrack
				s1.play();
			if (Level2State.gg)// if level2 play level2 soundtrack
				s2.play();
			uu = true;
		}
		int ix = (int) x;
		int iy = (int) y;
		if (State.yOff > 350)//checks if player has fell of the platforms  and kills them
			death = true;

		if (State.xOff > wincond) //checks if the player has reached the end
			win = true;

		for (int f = 0; f < s.length; f++) { //checks collision for the right side of the player with a spike and kills it
			if (Collision.sBlock(new Point(ix + width + (int) State.xOff, iy //point at bottom right
					+ (int) State.yOff), s[f])
					|| Collision.sBlock(new Point( //point at top right
							ix + width + (int) State.xOff, iy + height
									+ (int) State.yOff), s[f])
					|| Collision.sBlock(new Point( //point mid way
							ix + width + (int) State.xOff, iy + height / 2
									+ (int) State.yOff), s[f])
					|| Collision.sBlock(new Point( //point quarter way
							ix + width + (int) State.xOff, iy + height*1/4 + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point( //point 3 quarters way
							ix + width + (int) State.xOff, iy
									+ (height * 3 / 4) + (int) State.yOff),
							s[f])) {
				right = false;
				death = true;
			}
			if (Collision.sBlock(new Point(ix + (int) State.xOff, iy  //check bottom collision of player with spike and kills it
					+ (int) State.yOff), s[f])// left corner and continues by placing a point every 2 pixels
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 2, iy
							+ height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 4, iy
							+ height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 6, iy
							+ height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 8, iy
							+ height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 10,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 12,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 14,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 16,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 18,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 20,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 22,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 24,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 26,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(ix + (int) State.xOff + 28,
							iy + height + (int) State.yOff), s[f])
					|| Collision.sBlock(new Point(
							ix + width + (int) State.xOff, iy + height
									+ (int) State.yOff), s[f])) {// right corner
				death = true;
			}

		}

		for (int i = 0; i < b.length; i++) { //Collisions for the blocks and the player
			if (Collision.pBlock(new Point(ix + width + (int) State.xOff, iy
					+ (int) State.yOff), b[i]) //point at bottom right
					|| Collision.pBlock(new Point(//point at top right
							ix + width + (int) State.xOff, iy + height
									+ (int) State.yOff), b[i])
									|| Collision.pBlock(new Point(// point half way right
											ix + width + (int) State.xOff, iy + height/2
													+ (int) State.yOff), b[i]))

			{
				right = false;
				death = true;
			}

			
			if (Collision.pBlock(new Point(ix + (int) State.xOff + 1, iy
					+ (int) State.yOff - 2), b[i])
					|| Collision.pBlock(new Point(ix + width + (int) State.xOff //checks the collision for the top of the player
							- 2, iy + (int) State.yOff - 2), b[i])) {
				jump = false;
				fall = true;
			}
			if (Collision.pBlock(new Point(ix + (int) State.xOff, iy + height
					+ (int) State.yOff), b[i])
					|| Collision.pBlock(new Point(ix + width + (int) State.xOff // checks the collision for the base of the player
							- 2, iy + height + (int) State.yOff + 8), b[i])) {

				fall = false;
				topcol = true;

			} else {
				if (!topcol && !jump) { //if no collision is met then it is falling 
					fall = true;
				}
			}

		}

		topcol = false;
		if (death) { //if player dies pushes to death screen with their position
			if(wincond==15550)//checks if player was on level1 or 2
			StateManager.st.push(new DeathS(gm,(int)Level1State.xOff));
			else
				StateManager.st.push(new DeathS(gm,(int)Level2State.xOff));
			m = true;
			s1.stop(); //stops all music
			s2.stop();

		}
		if (win) { //if player wins pushes to win screen with their position
			if(wincond==15550)//checks if player was on level1 or 2
				StateManager.st.push(new WinS(gm,(int)Level1State.xOff));
				else
					StateManager.st.push(new WinS(gm,(int)Level2State.xOff));
			s1.stop(); //stops all music
			s2.stop();
		}

		if (right) { //if right then moves background with move speed
			State.xOff += mspeed;
		}
		if (left) {//if left then moves background with move speed
			State.xOff -= mspeed;
		}
		if (jump) { //if jump moves screen down at certain speeds
			State.yOff -= currentj;
			currentj -= 0.2; //reduces fall speed to emulate gravity
			if (currentj <= 0) {
				currentj = jumpsp;
				jump = false;
				fall = true; //makes player fall when it reaches the top
			}

		}

		if (fall) { // if player is falling it moves screen up at certain speed
			State.yOff += currentf;
			if (currentf <= fallsp) { // emulates gravity
				currentf += 0.2;
			}
		}
		if (!fall) { //resets fall speed
			currentf = 0.2;
		}
	}
	/*This method draws the player icon onto the game
	 * Pre: Graphics g
	 * Post: null
	 */
	public void draw(Graphics g) {
		g.setColor(Color.black);
		if (PlayerSelect.selectionp == 0) //draws the corresponding selected player
			g.drawImage(Images.player[2], (int) x, (int) y, width, height, null);
		if (PlayerSelect.selectionp == 1)
			g.drawImage(Images.player[1], (int) x, (int) y, width, height, null);
		if (PlayerSelect.selectionp == 2)
			g.drawImage(Images.player[0], (int) x, (int) y, width, height, null);

	}
	/*This method adds keylistener and checks which key is pressed
	 * Pre: int k (value of key pressed)
	 * Post: null
	 */
	public void keyPressed(int k) {

		if (k == KeyEvent.VK_RIGHT) //checks if user pressed right key
			right = true;
		if (k == KeyEvent.VK_LEFT)//checks if user pressed left key
			left = false;
		if (k == KeyEvent.VK_SPACE && !jump && !fall)//checks if user pressed space key 
			jump = true;
	}

	public void keyReleased(int k) {
		
	}
}