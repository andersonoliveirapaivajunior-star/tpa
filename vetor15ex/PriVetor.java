package tpa;

 import java.util.Scanner;

public class PriVetor {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        final int TAM = 10;

        int a[] = new int[TAM];
        int i, ii;
        int d; 
        
        for (i = 0; i < TAM; i++) {
            System.out.print("Digite o numero[" + i + "]: ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {

            d = 0; 
           
            for (ii = 1; ii <= a[i]; ii++) {
                if (a[i] % ii == 0) {
                    d++;
                }
            }
           
            if (d == 2) {
                System.out.println(a[i] + " e primo");
            } else {
                System.out.println(a[i] + " nao é primo");
            }
        }

        in.close();
    }
}
