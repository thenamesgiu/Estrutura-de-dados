package estrutura_de_dados.Aula2;

import java.util.Scanner;

public class Ex_02 {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        Scanner sc = new Scanner(System.in);
        
        for(int i =0; i < 5; i++){
            System.out.println("Informe a " + (i +1)+"ª placa de carro");
            String placa = sc.nextLine();
            p.empilhar(placa);
        }
        
        System.out.println("\nInforme uma placa para ser verificada:");
        String placaVerif = sc.nextLine();
        
        if (p.contem(placaVerif) == true){
            System.out.println("\nParece que esse carro está estacionado, para que ele saia é preciso que essa sequência de carros saia antes dele:");
            
            do{
                System.out.println(p.desempilhar());
            }while(p.vazia() == false && p.vetor[p.topo].equals(placaVerif) == false);

        }
        else{
            System.out.println("\nA placa informada não é de nenhum dos carros estacionados.");
        }
        
        
    }
}
