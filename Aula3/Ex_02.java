package estrutura_de_dados.Aula3;
import java.util.Scanner;


public class Ex_02 {
    public static void main(String[] args) {
        Verificacoes v = new Verificacoes();
        Scanner sc = new Scanner(System.in);
        Fila f = new Fila(5);
        int vetor[]= new int[5];
        
        for(int i=0; i < vetor.length; i++){
            System.out.println("Informe o número a ser adicionado na fila:");
            int num = sc.nextInt();
            f.enfileirar(num);
        }
        do{
            for (int i=0; i<5; i++){
                vetor[i] = Integer.parseInt(f.desenfileirar());
            }
        }while(f.vazia() == false);

     
        System.out.println("\nO maior número da fila é: " + v.maior(vetor) + "\nO menor número da fila é: " + v.menor(vetor) + "\nA média aritmética é: " + v.media(vetor));
    }
    
    
        

}
