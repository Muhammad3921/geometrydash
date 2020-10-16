package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import image.Images;
import main.Gamepanel;

public class PlayerSelect extends State {
	public static int selectionp;

	public String[] ar = { "1", "2","3" };
	public int select = 0;
	
	public PlayerSelect(StateManager gm) {
		super(gm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void intit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void persec() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Images.background[2],0, 0, Gamepanel.width, Gamepanel.height,null);
		g.drawImage(Images.player [2], 40,	100,	200, 200, null);
		g.drawImage(Images.player [1], 400,	100,	200, 200, null);
		g.drawImage(Images.player [0], 740,	100,	200, 200, null);

		
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(232, 155, 39));
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 70));
			g.drawString(ar[i],  125 + i *350, Gamepanel.height / 2+125);
		

		}
		
	}

	@Override
	public void keypres(int k) {
		if (k == KeyEvent.VK_RIGHT) {
			select++;
			if (select >= ar.length) {
				select = 0;
			}
		} else if (k == KeyEvent.VK_LEFT) {
			select--;
			if (select < 0) {
				select = ar.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) {
			if (select == 0) {
				selectionp = 0;
				StateManager.st.push(new Level1State(gm));
			}

			if (select == 1) {
				selectionp = 1;
				StateManager.st.push(new Level1State(gm));

			}
			if (select == 2) {
				selectionp = 2;
				StateManager.st.push(new Level1State(gm));

			}

			
		
		}
	}

	@Override
	public void keyrel(int k) {
		// TODO Auto-generated method stub
		
	}

}