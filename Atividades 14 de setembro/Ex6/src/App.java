import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    //Leia um programa que represente uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F = C*(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.

    Double C, F;
    String temperatura;

    temperatura = JOptionPane.showInputDialog(null, "Digite a temperatura: ", "Exercício 6", JOptionPane.INFORMATION_MESSAGE);
    C = Double.parseDouble(temperatura);
    F = C*(9.0/5.0)+32.0;
    JOptionPane.showMessageDialog(null, "A temperatura em Fahrenheit é " + F, "Exercício 6", JOptionPane.INFORMATION_MESSAGE);

    }
}
