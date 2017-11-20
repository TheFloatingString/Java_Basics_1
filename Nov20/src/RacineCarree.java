
public class RacineCarree {

	public static void main(String[] args){
		double x = 5;
		double e = 2;
		
		while(!(
				(e * e<x+0.0000000000000001) &&
				(e * e>x-0.0000000000000001))){
			e = (e+x/e)/2;
			System.out.println(e);
		}
	}
	
}
