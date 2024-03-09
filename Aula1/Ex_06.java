package estrutura_de_dados;

import java.util.Scanner;

public class Ex_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Informe um número inteiro");
        n = sc.nextInt();
        
        int matriz[][] = new int[n][n];
        int diagSecundaria[] = new int[n];
        
        for(int l=0; l < matriz.length; l++){
            for(int c=0; c <matriz[l].length; c++){
                System.out.println("Informe um número:");
                matriz[l][c] = sc.nextInt();
            }
        }
        
        for (int l = 0; l < n; l++) {
            diagSecundaria[l] = matriz[l][n - 1 - l];
        } 
        
        System.out.println("Diagonal secundária:");
        for (int l = 0; l < n; l++) {
            System.out.print(diagSecundaria[l] + " ");
        }
        
    }
}
