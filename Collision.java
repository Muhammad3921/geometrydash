package physics;

import java.awt.Point;

import objects.Block;
import objects.Spikes;

public class Collision {
	public static boolean pBlock(Point p, Block b){
		return b.contains(p);
	
	}
	public static boolean sBlock(Point p, Spikes s){
		
		return (s.xcol(p));
		
	}
}
