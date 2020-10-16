package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

import main.Gamepanel;

public class DeathS extends State{
	public String[] ar = { "Main Menu", "Quit" };
	public int select = 0;
	public DeathS(StateManager gm) {
		super(gm);
		
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
		g.setColor(new Color(255, 160, 122));
		g.fillRect(0, 0, Gamepanel.width, Gamepanel.height);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Times New Roman", Font.BOLD, 170));
		g.drawString("YOU DIED", 70,Gamepanel.height / 2-25);
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(26, 141, 255));
			} else {
				g.setColor(Color.BLACK);

			}
			
			g.setFont(new Font("Times New Roman", Font.BOLD, 55));
			g.drawString(ar[i], 225 + i * 400, Gamepanel.height / 2+125);

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
				StateManager.st.push(new Menu(gm));
			}

			if (select == 1) {
				System.exit(0);
			}

			
		}

	}

	@Override
	public void keyrel(int k) {

	}

}

