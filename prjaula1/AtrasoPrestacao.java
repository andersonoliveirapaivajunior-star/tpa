
import java.util.*;
public class AtrasoPrestacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double prestacao, valor, taxa, tempo;
		
		System.out.println("Digite o valor original de sua prestação: ");
		valor = in.nextDouble();
		
		System.out.println("Digite o valor da taxa que está sendo aplicada diariamente"
				+ " (Ex: 10% = 0,10): ");
		taxa = in.nextDouble();
		
		System.out.println("Digite a quantidade de dias que a prestação está atrasada: ");
		tempo = in.nextDouble();
		
		prestacao = valor + (valor * (taxa / 100) * tempo);
		
		System.out.println("O valor da sua prestação com juros aplicado é de: " + prestacao);
		
		in.close();
	}
}
