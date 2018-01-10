package Interface;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Evenements_Mouse extends MouseAdapter
{
	Panel_Objet_Composite pnl_obj_comp;
	
	public Evenements_Mouse(Panel_Objet_Composite pnl_obj_comp)
	{
		this.pnl_obj_comp = pnl_obj_comp;
	}
	
	@Override
	public void mousePressed(MouseEvent e)
	{
		if(pnl_obj_comp.prochaineForme != null)
		{
			System.out.println("Pressed");
			pnl_obj_comp.prochaineForme.ajouterPoint(e.getPoint());
			pnl_obj_comp.repaint();
		}
	}
	
	@Override
	public void mouseReleased(MouseEvent e){
		if(pnl_obj_comp.prochaineForme != null){
			System.out.println("Released");
			pnl_obj_comp.listeObjet.add(pnl_obj_comp.prochaineForme);
			
			if(pnl_obj_comp.prochaineForme.FormeGeom.equals("Triangle")){
				pnl_obj_comp.prochaineForme.valide();
			}
			else{
				pnl_obj_comp.prochaineForme = null;
			}
			
			
		}
	}
	
	@Override
	public void mouseDragged(MouseEvent e){
		
		if(pnl_obj_comp.prochaineForme != null){
			System.out.println("Dragged");
			pnl_obj_comp.prochaineForme.ajouterDimension(e.getPoint());
			pnl_obj_comp.repaint();
		}
	}
	
	@Override
	/*Lorqu'on fait un Click (bouton gauche)*/
	public void mouseClicked(MouseEvent e){
		
		if(pnl_obj_comp.prochaineForme != null){
			if(pnl_obj_comp.prochaineForme.FormeGeom.equals("Triangle")){	
				pnl_obj_comp.prochaineForme = null;
				pnl_obj_comp.repaint();
			}
		}

	}
	
	@Override
	public void mouseMoved(MouseEvent e){
		if(pnl_obj_comp.prochaineForme != null){
			if(pnl_obj_comp.prochaineForme.FormeGeom.equals("Triangle")){
				pnl_obj_comp.prochaineForme.ajouterDimension(e.getPoint());
				pnl_obj_comp.repaint();
			}
		}
		
	}
}