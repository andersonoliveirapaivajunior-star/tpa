
import java.util.*;
public class Salario {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double sBruto, sLiquido, desconto;
		
		System.out.println("Digite o seu sálario bruto: ");
		sBruto = in.nextDouble();
		
		desconto = sBruto * 0.08 + sBruto * 0.06;
		
		sLiquido = sBruto - desconto;
		
		System.out.println("Seu sálario líquido e R$ " + sLiquido + ".");
		
		in.close();
	}
}
