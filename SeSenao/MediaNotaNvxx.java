import java.util.*;
public class MediaNotaNvxx {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
double n1, n2, media, notaExame, novaMedia;
		
		System.out.println("Digite a 1º nota do aluno: ");
		n1 = in.nextDouble();
		
		System.out.println("Digite a 2º nota do aluno: ");
		n2 = in.nextDouble();
		
		media = (n1 + n2) / 2;
		
		System.out.println("Média do aluno: " + media);
		
		if (media < 3) {
			System.out.println("Ele foi Reprovado!");
		} else if(media >= 6) {
			System.out.println("Ele foi Aprovado!");
		} else {
			System.out.println("O aluno está em EXAME.");
			System.out.println("Digite a nota do exame de recuperação: ");
			notaExame = in.nextDouble();
			
			novaMedia = (media + notaExame) / 2;
			
			if (novaMedia >= 6) {
				System.out.println("Ele foi Aprovado!");
			} else {
				System.out.println("Ele foi Reprovado!");
			}
		}
		
		in.close();
	}
}