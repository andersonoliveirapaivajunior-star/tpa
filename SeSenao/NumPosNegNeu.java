
import java.util.*;
public class NumPosNegNeu {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um número inteiro: ");
		n = in.nextInt();
		
		if (n < 0) {
			System.out.println("Seu número é negativo.");
		} else if (n == 0) {
			System.out.println("Seu número é neutro.");
		} else {
			System.out.println("Seu número é positivo.");
		}
		
		in.close();
	}
}
