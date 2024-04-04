package estrutura_de_dados.Aula3;

import java.util.Scanner;

public class Ex_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tam1, tam2;
        
        System.out.println("Informe o tamanho da primeira fila:");
        tam1 = sc.nextInt();
        
        System.out.println("\nInforme o tamanho da segunda fila:");
        tam2 = sc.nextInt();
        
        Fila f1 = new Fila(tam1);
        Fila f2 = new Fila(tam2);
        int num;
        int vetor1[] = new int[tam1];
        int vetor2[] = new int[tam2];
        
        for(int i =0; i < tam1; i++){
            System.out.println("\nInforme o " + (i +1)+"º elemento da fila 1:");
            num = sc.nextInt();
            f1.enfileirar(num);
        }
        
        for(int i =0; i < tam2; i++){
            System.out.println("\nInforme o " + (i +1)+"º elemento da fila 2:");
            num = sc.nextInt();
            f2.enfileirar(num);
        }
        
        if (vetor1.length > vetor2.length ){
            System.out.printf("\nA fila 1(%d elementos) apresenta mais elementos do que a fila 2 (%d elementos).", tam1, tam2);
        }
        else if (vetor1.length < vetor2.length){
            System.out.printf("\nA fila 2(%d elementos) apresenta mais elementos do que a fila 1(%d elementos).", tam2,tam1);
        }
        else{
            System.out.printf("\nAmbas as filas tem o mesmo número de elementos (%d elementos)", tam1);
        }
    }
}
