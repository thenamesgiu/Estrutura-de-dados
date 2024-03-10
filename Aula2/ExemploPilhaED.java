/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estrutura_de_dados.Aula2;

import javax.swing.JOptionPane;

/**
 *
 * @author bruno
 */
public class ExemploPilhaED {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pilha p = new Pilha(5); //Criando a Pilha com 5 elementos
        int op=0;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Empilhar um elemento\n" +
                    "2 - Remover um elemento\n" +
                    "3 - Exibir os valores existentes\n" + 
                    "4 - Sair\n" + 
                    "Digite a opção desejada:"
            ));
            switch(op){
                case 1:
                    p.empilhar(JOptionPane.showInputDialog
                            ("Insira o valor a ser empilhado:"));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,
                            p.desempilhar());
                    break;
                case 3:
                    p.ExibePilha();
                    break;
                case 4:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, 
                            "Comando inválido!");
                    break;
            }
        } while(op!=4);
    }
    
}
