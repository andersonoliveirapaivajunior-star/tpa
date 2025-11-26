
import java.util.Scanner;
public class MediaNotaNvx {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		double n1, n2, m;
		
		System.out.println("Entre com a 1ª nota:");
		n1 = in.nextDouble();
		
		System.out.println("Entre com a 2ª nota:");
		n2 = in.nextDouble();
		
		m = (n1 + n2) / 2;
		
		System.out.println("A média e: " + m);
		
		if (m < 4) {
			System.out.println("Voce está reprovado!");
		}else if(m < 6) {
			System.out.println("Voce está de recuperaçao ");
		}else {
			System.out.println("Voce está aprovado! ");
		}
		
		in.close();
	}
}
