
public class Exercicio7 {

    public static void main(String[] args){
       // Escrever um programa que calcule e apresente o somatório do número de grãos
      //  de trigo que se pode obter em um tabuleiro de xadrez, obedecendo à seguinte
       // regra: colocar um grão de trigo no primeiro quadro, e nos quadros seguintes, o
       // dobro do quadro anterior. Ou seja, no primeiro quadro coloca-se um grão, no
        //segundo quadro colocam-se dois grãos (neste momento têm-se três grãos), no
      //  terceiro quadro colocam-se quatro grãos (tendo neste momento sete grãos), no
        //quarto quadro colocam-se oito grãos (tendo-se, então, 15 grãos), até atingir o
       // sexagésimo quarto.

        int houses = 64;
        long numeroGraos = 1;
        long somaGraos = 0;

        for (int i = 1; i <= houses; i++) {
            somaGraos += numeroGraos;
            numeroGraos *= 2;
            System.out.println("---------");
            System.out.println("Número da casa: "+ i + "\nQuantidade de grãos: " + somaGraos);
        }

    }
}
