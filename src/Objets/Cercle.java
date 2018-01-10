package Objets;
import java.awt.Graphics;
import java.awt.Point;

public class Cercle extends Objet_Base{
	
	int x, y, rayon;
	
	public Cercle(){
		System.out.println("Create Cercle ...");
	}
	
	@Override
	public void dessiner(Graphics g){
		g.drawOval(x-rayon, y-rayon, rayon*2, rayon*2);
	}

	@Override
	public void ajouterPoint(Point p){
		x = p.x;
		y = p.y;
	}
	
	@Override
	public void ajouterDimension(Point p){
		rayon = (int) Math.sqrt(Math.pow(Math.abs(p.x - x), 2) + Math.pow(Math.abs(p.y - y), 2));
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