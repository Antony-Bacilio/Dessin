package Objets;
import java.awt.Graphics;
import java.awt.Point;

public class Segment extends Objet_Base
{
	int x, y, x2, y2;
	
	public Segment()
	{
		System.out.println("Create Segment...");
	}

	@Override
	public void dessiner(Graphics d) 
	{
		if(x <= x2 && y <= y2)
			d.drawLine(x, y, x2, y2);
		else if(x >= x2 && y >= y2)
			d.drawLine(x2, y2, x, y);
		else if(x <= x2 && y >= y2)
			d.drawLine(x2, y2, x, y);
		else if(x >= x2 && y <= y2)
			d.drawLine(x, y, x2, y2);
			
	}

	@Override
	public void ajouterPoint(Point e){
		
		x=x2= e.x;
		y=y2= e.y;		
	}

	@Override
	public void ajouterDimension(Point e){
		x2=e.x;
		y2=e.y;
		
	}

	@Override
	public void deplacer(Point p){
		x = x+p.x;
		y = y+p.y;
			
	}

	@Override
	public void valide() {
		// TODO Auto-generated method stub
		
	}


	
}