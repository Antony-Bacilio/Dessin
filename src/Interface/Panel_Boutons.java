package Interface;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
//import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import javax.swing.BoxLayout;
//import javax.swing.Icon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import Objets.*;

@SuppressWarnings("serial")
public class Panel_Boutons extends JPanel implements ActionListener
{

	JButton btnRectangle;
	JButton btnCercle;
	JButton btnEllipse;
	JButton btnTriangle;
	JButton btnSegment;
	JButton btnLosange;
	JButton btnArcCercle;
	JButton btnNettoyer;
	//ImageIcon Im_seg;
	//Icon Ic_seg;
	
	Dessin_Test d;	
	
	
	public Panel_Boutons(Dessin_Test d)
	{
	
		
		this.d = d;
		
		
		
		btnRectangle = new JButton("Rectangle");
		//btnRectangle.setMinimumSize(new Dimension(160,60));
		//btnRectangle.setMaximumSize(new Dimension(160,60));
		
		//ImageIcon Im_seg = new ImageIcon("src/Imagenes/segment.png");
		//Icon Ic_seg = new ImageIcon(Im_seg.getImage().getScaledInstance(btnRectangle.getWidth(), btnRectangle.getHeight(), Image.SCALE_DEFAULT));
		btnRectangle.setText("Rectangle");
		//btnRectangle.setIcon(new ImageIcon("src/Imagenes/segment.png").getS);
		
		btnRectangle.addActionListener(this);
		
		btnLosange = new JButton("Losange");
		//btnLosange.setMinimumSize(new Dimension(160,60));
		//btnLosange.setMaximumSize(new Dimension(160,60));
		btnLosange.addActionListener(this);
		
		btnCercle = new JButton("Cercle");
		//btnCercle.setMinimumSize(new Dimension(160,60));
		//btnCercle.setMaximumSize(new Dimension(160,60));
		btnCercle.addActionListener(this);
		
		btnEllipse = new JButton("Ellipse");	
		//btnEllipse.setMinimumSize(new Dimension(160,60));
		//btnEllipse.setMaximumSize(new Dimension(160,60));
		btnEllipse.addActionListener(this);
		
		btnTriangle = new JButton("Triangle");
		//btnTriangle.setMinimumSize(new Dimension(160,60));
		//btnTriangle.setMaximumSize(new Dimension(160,60));
		btnTriangle.addActionListener(this);
		
		btnSegment = new JButton("Segment");
		//btnSegment.setMinimumSize(new Dimension(160,60));
		//btnSegment.setMaximumSize(new Dimension(160,60));
		btnSegment.addActionListener(this);
		
		btnArcCercle = new JButton("Arc de Cercle");
		//btnArcCercle.setMinimumSize(new Dimension(160,60));
		//btnArcCercle.setMaximumSize(new Dimension(160,60));
		btnArcCercle.addActionListener(this);
		
		btnNettoyer = new JButton("NETTOYER");
		btnNettoyer.addActionListener(this);
		
		
		//this.setLayout(new GridLayout(this, BoxLayout.Y_AXIS));
		this.setLayout(new GridLayout(0, 1, 0, 0));
		add(btnRectangle);
		add(btnCercle);
		add(btnTriangle);
		add(btnSegment);
		add(btnLosange);
		add(btnArcCercle);
		add(btnNettoyer);
		
		d.add(this, BorderLayout.LINE_START);
		this.setBackground(Color.BLACK);
	}

	@Override
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource() == btnRectangle)
		{
			System.out.println("Creation Rectangle");
			JOptionPane.showMessageDialog(null,"Creation dun Rectangle", "Message", JOptionPane.INFORMATION_MESSAGE);
			d.pnl_obj_comp.prochaineForme = new Rectangle();
		}
		else if(a.getSource() == btnCercle)
		{
			System.out.println("Creation Cercle");
			JOptionPane.showMessageDialog(null,"Creation dun Cercle", "Message", JOptionPane.INFORMATION_MESSAGE);
			d.pnl_obj_comp.prochaineForme = new Cercle();
		}
		
		else if(a.getSource() == btnTriangle)
		{
			System.out.println("Creation Triangle");
			JOptionPane.showMessageDialog(null,"Creation dun Triangle", "Message", JOptionPane.INFORMATION_MESSAGE);
			d.pnl_obj_comp.prochaineForme = new Triangle();
		}
		else if(a.getSource() == btnSegment)
		{
			System.out.println("Creation Segment");
			JOptionPane.showMessageDialog(null,"Creation dun Segment", "Message", JOptionPane.INFORMATION_MESSAGE);
			d.pnl_obj_comp.prochaineForme = new Segment();
		}
		else if(a.getSource() == btnLosange)
		{
			System.out.println("Creation Carre");
			JOptionPane.showMessageDialog(null,"Creation dun Losange", "Message", JOptionPane.INFORMATION_MESSAGE);
			d.pnl_obj_comp.prochaineForme = new Losange();
		}

		else if(a.getSource() == btnArcCercle)
		{
			System.out.println("Creation Cercle");
			JOptionPane.showMessageDialog(null,"Creation dun Arc", "Message", JOptionPane.INFORMATION_MESSAGE);
			d.pnl_obj_comp.prochaineForme = new Arc_De_Cercle();
		}
		else if(a.getSource() == btnNettoyer)
		{
			System.out.println("Nettoyage!");
			JOptionPane.showMessageDialog(null,"Nettoyage", "Message", JOptionPane.INFORMATION_MESSAGE);
			//Panel_Objet_Composite poc = new Panel_Objet_Composite(d);
			d.setBackground(Color.BLACK);;
		}
	}
}