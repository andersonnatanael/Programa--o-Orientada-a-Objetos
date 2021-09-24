import javax.swing.JOptionPane;

public class App {
    /* Faça um programa que receba a altura e o sexo de uma pessoa e calcule e
     * mostre seu peso ideal, utilizando as seguintes fórmulas(em que “h”
     * corresponde à altura): Homens: (72,2*h)-58 Mulheres (62,1*h)-44,7
     */

    public static void main(String[] args) throws Exception {
        
        String altura, sexo;
        double h;

        sexo   = JOptionPane.showInputDialog(null, "Digite o sexo, FEMININO ou MASCULINO: ", "Exercício 15", JOptionPane.INFORMATION_MESSAGE);
        altura = JOptionPane.showInputDialog(null, "Digite a altura: ");
        h = Float.parseFloat(altura);

        switch (sexo){
            case "FEMININO":
                JOptionPane.showMessageDialog(null, "O peso ideal é " + (72.2 * h - 44.7), "Exercício 15", JOptionPane.INFORMATION_MESSAGE);
            break;
            case "MASCULINO":
                JOptionPane.showMessageDialog(null, "O peso ideal é" + (62.1 * h - 58), "Exercício 15", JOptionPane.INFORMATION_MESSAGE);
            break;
        }

    }
}
