/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrutura_de_dados.Aula17042024;

/**
 *
 * @author bruno
 */
public class ListaDuplamenteEncadeada {

    public static void main(String[] args) {
        ListaDupla Slist = new ListaDupla();
        Slist.insereNo (new IntNoDuplo (1));
        Slist.insereNo (new IntNoDuplo (3));
        Slist.insereNo (new IntNoDuplo (5));
        Slist.insereNo (new IntNoDuplo (7));
        IntNoDuplo temp_no = Slist.primeiro;
        while (temp_no != null){
            System.out.println (temp_no.valor);
            temp_no = temp_no.prox;
        }
        Slist.incluiNo (new IntNoDuplo (2), 1);
        System.out.println ("Apos incluir o no 2...");
        temp_no = Slist.primeiro;
        while (temp_no != null){
            System.out.println (temp_no.valor);
            temp_no = temp_no.prox;
        }
        Slist.excluiNo (2);
        System.out.println ("Apos excluir o no 3...");
        temp_no = Slist.primeiro;
        while (temp_no != null){
            System.out.println (temp_no.valor);
            temp_no = temp_no.prox;
        }
    }
    
}
