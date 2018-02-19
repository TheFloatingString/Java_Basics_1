import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Anim extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int x = 0;		// coin superieur en x
	private int y = 0;		// coin superieur en y
	private int xspeed = 1;
	private int yspeed = 1;

	
	
	private int X = 50;		// coin superieur en x
	private int Y = 50;		// coin superieur en y
	private int Xspeed = 1;
	private int Yspeed = 1;
	
	
	private boolean actif = false;
	
	public void animer(){
		if (!actif) {
			actif = true;
			AnimRunnable run  = new AnimRunnable(this);
			Thread t = new Thread(run);
			t.start();
		}
		
	}
	
	
	public boolean actif(){
		return actif;
	}
	
	public void arreter(){
		actif = false;
	}
	
	public void deplacer(){
		x += 5*xspeed;
		y += 5*yspeed;

		if (x >= getWidth() - 50){
			xspeed =-1;
		}
		if (x <= 0){
			xspeed = 1;
		}
		if (y >= getHeight() - 50){
			yspeed = -1;
		}
		if (y <= 0){
			yspeed = 1;
		}
		
		// x = (x + 1) % (getWidth() - 50);
		// y = (y + 1) % (getHeight() - 50);
		
	}
	
	@Override
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillOval(x, y, 50, 50);
		g.setColor(Color.RED);
		g.fillOval(x+50, y+50, 50, 50);
		g.setColor(Color.GREEN);
		g.fillOval(x+100, y+50, 50, 50);
		g.setColor(Color.RED);
		g.fillOval(X, Y, 50, 50);
	}

	
	
	
}
 