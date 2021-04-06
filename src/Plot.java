/**
 * 
 */

/**
 * @author Cherise Salmi
 *
 */
public class Plot {
private int x;
private int y;
private int width;
private int depth;

public Plot(){
	x = 0;
	y = 0;
	width = 1;
	depth = 1;
}
public Plot(Plot p){
	this.x = p.x;
	this.y = p.y;
	this.width = p.width;
	this.depth = p.depth;
}
public Plot(int x, int y, int width, int depth){
	this.x = x;
	this.y = y;
	this.width = width;
	this.depth = depth;
}

public boolean overlaps(Plot plot){
	if (x<plot.x+plot.width && x+width>plot.x && y<plot.y+plot.depth && y+depth>plot.y) {
		return true;
	}
	return false;
}
public boolean encompasses(Plot plot){
	if (x<=plot.x && x+width>=plot.x+plot.width && y<=plot.y && y+depth>=plot.y+plot.depth) {
		return true;
	}
	return false;
}

public void setX(int x) {
	this.x=x;
}
public int getX() {
	return x;
}
public void setY(int y) {
	this.y=y;
}
public int getY() {
	return y;
}
public void setWidth(int width) {
	this.width = width;
}
public int getWidth() {
	return width;
}public void setDepth(int depth) {
	this.depth=depth;
}
public int getDepth() {
	return depth;
}
public String toString() {
	
	return "Upper left: ("+x+","+y+"); Width: "+width +" Depth: "+depth;
	}
}
 