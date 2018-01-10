package Objets;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JOptionPane;

public class Losange extends Objet_Base{


	int x, y, x2, y2, x3,y3 ,x4, y4;
	
	public Losange()
	{
		this.FormeGeom = "Carre";
		System.out.println("Create Carre ...");
	}
	
	@Override
	public void dessiner(Graphics d) {
		// TODO Auto-generated method stub
		
		/*if(x <= x2 && y <= y2)
			d.drawRect(x, y, width, width);
		else if(x >= x2 && y >= y2)
			d.drawRect(x2, y2, width,width);
		else if(x <= x2 && y >= y2)
			d.drawRect(x, y2, width, width);
		else if(x >= x2 && y <= y2)
			d.drawRect(x2, y, width, width);*/
		
		
		int[] PtsX = {x,x2,x3,x4};
		int[] PtsY = {y,y2,y3,y4};
		if(x2 == x4 || y == y3) d.drawPolygon(PtsX, PtsY, 4);
		else JOptionPane.showMessageDialog(null, "Ce n'est pas un Losange", "Attention", JOptionPane.WARNING_MESSAGE);
	}

	@Override
	public void ajouterPoint(Point e) {
		// TODO Auto-generated method stub
		x = e.x;
		y = e.y;
	}

	@Override
	public void ajouterDimension(Point e) {
		// TODO Auto-generated method stub
		x2 = e.x;
		y2 = e.y;
	}

	@Override
	public void deplacer(Point e) {
		// TODO Auto-generated method stub
		x = x+e.x;
		y = y+e.y;
	}

	@Override
	public void valide() {
		// TODO Auto-generated method stub
		
	}


}
