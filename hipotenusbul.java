package bukodyazilmadanogrenilmez;

import java.util.Scanner;
import java.math.*;
public class hipotenusbul {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("a kenar sayisi girin: ");
		a = scan.nextInt();
		
		System.out.println("b kenar sayisi girin: ");
		b = scan.nextInt();
		
	    c= (int)Math.sqrt((a*a) + (b*b));
	    
		System.out.println("hipotenus: "+ c);
		
		
		
        
	}

}
