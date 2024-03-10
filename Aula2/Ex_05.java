package estrutura_de_dados.Aula2;

import java.util.Scanner;

public class Ex_05 {
    public static void main(String[] args) {
        Pilha p = new Pilha(5);
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < 5; i++){
            System.out.println("Informe a url a ser acessada:");
            String url = sc.nextLine();
            p.empilhar(url);
        }
        System.out.println("\n");
        p.PilhaInverso();
        
        
        
    }
}
