import java.util.Scanner;

public class ex04 {
    // Faça um programa que determine e mostre os cinco primeiro múltiplos de e
    // considerando números maiores que 0.
    public static void main(String[] args) throws Exception {

        int num = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro maior que 0: ");
        num = leitor.nextInt();
        System.out.println("Tabuada:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i + " * " + num + " = " + (i * num));
        }

    }
}
