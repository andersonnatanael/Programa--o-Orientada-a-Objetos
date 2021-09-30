import javax.swing.JOptionPane;

public class App {
    /*Faça um programa que leia a altura e o peso de uma pessoa. De acordo com a tabela a seguir, verifique e mostre qual a classificação dessa pessoa.
    |                                |                       Peso                     |
    | Altura                         | peso <= 60 |peso > 60 && peso <= 90| peso > 90 |
    | altura < 1.2                   |     A      |           D           |     G     |
    | altura >= 1.2 && altura <= 1.7 |     B      |           E           |     H     |
    | altura > 1.7                   |     C      |           F           |     I     |*/
    public static void main(String[] args) throws Exception {
        
        String valor1, valor2;
        Float altura, peso;

        valor1 = JOptionPane.showInputDialog(null, "Digite a altura: ", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        valor2 = JOptionPane.showInputDialog(null, "Digite o peso: ", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        altura = Float.parseFloat(valor1);
        peso = Float.parseFloat(valor2);

        if (altura < 1.2 && peso <= 60){
            JOptionPane.showMessageDialog(null, "Classificação A", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura >= 1.2 && altura <= 1.7 && peso <= 60){
            JOptionPane.showMessageDialog(null, "Classificação B", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura > 1.7 && peso <= 60){
            JOptionPane.showMessageDialog(null, "Classificação C", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura < 1.2 && peso > 60 && peso <= 90){
            JOptionPane.showMessageDialog(null, "Classificação D", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura >= 1.2 && altura <= 1.7 && peso > 60 && peso <= 90){
            JOptionPane.showMessageDialog(null, "Classificação E", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura > 1.7 && peso > 60 && peso <= 90){
            JOptionPane.showMessageDialog(null, "Classificação F", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura < 1.2 && peso > 90){
            JOptionPane.showMessageDialog(null, "Classificação G", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura >= 1.2 && altura <= 1.7 && peso > 90){
            JOptionPane.showMessageDialog(null, "Classificação H", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        } else if (altura > 1.7 && peso > 90){
            JOptionPane.showMessageDialog(null, "Classificação I", "Exercício 18", JOptionPane.INFORMATION_MESSAGE);
        }

    }
    
}