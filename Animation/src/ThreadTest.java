
public class ThreadTest {

	public static void main(String[] args){
		Thread t1 = new Thread(new RunnableTest("A"));
		Thread t2 = new Thread(new RunnableTest("B"));

		t1.start();
		t2.start();
		
		System.out.println("FIN");

	}
	
}
