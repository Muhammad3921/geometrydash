package physics;

import java.awt.Point;
import java.awt.Rectangle;


public class Collision {
	public static boolean pBlock(Point p, Rectangle b) {
		return b.contains(p);

	}

	
}
