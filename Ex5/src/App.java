import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    //Faça um programa que leia a cotação do dólar. Em seguida, imprima o valor correspondente em dólar.

    String cotacao, valor;
    Double dolar = 0.0d;
    Double real = 0.0d;
    Double resultado = 0.0d;

    cotacao = JOptionPane.showInputDialog(null, "Digite a cotação do dólar: ", "Exercício 5", JOptionPane.INFORMATION_MESSAGE);
    dolar   = Double.parseDouble(cotacao);
    valor   = JOptionPane.showInputDialog(null, "Digite o valor que deseja converter: ", "Exercício 5", JOptionPane.INFORMATION_MESSAGE);
    real    = Double.parseDouble(valor);
    resultado = real/dolar;
    JOptionPane.showMessageDialog(null, "Após a conversão você terá USD" + resultado, "Exercício 5", JOptionPane.INFORMATION_MESSAGE);

    }
}
