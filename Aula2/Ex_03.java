package estrutura_de_dados.Aula2;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        
        for(int i=0; i < 5; i++){
            System.out.println("Informe o " + (i +1) + "º número a ser empilhado");
            int num = sc.nextInt();
            p.empilhar(num);
        }
        
        for (int i = 0; i <= p.topo; i++) {
            if (p.vetor[i] instanceof Integer && (int) p.vetor[i] % 2 == 0) {
                count++;
            }
        }
        
        System.out.println("\nVeja os elementos empilhados:");
        p.ExibePilha();
        System.out.println("\nA pilha que você montou contém o total de: " + count + " elementos pares.");
    }
}
