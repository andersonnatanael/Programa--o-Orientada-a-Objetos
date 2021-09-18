import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String n1, n2, n3;
        int v1, v2, v3;
        
        n1 = JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Exercício 2", JOptionPane.INFORMATION_MESSAGE);
        n2 = JOptionPane.showInputDialog(null, "Digite outro número inteiro: ", "Exercício 2", JOptionPane.INFORMATION_MESSAGE);
        n3 = JOptionPane.showInputDialog(null, "Digite mais um número inteiro: ", "Exercício 2", JOptionPane.INFORMATION_MESSAGE);

        v1 = Integer.parseInt(n1);
        v2 = Integer.parseInt(n2);
        v3 = Integer.parseInt(n3);

        JOptionPane.showMessageDialog(null, "A soma entre os três valore é: " + (v1 + v2 + v3), "Exercício 2", JOptionPane.INFORMATION_MESSAGE);
    }
}
