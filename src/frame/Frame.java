package frame;

import java.awt.BorderLayout;

import javax.swing.JFrame;



public class Frame {
static JFrame f = new JFrame("col test");
	public static void main(String[] args) {
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
		f.setLayout(new BorderLayout());
		f.add(BorderLayout.CENTER, new Test());
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

}
