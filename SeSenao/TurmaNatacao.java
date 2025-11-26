
import java.util.*;
public class TurmaNatacao {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite sua idade para saber em qual turma da nataçao"
				+ "voce vai entrar: ");
		idade = in.nextInt();
		
		if (idade >= 5 && idade <=8) {
			System.out.println("Voce está na turma infantil!");
		} else if (idade >= 9 && idade <= 13) {
			System.out.println("Voce está na turma juvenil A!");
		} else if (idade >= 14 && idade <=17) {
			System.out.println("Voce está na turma juvenil B!");
		} else {
			System.out.println("Voce está na turma adulto!");
		}
		
		in.close();
	}
}
