package estrutura_de_dados.Aula2;

import javax.swing.JOptionPane;

public class Pilha {
    //Declarando os atributos da classe
    int topo;
    int tamanho;
    Object vetor[];
    
    Pilha(int tam){
        topo = -1; //Marca que a pilha está vazia
        tamanho = tam;
        vetor = new Object[tam];
    }
    public boolean vazia(){
        if (topo == -1)
            return true;
        else
            return false;
    }
    public boolean cheia(){
        if(topo == tamanho -1)
            return true;
        else
            return false;
    }
    public void empilhar(Object elem){
        if (cheia() == false){
            topo++;
            vetor[topo]=elem;
        }
        else{
            JOptionPane.showMessageDialog(null, 
                    "PILHA CHEIA!");
        }
    }
    public Object desempilhar(){
        Object valorDesempilhado;
        if(vazia() == true){
            valorDesempilhado = "Pilha Vazia";
        }
        else{
            valorDesempilhado = vetor[topo]; 
            topo--;
        }
        return valorDesempilhado;
    }
    public void ExibePilha(){
        if(vazia() == true){
            JOptionPane.showMessageDialog(null, 
                    "PILHA VAZIA!");
        }
        else{
            for(int i=topo; i>=0; i--){
                System.out.println("Elemento " 
                        + vetor[i] + " - posição " + i);
            }
        }
    }
    
    public boolean contem(Object elem) {
        for (int i = 0; i <= topo; i++) {
            if (vetor[i].equals(elem)) {
                return true;
            }
        }
        return false;
    }
    
    public void PilhaInverso(){
        if(vazia() == true){
            JOptionPane.showMessageDialog(null, 
                    "PILHA VAZIA!");
        }
        else{
            for(int i=0; i<= topo; i++){
                System.out.println(vetor[i]);
            }
        }
    }
}