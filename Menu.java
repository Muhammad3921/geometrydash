package gameState;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import image.Images;
import main.Gamepanel;

public class Menu extends State {
	public String[] ar = { "Start", "Help", "Quit" };
	public int select = 0;

	public Menu(StateManager gm) {
		super(gm);

	}

	@Override
	public void intit() {

	}

	@Override
	public void persec() {

	}

	@Override
	public void draw(Graphics g) {
		g.drawImage(Images.background[2],0, 0, Gamepanel.width, Gamepanel.height,null);
		for (int i = 0; i < ar.length; i++) {
			if (i == select) {
				g.setColor(new Color(232, 155, 39));
			} else {
				g.setColor(Color.white);

			}
			g.setFont(new Font("Impact", Font.BOLD, 80));
			g.drawString(ar[i], Gamepanel.width / 2 - 95, 125 + i * 125);

		}

	}

	public void keypres(int k) {
		if (k == KeyEvent.VK_DOWN) {
			select++;
			if (select >= ar.length) {
				select = 0;
			}
		} else if (k == KeyEvent.VK_UP) {
			select--;
			if (select < 0) {
				select = ar.length - 1;
			}
		}
		if (k == KeyEvent.VK_ENTER) {
			if (select == 0) {
				StateManager.st.push(new PlayerSelect(gm));
			}

			if (select == 1) {
				
			}

			if (select == 2) {
				System.exit(0);
			}
		}

	}

	@Override
	public void keyrel(int k) {

	}

}