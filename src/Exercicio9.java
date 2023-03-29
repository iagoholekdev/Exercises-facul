import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
       // Elaborar um programa que leia valores positivos inteiros até que um valor
        //negativo seja informado. Ao final devem ser apresentados o maior e o menor
       // valores informados pelo usuário.
        Scanner input = new Scanner(System.in);
        int valor, maiorValor = Integer.MIN_VALUE, menorValor = Integer.MAX_VALUE;

        do {
            System.out.print("Informe um valor inteiro positivo (ou negativo para sair): ");
            valor = input.nextInt();

            if (valor >= 0) {
                if (valor > maiorValor) {
                    maiorValor = valor;
                }

                if (valor < menorValor) {
                    menorValor = valor;
                }
            }
        } while (valor >= 0);

        if (maiorValor != Integer.MIN_VALUE) {
            System.out.println("Maior valor informado: " + maiorValor);
        }

        if (menorValor != Integer.MAX_VALUE) {
            System.out.println("Menor valor informado: " + menorValor);
        }

        input.close();
    }
}
