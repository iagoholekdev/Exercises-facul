public class Exercicio2 {
    public static void main(String[] args) {
      //  Utilizando (DoWhie), elaborar um programa que apresente o somatório dos
    //    valores pares existentes na faixa de 1 até 500.
        int firstNum = 1;
        int numberSum = 0;
        final int lastNum  = 500;
        do {
            if (firstNum % 2 == 0) {
                numberSum += firstNum;
            }
            firstNum++;
        } while(firstNum <= lastNum);
        System.out.println(numberSum);
    }
}
