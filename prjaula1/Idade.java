
import java.util.Scanner;
public class Idade {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int anoNasc, anoAtual, idade;
		
		System.out.println("Digite o ano em que voce nasceu: ");
		anoNasc = in.nextInt();
		
		System.out.println("Digite o ano atual: ");
		anoAtual = in.nextInt();
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Voce tem " + idade + " anos.");
		
		in.close();
	}
}
