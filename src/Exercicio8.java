
import java.util.Scanner;
public class Exercicio8 {
    public static void main (String[] args) {
        //Elaborar um programa que leia sucessivamente valores numéricos e apresente no
        //final o somatório, a média e o total de valores lidos. O programa deve ler os
       // valores enquanto o usuário estiver fornecendo valores positivos. Ou seja, o
       // programa deve parar quando o usuário fornecer um valor negativo (menor que
       // zero)
        Scanner input = new Scanner(System.in);

        int num, soma = 0, total = 0;

        do {
            System.out.print("Digite um número positivo (ou negativo para encerrar): ");
            num = input.nextInt();

            if (num >= 0) {
                soma += num;
                total++;
            }
        } while (num >= 0);

        if (total > 0) {
            double media = (double) soma / total;
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média dos valores: " + media);
            System.out.println("Total de valores lidos: " + total);
        } else {
            System.out.println("Nenhum valor foi fornecido.");
        }

        input.close();
    }

}
