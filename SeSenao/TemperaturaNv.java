
import java.util.Scanner;
public class TemperaturaNv {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double c, f;
		
		System.out.println("Digite a temperatura em Fahreinheit: ");
		f = in.nextDouble();
		
		c = (f - 32) * 5 / 9;
		
		System.out.println("A temperatura em Celsius e: " + c + "°C.");
		
		if (c <= 15) {
			System.out.println("Está frio!");
		} else if (c < 22) {
			System.out.println("Está ameno!");
		} else {
			System.out.println("Está quente!");
		}
		
		in.close();
	}
}
