
import java.util.*;
public class AreaSala {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int largura, altura, area;
		
		System.out.println("Digite o tamanho da largura da sala em metros: ");
		largura = in.nextInt();
		
		System.out.println("Digite o tamanho da altura da sala em metros: ");
		altura = in.nextInt();
		
		area = largura * altura;
		
		System.out.println("A área da sala e de: " + area + "m");
		
		in.close();
	}
}
