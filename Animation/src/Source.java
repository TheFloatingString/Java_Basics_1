import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Source {

	public static void main(String[] args){
		JPanel contenu = new JPanel();
		contenu.setLayout(new BorderLayout());
		
		
		
		Anim panel = new Anim();
		panel.setBackground(Color.WHITE);
		panel.animer();
		contenu.add(panel,  BorderLayout.CENTER);
		
		JButton startStop = new JButton("Commencer");
		startStop.addActionListener(new StartStop(panel, startStop));
		contenu.add(startStop, BorderLayout.SOUTH);

		JFrame frame = new JFrame("Animations");
		frame.setContentPane(contenu);
		frame.setSize(500, 400);
		frame.setDefaultCloseOperation(1);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		

		
	}
	
}
