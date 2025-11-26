
import java.util.*;
public class Idadenv {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano em que voce nasceu: ");
		anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println(idade + " anos.");
		
		if (idade >= 18) {
			System.out.println("Voce e maior de idade.");
		} else {
			System.out.println("Voce e menor de idade.");
		}
		
		in.close();
	}
}
