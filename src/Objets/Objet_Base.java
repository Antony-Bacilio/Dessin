package Objets;
import java.awt.Graphics;
import java.awt.Point;

public abstract class Objet_Base
{
	public String FormeGeom;
	public abstract void dessiner(Graphics d);
	public abstract void ajouterPoint(Point e);
	public abstract void ajouterDimension(Point e);
	public abstract void deplacer(Point e);
	public abstract void valide();
		
}
