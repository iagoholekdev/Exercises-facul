import java.util.Scanner;
public class Exercicio10 {
    public static void main(String[] args) {
       // Escrever um programa que possibilite calcular a área total em metros de uma
        //residência com os cômodos sala, cozinha, banheiro, dois quartos, área de serviço,
        //quintal, garagem, entre outros que podem ser fornecidos ao programa. O
       // programa deve solicitar a entrada do nome, da largura e do comprimento de um
       // determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e
       // também uma mensagem solicitando ao usuário a confirmação de continuar
       // calculando novos cômodos. Caso o usuário responda “NÃO”, o programa deve
       // apresentar o valor total acumulado da área residencial
        Scanner input = new Scanner(System.in);
        String continuar = "SIM";
        double areaTotal = 0;

        while (continuar.equalsIgnoreCase("SIM")) {
            System.out.print("Informe o nome do cômodo: ");
            String nomeComodo = input.nextLine();

            System.out.print("Informe a largura do cômodo em metros: ");
            double largura = input.nextDouble();

            System.out.print("Informe o comprimento do cômodo em metros: ");
            double comprimento = input.nextDouble();
            input.nextLine();

            double areaComodo = largura * comprimento;
            areaTotal += areaComodo;

            System.out.printf("Área do cômodo %s: %.2f metros quadrados.%n", nomeComodo, areaComodo);

            System.out.print("Deseja calcular a área de mais um cômodo? (SIM/NÃO): ");
            continuar = input.nextLine();
        }

        System.out.printf("Área total da residência: %.2f metros quadrados.%n", areaTotal);

        input.close();
    }

}
