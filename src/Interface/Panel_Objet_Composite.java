package Interface;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JPanel;

import Objets.Objet_Base;

@SuppressWarnings("serial")
public class Panel_Objet_Composite extends JPanel
{
	Evenements_Mouse ml;
	ArrayList<Objet_Base> listeObjet;
	public Objet_Base prochaineForme;
	
	public Panel_Objet_Composite(Dessin_Test des_test)
	{
		this.setBackground(Color.BLACK);
		ml = new Evenements_Mouse(this);
		listeObjet = new ArrayList<Objet_Base>();
		addMouseListener(ml);
		addMouseMotionListener(ml);
		des_test.add(this, BorderLayout.CENTER);
	}
	
	@Override
	public void paintComponent(Graphics d)
	{
		System.out.println("Debut dessin");
		d.clearRect(0, 0, this.getWidth(), this.getHeight());
		Iterator<Objet_Base> i = listeObjet.iterator();
		while(i.hasNext())
		{
			Objet_Base f;
			//System.out.println("Rectangle in List");
			f = i.next();
			//f.deplacer(new Point(2, 2));
			f.dessiner(d);
		}
		
		if(prochaineForme != null)
		{
			prochaineForme.dessiner(d);
		}
	}
}