
import java.util.*;
public class ValorInvertido {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite o valor de A: ");
		a = in.nextInt();
		
		System.out.println("Digite o valor de B: ");
		b = in.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("Valores invertidos: " +"A: "+ a +", B: " + b + ".");
		
		in.close();
	}
}
