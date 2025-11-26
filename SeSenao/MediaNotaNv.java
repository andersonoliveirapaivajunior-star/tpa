
import java.util.*;
public class MediaNotaNv {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n1, n2, media;
		
		System.out.println("Digite a 1º nota do aluno: ");
		n1 = in.nextDouble();
		
		System.out.println("Digite a 2º nota do aluno: ");
		n2 = in.nextDouble();
		
		media = (n1 + n2) / 2;
		
		System.out.println("Media do aluno: " + media);
		
		if (media < 6) {
			System.out.println("Ele foi Reprovado");
		} else {
			System.out.println("Ele foi Aprovado");
		}
		
		in.close();
	}
}
