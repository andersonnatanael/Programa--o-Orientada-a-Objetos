import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    //Leia o valor do raio de um círculo. Calcule e imprima a área do círculo correspondente. A área do círculo é A = 𝛑*raio2.

    String valor;
    Double raio;
    valor = JOptionPane.showInputDialog(null, "Digite o valor do raio", "Exercício 8", JOptionPane.INFORMATION_MESSAGE);
    raio = Double.parseDouble(valor);

    JOptionPane.showMessageDialog(null, "A área do círculo é: " + (Math.PI * Math.pow(raio, 2)), "Exercício 8", JOptionPane.INFORMATION_MESSAGE);

    }
}
