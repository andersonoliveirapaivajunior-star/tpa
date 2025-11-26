
import java.util.*;
public class Imc {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double peso, altura, imc;
		
		System.out.println("Digite o seu peso: ");
		peso = in.nextDouble();
		
		System.out.println("Digite a sua altura: ");
		altura = in.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("O seu IMC e: " + imc + ".");
		
		in.close();
	}
}
