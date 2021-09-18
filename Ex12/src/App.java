import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um programa que leia dois números e mostre qual deles é o maior.

        String a, b;
        int n1, n2;
        int maior;

        a = JOptionPane.showInputDialog(null, "Digite um número: ", "Exercício 11", JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null, "Digite outro número: ", "Exercício 11", JOptionPane.INFORMATION_MESSAGE);
        n1 = Integer.parseInt(a);
        n2 = Integer.parseInt(b);
        
        if (n1 == n2) {
            maior = n1;
            JOptionPane.showMessageDialog(null, "Os dois valores são iguais: " + maior, "Exercício 11", JOptionPane.INFORMATION_MESSAGE);
        } else if (n2 > n1) {
            maior = n2;
            JOptionPane.showMessageDialog(null, "O maior número é " + maior, "Exercício 11", JOptionPane.INFORMATION_MESSAGE);
        } else {
            maior = n1;
            JOptionPane.showMessageDialog(null, "O maior número é " + maior, "Exercício 11", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}