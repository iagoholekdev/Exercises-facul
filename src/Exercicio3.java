import java.util.HashMap;
import java.util.*;
import java.util.Map;

public class Exercicio3 {
    public static void main(String[] args){
        //Utilizando (For), construir um programa que apresente todos os valores numéricos
       // divisíveis por 4 e menores que 200
        final int lastNumber = 200;
        Map<String, List<Integer>> map = new HashMap<>();

        for(int i = 1; i <= lastNumber; i++) {
            if (i % 4 == 0) {
                map.put("Numero: ", new ArrayList<>(Arrays.asList(i)));
                System.out.println(map);
            }
        }

    }
}
