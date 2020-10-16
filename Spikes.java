package objects;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

import gameState.State;

public class Spikes extends Polygon {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 Polygon p ;
int xpoints[] = {0,0,0};
int ypoints[] = {0,0,0};
int xpoints1[] = {0,0,0};
	int ypoints1[] = {0,0,0};
public Spikes(int x1,int x2,int x3,int y1,int y2, int y3){
	 xpoints[0]=x1;
	 xpoints[1]=x2;
	 xpoints[2]=x3;
	 ypoints[0]=y1;
	 ypoints[1]=y2;
	 ypoints[2]=y3;
	
}
public boolean xcol(Point f){
	Polygon p = new Polygon(xpoints, ypoints, 3);
	if(p.contains(f)){
		return true;
	}
	return false;
}
public void persec(){
	
	
}
public void draw(Graphics g){
	g.setColor(Color.BLACK);
	
	 xpoints1[0]= xpoints[0]-(int)State.xOff;
	 xpoints1[1]=xpoints[1]-(int)State.xOff;
	 xpoints1[2]=xpoints[2]-(int)State.xOff;
	 ypoints1[0]=ypoints[0]-(int)State.yOff;
	 ypoints1[1]=ypoints[1]-(int)State.yOff;
	 ypoints1[2]=ypoints[2]-(int)State.yOff;
	 npoints = xpoints.length;
	 Polygon p = new Polygon(xpoints1, ypoints1, 3);
	g.fillPolygon(p);
}
	
	
}
