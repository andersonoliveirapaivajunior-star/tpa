
import java.util.*;
public class Soma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int a, b, r;
		
		System.out.println("Digite o 1º número: ");
		a = in.nextInt();
		
		System.out.println("Digite o 2º número");
		b = in.nextInt();
		
		r =  a + b;
		
		System.out.println("O total de " + a + " + " + b + " = " + r);

		in.close();
	}
}
