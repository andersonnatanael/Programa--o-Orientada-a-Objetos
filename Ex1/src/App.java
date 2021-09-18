import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        int val1 = 0;
        int val2 = 0;
        int numero = 0;
        String pergunta;
        
        pergunta = JOptionPane.showInputDialog(null, "Digite um número: ", "Exercício 1", JOptionPane.INFORMATION_MESSAGE);
        numero = Integer.parseInt(pergunta);

        val1 = numero - 1;
        val2 = numero + 1;
        JOptionPane.showMessageDialog(null, "Antecessor: " + val1 + "\n" + "Sucessor: " + val2, "Exercício 1", JOptionPane.INFORMATION_MESSAGE);

    }
}
