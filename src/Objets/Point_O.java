package Objets;


import java.awt.Point;

public class Point_O {

	private int X;
	private int Y;
	
	public Point_O() {
	}

	public Point_O(Point p) {
		setX(p.x);
		setY(p.y);
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		if(x>=0)X = x;
		else X=0;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		if(y>=0)Y = y;
		else Y=0;
	}
	
	public void Afficher_P(){
		
	}
	
	
}
