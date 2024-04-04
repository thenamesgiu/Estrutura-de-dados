package estrutura_de_dados.Aula3;

public class Verificacoes {
    
    
    Verificacoes(){
        
    }
    
    public int maior(int[] vetor){
        int maior = vetor[0];
            for(int i=0; i< vetor.length; i++){
                if(vetor[i] > maior){
                    maior = vetor[i];
                }
            }
        return maior;
    }
    
    public int menor(int[] vetor){
        int menor = vetor[0];
            for(int i=0; i< vetor.length; i++){
                if(vetor[i] < menor){
                    menor = vetor[i];
                }
            }
        return menor;
    }
    
    public int media(int[] vetor){
        int media = 0;
        int soma = 0;
            for(int i=0; i< vetor.length; i++){
                soma += vetor[i];
                
            }
            
        media = soma/vetor.length;
        return media;
    }
}
