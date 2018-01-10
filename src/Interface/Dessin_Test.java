package Interface;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Dessin_Test extends JFrame
{
	Panel_Objet_Composite pnl_obj_comp;
	Panel_Boutons pf;
	
	public Dessin_Test(String name)
	{
		super(name);
		setSize(1600, 900);
		//this.setBackground(Color.RED);
		pnl_obj_comp = new Panel_Objet_Composite(this);
		pf = new Panel_Boutons(this);
		setVisible(true);
		
		ImageIcon icon_UL = new ImageIcon("src/Imagenes/UL.jpg");
		this.setIconImage(icon_UL.getImage());
		
	}
	
	//@SuppressWarnings("unused")
	//public static void main(String[] args)
	//{
		//Dessin_Test des_test = new Dessin_Test("Dessin");
	//}
}
