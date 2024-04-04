package estrutura_de_dados.Aula3;

import java.util.Scanner;

public class Ex_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila f = new Fila(100);
        int opc, processo;
        
        do{
            System.out.println("\n1 - Incluir novo processo na fila\n2- Retirar da fila o processo com maior tempo de espera\n3-Exibir fila\n4-Sair\nInforme uma opção:");
            opc = sc.nextInt();
            
            switch(opc){
                case 1: 
                    System.out.println("\nInforme um processo");
                    processo = sc.nextInt();
                    f.enfileirar(processo);
                    break;
                case 2:
                    System.out.println("\nProcesso retirado:"  + f.desenfileirar());
                    break;
                case 3:
                    System.out.println("\nVeja os processos em fila:\n");
                    f.exibeFila();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpção não existente.");
                    break;
            }
        }while (opc != 4);
    }
}
