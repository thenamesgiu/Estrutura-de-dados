package estrutura_de_dados;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n,m;
        System.out.println("Informe a quantidade de linhas");
        n = sc.nextInt();
        
        System.out.println("Informe a quantidade de colunas");
        m = sc.nextInt();
        
        int matriz[][] = new int[n][m];
        int maior = matriz[0][0];
        
        int linha = 0;
        int coluna = 0;
        
        for(int l=0; l < matriz.length; l++){
            for(int c=0; c <matriz[l].length; c++){
                System.out.println("Informe um número:");
                matriz[l][c] = sc.nextInt();
            }
        }
        for (int l = 0; l < matriz.length; l++){
            for(int c=0; c<matriz[l].length; c++){
                if(matriz[l][c] > maior){
                    maior = matriz[l][c];
                    linha = l;
                    coluna = c;
                }
            }
        }
        
        System.out.println("O maior número é " + maior + " e está localizado em [" +linha + "][" + coluna + "]." );
    }
}
