
import java.util.*;
public class Tptringulos {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.println("Digite a medida do lado A: ");
		a = in.nextDouble();
		
		System.out.println("Digite a medida do lado B: ");
		b = in.nextDouble();
		
		System.out.println("Digite a medida do lado C: ");
		c = in.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b) {
			if (a == b && b == c) {
				System.out.println("E um triângulo equilatero.");
			} else if (a == b || b == c || c ==a) { // || --> é "ou"
				System.out.println("E um triângulo isóceles.");
			} else {
				System.out.println("E um triângulo escaleno.");
			}
		} else {
			System.out.println("Não e um triângulo.");
		}
		
		in.close();
	}
}
