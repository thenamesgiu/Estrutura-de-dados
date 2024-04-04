package estruturadedados7;

import javax.swing.JOptionPane;

public class ListaEncadeada {

    TarefaNoSimples primeiro;
    TarefaNoSimples ultimo;
    int numero_nos = 0;

    ListaEncadeada() {
        primeiro = ultimo = null;
    }

    void insereNo_fim(TarefaNoSimples novoNo) {
        novoNo.prox = null;
        if (primeiro == null) {
            primeiro = novoNo;
        }
        if (ultimo != null) {
            ultimo.prox = novoNo;
        }
        ultimo = novoNo;
        numero_nos++;
    }

    void insereNo_inicio(TarefaNoSimples novoNo) {
        novoNo.prox = primeiro;
        if (primeiro == null && ultimo == null) //Só tem um elemento na lista
        {
            ultimo = novoNo;
        }
        primeiro = novoNo;
        numero_nos++;
    }

    int ContarNos() {
        int tamanho = 0;
        TarefaNoSimples temp_no = primeiro;
        while (temp_no != null) {
            tamanho++;
            temp_no = temp_no.prox;
        }
        return tamanho;
    }

    void insereNo_posicao(TarefaNoSimples novoNo, int posicao) {
        TarefaNoSimples temp_no = primeiro;
        int numero_nos = ContarNos();
        int pos_aux;
        if (posicao == 0) {
            novoNo.prox = primeiro;
            if (primeiro == ultimo) {
                ultimo = novoNo;
            }
            primeiro = novoNo;
        } else {
            if (posicao <= numero_nos) {
                pos_aux = 1;
                while (temp_no != null && posicao > pos_aux) {
                    temp_no = temp_no.prox;
                    pos_aux++;
                }
                novoNo.prox = temp_no.prox;
                temp_no.prox = novoNo;
            } else {
                if (posicao > numero_nos) {
                    ultimo.prox = novoNo;
                    ultimo = novoNo;
                }
            }
        }
    }

    TarefaNoSimples buscaNo(Tarefa buscaValor) {
        int i = 0;
        TarefaNoSimples temp_no = primeiro;
        while (temp_no != null) {
            if (temp_no.valor.equals(buscaValor)) {
                JOptionPane.showMessageDialog(null, "No " + temp_no.valor + " posição " + i);
                return temp_no;
            }
            i++;
            temp_no = temp_no.prox;
        }
        return null;
    }

    void excluiNo(Tarefa valor) {
        TarefaNoSimples temp_no = primeiro;
        TarefaNoSimples anterior_no = null;
        while (temp_no != null && !temp_no.valor.equals(valor)) {
            anterior_no = temp_no;
            temp_no = temp_no.prox;
        }
        if (temp_no.equals(primeiro)) {
            if (temp_no.prox != null) {
                primeiro = temp_no.prox;
            } else {
                primeiro = null;
            }
        } else {
            anterior_no.prox = temp_no.prox;
        }

        if (ultimo.equals(temp_no)) {
            ultimo = anterior_no;
        }
    }

    void exibeLista() {
        TarefaNoSimples temp_no = primeiro;
        int i = 0;
        while (temp_no != null) {
            System.out.println("Saida - Valor" + temp_no.valor + " posição " + i);
            temp_no = temp_no.prox;
            i++;
        }
    }
}
