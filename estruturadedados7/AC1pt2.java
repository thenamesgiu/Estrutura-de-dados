//Ana Giulia Moreira de Lima - 234984
//Pedro Henrique da Silva Tejon - 235001
//Gabriella de Souza Amaral Ribeiro - 235298
//Giuliano Timpanari Prebelli Pires - 235409
//Bruno Machado de Araújo - 171470

package estruturadedados7;

import javax.swing.JOptionPane;

public class AC1pt2 {

    public static void main(String[] args) {
        Fila tarefasAndamento = new Fila(100);
        Pilha tarefasConcluidas = new Pilha(100);
        ListaEncadeada tarefas = new ListaEncadeada();
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(
                    "1 - Adicionar nova tarefa\n"
                    + "2 - Remover uma tarefa\n"
                    + "3 - Listar tarefas\n"
                    + "4 - Marcar uma tarefa como concluída\n"
                    + "5 - Sair\n"
                    + "Digite a opção desejada:"));

            switch (op) {
                case 1:
                    // input do usuário das propriedades da tarefa
                    String nomeTarefa = JOptionPane.showInputDialog(null, "Digite o nome da tarefa a ser inserida:");
                    String descricaoTarefa = JOptionPane.showInputDialog(null, "Digite a descrição da tarefa a ser inserida:");
                    int prioridadeTarefa = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a prioridade da tarefa a ser inserida (1 - alto, 2 - média, 3 - baixa):"));
                    if (prioridadeTarefa > 3 || prioridadeTarefa < 1) {
                        JOptionPane.showMessageDialog(null, "Prioridade inválida.");
                        break;
                    }
                    Tarefa tarefaAInserir = new Tarefa(nomeTarefa, descricaoTarefa, prioridadeTarefa);

                    // enfileiramento da tarefa na lista de tarefas em andamento
                    tarefasAndamento.enfileirar(tarefaAInserir);

                    // inserção na lista encadeada de todas as tarefas
                    TarefaNoSimples noTarefa = new TarefaNoSimples(tarefaAInserir);
                    tarefas.insereNo_fim(noTarefa);

                    break;
                case 2:
                    // definição de que tarefa o usuário quer remover
                    String nomeRemover = JOptionPane.showInputDialog(null, "Digite o nome da tarefa que deseja remover:");

                    // procura na lista o no contendo a tarefa com o nome igual ao inserido para excluí-lo usando tarefas.excluiNo()
                    TarefaNoSimples noAtual = tarefas.primeiro;
                    while (true) {
                        Tarefa tarefaAtual = noAtual.valor;
                        // se nome do no atual == nome, exclui
                        if (tarefaAtual.getNome().equals(nomeRemover)) {
                            JOptionPane.showMessageDialog(null, "Tarefa removida:\n%s".formatted(String.valueOf(tarefaAtual)));
                            tarefas.excluiNo(tarefaAtual);
                            break;
                            // se não, se tarefa tiver um próximo nó transformar ela no noAtual
                        } else if (noAtual.prox != null) {
                            noAtual = noAtual.prox;
                            // se não quebra o loop
                        } else {
                            JOptionPane.showMessageDialog(null, "Tarefa com esse nome não encontrada, certifique-se de que digitou o nome corretamente.");
                            break;
                        }
                    }

                    break;
                case 3:
                    // ao invés de fazer as 3 funções separadas:
                    // Listar todas as tarefas (somente por nome);
                    // Listar todas as tarefas (exibir o nome e a descrição);
                    // Listar todas as tarefas por prioridade;
                    // decidimos juntar essas três funções em uma única listagem customizada onde o usuário pode
                    // escolher se vai ver todas as tarefas ou filtrar por prioridade, e além disso ele pode escolher
                    // para essas listagens se ele quer exibir só o nome da tarefa ou nome e descrição
                    int optFiltro = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Listar todas as tarefas\n"
                            + "2 - Listar tarefas por prioridade\n"
                            + "Digite o nome da tarefa que deseja remover:"));
                    if (optFiltro != 1 && optFiltro != 2) {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                    }
                    int optExibicao = Integer.parseInt(JOptionPane.showInputDialog(null, "1 - Exibir somente por nome\n"
                            + "2 - Exibir o nome e a descrição\n"
                            + "Digite o nome da tarefa que deseja remover:"));
                    if (optExibicao != 1 && optExibicao != 2) {
                        JOptionPane.showMessageDialog(null, "Opção inválida.");
                        break;
                    }

                    if (tarefas.numero_nos > 0 && tarefas.primeiro != null) {
                        String resultadoListagem = "Tarefas presentes:\n";
                        TarefaNoSimples no = tarefas.primeiro;
                        if (optFiltro == 1) {
                            while (no != null) {
                                Tarefa tarefaAtual = no.valor;
                                if (optExibicao == 1) {
                                    resultadoListagem += tarefaAtual.nome + "\n";
                                } else if (optExibicao == 2) {
                                    resultadoListagem += "%s - %s\n".formatted(tarefaAtual.nome, tarefaAtual.descricao);
                                }
                                no = no.prox;
                            }
                        } else if (optFiltro == 2) {
                            int prioridadeDesejada = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a prioridade desejada (1 - alto, 2 - média, 3 - baixa):"));
                            while (no != null) {
                                Tarefa tarefaAtual = no.valor;
                                if (tarefaAtual.prioridade == prioridadeDesejada) {
                                    if (optExibicao == 1) {
                                        resultadoListagem += tarefaAtual.nome + "\n";
                                    } else if (optExibicao == 2) {
                                        resultadoListagem += "%s - %s\n".formatted(tarefaAtual.nome, tarefaAtual.descricao);
                                    }
                                }                               
                                no = no.prox;
                            }
                        }
                        if (!resultadoListagem.equals("Tarefas presentes:\n")) {
                            JOptionPane.showMessageDialog(null, resultadoListagem);
                        } else {
                            JOptionPane.showMessageDialog(null, "Nenhuma tarefa encontrada no gerenciador de tarefas com os filtros aplicados");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa registrada no gerenciador de tarefas");
                    }
                    break;
                case 4:
                    String nomeConcluir = JOptionPane.showInputDialog(null, "Digite o nome da tarefa que deseja marcar como concluída:");

                    Fila filaTemp = new Fila(100);
                    Tarefa tarefaConcluir = null;
                    while (!tarefasAndamento.vazia()) {
                        Tarefa tarefaAtual = tarefasAndamento.desenfileirar();

                        if (tarefaAtual.nome.equals(nomeConcluir)) {
                            tarefaConcluir = tarefaAtual;
                        } else {
                            filaTemp.enfileirar(tarefaAtual);
                        }
                    }

                    if (tarefaConcluir != null) {
                        tarefasConcluidas.empilhar(tarefaConcluir);
                        JOptionPane.showMessageDialog(null, "Tarefa marcada como concluída: %s".formatted(String.valueOf(tarefaConcluir)));
                    } else {
                        JOptionPane.showMessageDialog(null, "Nenhuma tarefa encontrada com este nome na fila de tarefas em andamento.");
                    }
                    tarefasAndamento = filaTemp;

                    break;
                case 5:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Comando inválido!");
                    break;
            }
        } while (op != 5);

    }
}
