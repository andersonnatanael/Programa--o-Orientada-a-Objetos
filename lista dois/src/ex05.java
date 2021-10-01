import javax.swing.JOptionPane;

public class ex05 {
    // Faça um programa que calcule e mostre a soma dos 50 primeiros números pares.
    public static void main(String[] args) throws Exception {

        int soma = 0;

        JOptionPane.showMessageDialog(null, "Calculando...", "Exercício 5", JOptionPane.INFORMATION_MESSAGE);

        for (int n = 0; n <= 50; n++) {
            if (n % 2 == 0) {
                soma += n;
            }
        }

        JOptionPane.showMessageDialog(null, "A soma entre os números pares de 0 a 50 é: " + soma, "Exercício 5", JOptionPane.INFORMATION_MESSAGE);

    }
}
