
public class AnimRunnable implements Runnable{

	private Anim anim;
	
	public AnimRunnable(Anim a){
		anim = a;
	}
	
	@Override
	public void run() {
		while(anim.actif()){
			anim.deplacer();
			anim.repaint();
			pause();
		}
	}
	
	private void pause(){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
