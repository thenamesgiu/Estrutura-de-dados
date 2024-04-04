package estrutura_de_dados.Aula3;
import java.util.Scanner;

public class Ex_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        Fila f = new Fila(5);
        
        for(int i=0; i < 5; i++){
            System.out.println("Informe o número a ser adicionado na fila:");
            int num = sc.nextInt();
            f.enfileirar(num);
            if(num == 0){
                break;
            }
        }
        System.out.println("\nExibindo os elementos na ordem em que foram removidos da fila:\n");
        do{
        System.out.println(f.desenfileirar());
        }while(f.vazia() == false);
    }
}
