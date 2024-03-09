package estrutura_de_dados;
import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        //diagonal principal -> \
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Informe um número inteiro");
        n = sc.nextInt();

        int matriz[][]= new int[n][n];

        for(int l=0; l < matriz.length; l++){
            for(int c=0; c < matriz[l].length; c++){
                System.out.println("Informe um número:");
                matriz[l][c] = sc.nextInt();
            }
        }

        int somaDiagonal = 0;
            for(int l=0; l < matriz.length; l++){
                somaDiagonal += matriz[l][l];
            }
        System.out.println("A soma da diagonal principal é " + somaDiagonal);
    }
}
