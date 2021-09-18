import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Sejam a e b os catetos de um triângulo cuja hipotenusa h é obtida pela
        // equação: h = raiz quadrada de a2 + b2

        String valor1, valor2;
        Double a, b, h;

        valor1 = JOptionPane.showInputDialog(null, "Digite o valor de A: ", "Exercício 9", JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(valor1);
        valor2 = JOptionPane.showInputDialog(null, "Digite o valor de B: ", "Exercício 9", JOptionPane.INFORMATION_MESSAGE);
        b = Double.parseDouble(valor2);
        h = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        JOptionPane.showMessageDialog(null, "O valor da hipotenusa é: " + h, "Exercício 9", JOptionPane.INFORMATION_MESSAGE);

    }
}
