package frame;



import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

import physics.Collision;


public class Test extends JPanel implements KeyListener, Runnable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public boolean right,left,up,down = false;
public boolean colcheck;
private boolean running = false;
private int fps = 60;
public int x, y = 0;
Rectangle r  = new Rectangle(300,300,100,100);


private long ttime = 1000 / fps;
	public Test(){
		
			
			setPreferredSize(new Dimension(1000, 500));
			addKeyListener(this);
			setFocusable(true);
			running = true;
			
			Thread t = new Thread(this);
			t.start();
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		right = true;
	if (e.getKeyCode() == KeyEvent.VK_LEFT)
		left = true;
	if (e.getKeyCode() == KeyEvent.VK_UP)
		up = true;
	if (e.getKeyCode() == KeyEvent.VK_DOWN)
		down = true;
		
	}

	public void keyReleased(KeyEvent e) {
		
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
			right = false;
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
			left = false;
		if (e.getKeyCode() == KeyEvent.VK_UP)
			up = false;
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
			down = false;
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		long s, e, w;
		while (running) {
			colcheck=false;
			s = System.nanoTime();
		repaint();
		
		System.out.println(x);
		System.out.println(y);
		if(right)
			x++;
		if(left)
			x--;
		if(up)
			y--;
		if(down)
			y++;
		
		if (Collision.pBlock(new Point(x, y),r)||
				Collision.pBlock(new Point(x+30, y),r)||
					Collision.pBlock(new Point(x+30, y+30),r)||
						Collision.pBlock(new Point(x, y+30),r))
				colcheck=true;
		
		
		
		
		
		
		e = System.nanoTime() - s;
		w = ttime - e / 1000000;
		if (w < 0)
			w = 5;
		try {
			Thread.sleep(w);
		} catch (Exception r) {
			r.printStackTrace();
		}
		}
		
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.clearRect(0, 0, 1000, 500);
		g.fillRect(x, y, 30, 30);
		g.drawRect(300, 300, 100, 100);
				g.drawString("Collision = "+colcheck, 890,  30);
		
	}

}
