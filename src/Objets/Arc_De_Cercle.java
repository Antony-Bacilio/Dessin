package Objets;
import java.awt.Graphics;
import java.awt.Point;


public class Arc_De_Cercle extends Cercle{

	int x, y,  anglA, anglB;
	int w = rayon*2;
	int h = rayon*2;
	
	public Arc_De_Cercle()
	{
		System.out.println("Create Cercle ...");
	}
	
	@Override
	public void dessiner(Graphics d){
		
		d.drawArc( x, y, w, h,anglA , anglB);		
					
	}

	@Override
	public void ajouterPoint(Point e){
		x = e.x;
		y = e.y;

	}
	
	@Override
	public void ajouterDimension(Point e){
		rayon = (int) Math.sqrt(Math.pow(Math.abs(e.x - x), 2) + Math.pow(Math.abs(e.y - y), 2));
	}
	
	@Override
	public void deplacer(Point e){
		x = x+e.x;
		y = y+e.y;
	}

	@Override
	public void valide() {
		// TODO Auto-generated method stub
		
	}


}


