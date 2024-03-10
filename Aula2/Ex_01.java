package estrutura_de_dados.Aula2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha p = new Pilha(5);
 
        for(int i=0; i < 5; i++){
            System.out.println("Informe o número a ser empilhado");
            int num = sc.nextInt();
            p.empilhar(num);
            
            if(num == 0){
                break;
            }
        }
        
        System.out.println("\nExibindo os elementos na ordem em que foram removidos da pilah:\n");
        do{
            System.out.println(p.desempilhar());
        }while(p.vazia() == false);
    }
}
