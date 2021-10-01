//import java.util.Scanner;

import javax.swing.JOptionPane;

public class ex01 {
    //1.Faça um programa que leia um número inteiro positivo N e imprima todos os números naturais de 0 até N em ordem crescente.
    public static void main(String[] args) throws Exception {
        //Cola:
        //while (condição) {}
        //do {} while (condição);
        //for (valorInicial; condição; passo) {}
        /*String valor;
        int numero;

        Scanner texto = new Scanner(System.in);
        System.out.println("Digite um número positivo maior que zero: ");
        valor = texto.nextLine();
        numero = Integer.parseInt(valor);

        for (int i = 0; i <= numero; i++){
            System.out.println(i);
        }*/

        String valor;
        int numero;

        valor = JOptionPane.showInputDialog(null, "Digite um número positivo maior que zero: ", "Exercício 1", JOptionPane.INFORMATION_MESSAGE);
        numero = Integer.parseInt(valor);

        for (int n = 0; n <= numero; n++) {
            JOptionPane.showMessageDialog(null, n, "Exercício 1", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
