import java.util.Scanner;

public class ex12 {
    // Elabore um programa que faça a leitura de vários números inteiros até que
    // se digite número negativo. O programa tem de retornar o maior e menor número
    // lido.
    public static void main(String[] args) throws Exception {

        int valor;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        valor = leitor.nextInt();
        int maior = valor;
        int menor = valor;

        do {
            System.out.println("Digite outro número: ");
            valor = leitor.nextInt();

            if (valor > maior) {
                maior = valor;
            }

            if (valor < menor) {
                menor = valor;
            }
        } while(valor >= 0);

        if (maior == valor) {
            System.out.println("Nenhum número válido inserido.\nFim da execução!");
        } else {
            System.out.println("O maior valor digitado foi " + maior + " e o menor " + menor + ".");
        }

    }

}
