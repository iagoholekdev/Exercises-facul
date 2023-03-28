import java.util.HashMap;
import java.util.Map;
public class Exercicio6 {

    static double convertCelsiusToFahrenheit(int number) {
        final double calculus = 1.8;
        final int sumNumber   = 32;
        return (number * calculus) + sumNumber;
    }
    public static void main(String[] args){
       // . Elaborar um programa que apresente os valores de conversão de graus Celsius
        //em graus Fahrenheit, de dez em dez graus, iniciando a contagem em dez graus
      //  Celsius e finalizando em cem graus Celsius. O programa deve apresentar os
       // valores das duas temperaturas. Para converter grau Celsius para Fahrenheit, basta
       // multiplicar a temperatura em graus Celsius por 1,8 e somar 32
        final int lastCount = 100;
        final int plusTen   = 10;
        Map<String,Integer> celsius   = new HashMap<>();
        Map<String,Double> Fahrenheit = new HashMap<>();
        for (int count = 10; count <= lastCount; count+=plusTen) {
          celsius.put("Celsius: ", count);
          System.out.println(celsius);
          Fahrenheit.put("Fahrenheit: ", Exercicio6.convertCelsiusToFahrenheit(count));
          System.out.println(Fahrenheit);
        }
    }
}
