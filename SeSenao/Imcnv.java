
import java.util.*;
public class Imcnv {
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double altura, peso, imc; 
		
		System.out.println("Digite qual e a sua altura: ");
		altura = in.nextDouble();
		
		System.out.println("Digite quanto voce pesa: ");
		peso = in.nextDouble();
		
		imc = peso / (altura * altura);
		
		System.out.println("Seu IMC e: " + imc);
		
		if (imc < 18.5) {
			System.out.println("Excesso de magreza.");
		} else if (imc >= 18.5 && imc < 25) {
			System.out.println("Peso normal.");
		} else if (imc >= 25 && imc < 30) {
			System.out.println("Excesso de peso.");
		} else if (imc >= 30 && imc < 35) {
			System.out.println("Obesidade g1");
		} else if (imc >= 35 && imc < 40) {
			System.out.println("Obesidade g2");
		} else {
			System.out.println("Obesidade g3");
		}
		
		in.close();
	}
}
