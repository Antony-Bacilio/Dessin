package Objets;
import java.awt.Graphics;
import java.awt.Point;


public class Triangle extends Objet_Base
{
	
	Point[] p = new Point[3];
	int x, x2, x3, y, y2, y3;
	boolean p2 = false;
	
	public Triangle()
	{
		this.FormeGeom = "Triangle";
		System.out.println("Create Triangle ...");
		
	}

	@Override
	public void dessiner(Graphics g) {
		
		int[] px = { x, x2, x3};
		int[] py = { y, y2, y3};
		
		if(p2 == true){
			g.drawPolygon(px, py, 3);
		}
	
	}

	@Override
	public void ajouterPoint(Point p) {
		// TODO Auto-generated method stub
		x=p.x;
		y=p.y;
		
		x2=p.x;
		y2=p.y;
		
		x3=p.x;
		y3=p.y;

	}

	@Override
	public void ajouterDimension(Point p) {
		// TODO Auto-generated method stub
		if(p2)
		{
			x3=p.x;
			y3=p.y;
			System.out.println("p3");
		}
		else
		{
			System.out.println("p2");
			x2 = p.x;
			y2 = p.y;
			
		}
	}

	@Override
	public void deplacer(Point p) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void valide() 
	{
		p2 = true;
	
		
	}

	
}
