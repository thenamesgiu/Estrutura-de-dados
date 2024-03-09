package estrutura_de_dados;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex_02 {
    public static void main(String[] args) {
        String[] v1 = {"11", "13", "45", "7"};
        String[] v2 = {"24", "4", "16", "81", "10", "12"};
        
        List<String> vetor1 = new ArrayList<>(Arrays.asList(v1));
        List<String> vetor2 = new ArrayList<>(Arrays.asList(v2));

        vetor1.addAll(vetor2);

        String[] uniao = vetor1.toArray(new String[0]);

        System.out.println(Arrays.toString(uniao));
    }
}
