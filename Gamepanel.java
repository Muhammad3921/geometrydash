package main;

import gameState.StateManager;
import image.Images;

import java.awt.Dimension;
import java.awt.Graphics;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Gamepanel extends JPanel implements Runnable,KeyListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final int width = 1000;
	public static final int height = 500;
	private Thread t;
	private boolean running = false;
	private int fps = 60;
	private long ttime= 1000/fps;
	public StateManager	 gm;
public Gamepanel (){
	setPreferredSize(new Dimension (width,height));
	addKeyListener(this);
	setFocusable(true);
	new Images();
	go();
}

public void go(){
	running = true;
	t = new Thread(this);
	t.start();
	
}
public void run(){
	gm= new StateManager();
	long s, e, w;
	while (running){
		s=System.nanoTime();
		persecond();
		repaint();
		
		e = System.nanoTime() - s;
		w = ttime - e/1000000;
		if(w<0)
			w=5;
		try{
			Thread.sleep(w);
		} catch (Exception r){
			r.printStackTrace();
		}
		
	}
}
public void persecond(){
	gm.persec();
}

public void paintComponent(Graphics g){
	super.paintComponent(g);
	g.clearRect(0, 0, width, height);
	gm.draw(g);
}


	@Override
	public void keyPressed(KeyEvent e) {
		gm.keypressed(e.getKeyCode());
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		gm.keyreleased(e.getKeyCode());
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

}
