
public class Crepes {

	public static void main(String[] args){
		
			int stack_crepes = 312;
			System.out.println((stack_crepes/100)%10);
			System.out.println((stack_crepes/10)%10);
			System.out.println((stack_crepes/1)%10);
			
			stack_crepes = (int) (3*Math.pow(10, 1)+1*Math.pow(10, 2)+(stack_crepes/Math.pow(10, 0))%10);
			System.out.println(stack_crepes);

	}
	
}
