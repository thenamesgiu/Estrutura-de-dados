/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estruturadedados7;

/**
 *
 * @author bruno
 */
public class Fila {

    int tamanho;
    int inicio;
    int fim;
    int total;
    Tarefa vetor[];

    public Fila(int tam) {
        inicio = 0;
        fim = 0;
        total = 0;
        tamanho = tam;
        vetor = new Tarefa[tam];
    }

    public boolean vazia() {
        if (total == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cheia() {
        if (total >= tamanho) {
            return true;
        } else {
            return false;
        }
    }

    public void enfileirar(Tarefa elem) {
        if (!cheia()) {
            vetor[fim] = elem;
            fim++;
            total++;
            if (fim >= tamanho) {
                fim = 0;
            }
        } else {
            System.out.println("Fila Cheia");
        }
    }

    // ac1 parte 2, alterei este metodo para retornar o elemento e nao o elemento convertido para string
    public Tarefa desenfileirar() {
        Tarefa elem;
        if (vazia() == false) {
            elem = vetor[inicio];
            inicio++;
            if (inicio >= tamanho) {
                inicio = 0;
            }
            total--;
        } else {
            elem = null;
        }
        return elem;
    }

    public void exibeFila() {
        for (int i = 0; i < total; i++) {
            System.out.println("posicao " + i + " valor " + vetor[i]);
        }
    }
}
