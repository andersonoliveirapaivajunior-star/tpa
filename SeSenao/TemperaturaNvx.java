
import java.util.Scanner;
public class TemperaturaNvx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em Fahreinheit: ");
		f = in.nextDouble();
		
		c = (f - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius e: " + c + "°C.");
		
		if (c < 0) {
			System.out.println("Frio extremo.");
		} else if (c <= 10) {
			System.out.println("Frio");
		} else if (c <= 20) {
			System.out.println("Frio moderado");
		} else if (c <= 24) {
			System.out.println("Ameno");
		} else {
			System.out.println("Quente");
		}
		
		in.close();
	}
}
