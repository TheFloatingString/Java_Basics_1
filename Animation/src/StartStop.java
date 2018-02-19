import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class StartStop implements ActionListener{

	private Anim anim;
	private JButton bouton;
	private boolean actif = false;
	
	public StartStop(Anim a, JButton b){
		anim = a;
		bouton = b;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (actif){
			anim.arrete();
		}
		
	}

}
