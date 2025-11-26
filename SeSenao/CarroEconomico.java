
import java.util.*;
public class CarroEconomico {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double d, c, consumo;
		
		System.out.println("Digite a distancia percorrida pelo carro em kilometros: ");
		d = in.nextDouble();
		
		System.out.println("Digite a capaidade do tanque do carro em litros: ");
		c = in.nextDouble();
		
		consumo = d / c; 
		
		System.out.println("O consumo do veiculo é: " + consumo + ".");
		
		if (consumo >= 10) {
			System.out.println("O carro é economico.");
		} else {
			System.out.println("O carro não e economico.");
		}
		
		in.close();
	}
}
