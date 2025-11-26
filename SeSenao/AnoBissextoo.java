
import java.util.*;
public class AnoBissexto {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ano; 
		
		System.out.println("Digite o ano que você quar descobrir se é bissexto ou não:");
		ano = in.nextInt();
		
		
		if ((ano % 4 == 0 && ano % 100 !=0) || (ano % 400 == 0)) {
			System.out.println("O ano " + ano + " é bissexto.");
		} else {
			System.out.println("O ano " + ano + " não é bissexto.");
		}
		
		in.close();
	}
}
