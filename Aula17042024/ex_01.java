/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrutura_de_dados.Aula17042024;
import javax.swing.JOptionPane;
/**
 *
 * @author anagi
 */
public class ex_01 {

    /*1. Crie um programa que possua um menu de interação com o usuário que possibilite ele 
    adicionar elementos (valores inteiros) em uma fila, pilha ou lista duplamente encadeada. 
    Após inserir os valores, exiba os elementos existentes na estrutura que foi escolhida para inserção.
     */
    public static void main(String[] args) {
       int opc;
       Pilha p = new Pilha(10);
       Fila f = new Fila(10);
       ListaDupla l = new ListaDupla();
       IntNoDuplo noAtual = l.primeiro;
       String mostrarFila = "";
       String mostrarPilha = "";
       String mostrarLista = "";
       
       do{
           opc = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar valor em uma fila\n"
                    + "2 - Adicionar valor em uma pilha\n"
                    + "3 - Adicionar valor em uma lista duplamente encadeada\n"
                    + "4 - Sair\n"
                    + "Insira a opção desejada:"));
           
           switch(opc){
                  case 1:
                    int numF = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
                    f.enfileirar(numF);
                    
                    Fila intermed = new Fila(10);
                    
                    do {
                        String intermedValor = f.desenfileirar();
                        mostrarFila += intermedValor + "\n";
                        intermed.enfileirar(Integer.parseInt(intermedValor));
                    }while(f.vazia()==false);

                    JOptionPane.showMessageDialog(null, mostrarFila);
                    break;
                  case 2:
                      int numP = Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:"));
                      p.empilhar(numP);
                      
                      Pilha intermedP = new Pilha(10);
                      
                    do{
                        intermedP.empilhar(Integer.parseInt(p.desempilhar()));
                    }while(p.vazia()==false) ;

                    do{
                        String intermedPvalor = intermedP.desempilhar();
                        mostrarPilha += intermedPvalor + "\n";
                        p.empilhar(Integer.parseInt(intermedPvalor));
                    }while(intermedP.vazia() == false);

                    JOptionPane.showMessageDialog(null, mostrarPilha);
                    break;
                  case 3:
                        IntNoDuplo numL = new IntNoDuplo(Integer.parseInt(JOptionPane.showInputDialog("Informe um valor:")));
                        l.insereNo(numL);

                        while(true){
                            mostrarLista += String.valueOf(noAtual.valor) + "\n";
                            if (noAtual.prox == null) {
                                break;
                            }
                            noAtual = noAtual.prox;
                        }

                        JOptionPane.showMessageDialog(null, mostrarLista);
                        break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Informe uma opção válida");
                    break;
                      
                      
                      
           }
       }while(opc!=4);
    }
    
}
