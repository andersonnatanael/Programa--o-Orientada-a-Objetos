import java.util.Scanner;

public class ex11 {
    // Escreva um programa que leia um número inteiro, maior ou igual a zero, do
    // usuário. Imprima o enésimo termo da sequência de Fibonacci. Essa sequência
    // começa no termo de ordem zero, e, a partir do segundo termo, seu valor é dado
    // pela soma dos dois termos anteriores. Alguns termos dessa sequência são: 0, 1
    // ,1 , 2, 3, 5, 8, 13, 21, 34.
    public static void main(String[] args) throws Exception {

        Scanner leitor = new Scanner(System.in);
        int valor;
        int inicio = 0;
        int sequen = 1;
        int result;

        System.out.println("Digite um número maior ou igual a 0: ");
        valor = leitor.nextInt();

        if (valor < 1) {
            System.out.println("O valor digitado é inválido!\nFim da execução.");
        } else if (valor == 1) {
            System.out.println("Número da sequencia:\n0");
        } else if (valor == 2) {
            System.out.println("Números da sequencia:\n0\n1");
        } else {
            System.out.println("Números da sequencia:\n0\n1");
            for (int i = 2; i != valor; i++) {
                result = inicio + sequen;
                inicio = sequen;
                sequen = result;
                System.out.println(result);
            }
        }
        System.out.println("Fim da execução.");

    }
}
