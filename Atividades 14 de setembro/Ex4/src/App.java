import javax.management.modelmbean.InvalidTargetObjectTypeException;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class App {
    public static void main(String[] args) throws Exception {
    //leia uma velocidade em km/h (quilômetros por hora) e apresente convertida em m/s (metros por segundo). A fórmula de conversão é M = K/36, sendo K a velocidade em km/h e M em m/s.*/

    double k2;
    String k;

    k = JOptionPane.showInputDialog(null, "Digite a velocidade em K/h", "Exercício 4", JOptionPane.INFORMATION_MESSAGE);
    k2 = Float.parseFloat(k);

    JOptionPane.showMessageDialog(null, "A velocidade em m/s é: " + (k2/3.6), "Exercício 4", JOptionPane.INFORMATION_MESSAGE);

    }
}
