
import java.util.*;
public class Idadenvx {
	
	

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano em que voce nasceu: ");
		anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println(idade + " anos.");
		
		if (idade < 10) {
			System.out.println("Voce e uma criança.");
		} else if (idade >= 10 && idade <18) {
			System.out.println("Voce e um adolescente.");
		} else if (idade >= 18 && idade < 60) {
			System.out.println("Você e um adulto.");
		} else {			
			System.out.println("Você e um idoso.");
		}
		
		in.close();
	}
}
