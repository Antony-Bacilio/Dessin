package Objets;
import java.awt.Graphics;
import java.awt.Point;

public class Rectangle extends Objet_Base
{
	
	int x, y, width, height, x2, y2;
	
	public Rectangle()
	{
		System.out.println("Create Rectangle ...");
	}
	
	@Override
	public void dessiner(Graphics d)
	{
		if(x <= x2 && y <= y2)
			d.drawRect(x, y, width, height);
		else if(x >= x2 && y >= y2)
			d.drawRect(x2, y2, width, height);
		else if(x <= x2 && y >= y2)
			d.drawRect(x, y2, width, height);
		else if(x >= x2 && y <= y2)
			d.drawRect(x2, y, width, height);
		
	}

	@Override
	public void ajouterPoint(Point e)
	{
		x = e.x;
		y = e.y;
	}
	
	@Override
	public void ajouterDimension(Point e)
	{
		width = Math.abs(e.x - x);
		height = Math.abs(e.y - y);
		x2 = e.x;
		y2 = e.y;
	}
	
	@Override
	public void deplacer(Point e)
	{
		x = x+e.x;
		y = y+e.y;
	}

	@Override
	public void valide() {
		// TODO Auto-generated method stub
		
	}


	
}