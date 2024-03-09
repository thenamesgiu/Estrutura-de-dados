package estrutura_de_dados;
import java.util.Scanner;

public class Ex_05 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n,m;
        System.out.println("Informe a quantidade de linhas");
        n = sc.nextInt();
        
        System.out.println("Informe a quantidade de colunas");
        m = sc.nextInt();
        
        int matriz[][] = new int[n][m];
        boolean diagonal = true;
        
        for(int l=0; l < matriz.length; l++){
            for(int c=0; c <matriz[l].length; c++){
                System.out.println("Informe um número:");
                matriz[l][c] = sc.nextInt();
            }
        }
        
        for(int l=0; l < matriz.length; l++){
            for(int c=0; c <matriz[l].length; c++){
                if (l != c && matriz[l][c] != 0){
                    diagonal = false;
                }
                else{
                    diagonal = true;
                }
            }
            if (!diagonal){
                break;
            }
            
        }
        if (diagonal) {
            System.out.println("A matriz é uma matriz diagonal.");
        } 
        else {
            System.out.println("A matriz NÃO é uma matriz diagonal.");
        }
    }
    
    
}
