import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*Faça um programa calculadoras com as seguintes operações:
            somar
            subtrair
            multiplicar
            dividir*/
        
        String escolha, a, b;
        Double a1, b1;
        Integer valor;

        escolha = JOptionPane.showInputDialog(null, "Digite sua opção: " + "\n" + "1 - Soma" + "\n" + "2 - Subtrair" + "\n" + "3 - Multiplicar" + "\n" + "4 - Dividir", "Exercício 10", JOptionPane.INFORMATION_MESSAGE);
        valor = Integer.parseInt(escolha);
        a = JOptionPane.showInputDialog(null, "Digite o valor de A: ", "Exercício 10", JOptionPane.INFORMATION_MESSAGE);
        a1 = Double.parseDouble(a);
        b = JOptionPane.showInputDialog(null, "Digite o valor de B: ", "Exercício 10", JOptionPane.INFORMATION_MESSAGE);
        b1 = Double.parseDouble(b);
        
        switch (valor){
            case 1:
                JOptionPane.showMessageDialog(null, "A soma entre A e B é " + (a1 + b1), "Exercício 10", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 2:
            JOptionPane.showMessageDialog(null, "A subtração de A por B é " + (a1 - b1), "Exercício 10", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 3:
            JOptionPane.showMessageDialog(null, "A muitiplicação entre A e B é " + (a1 * b1), "Exercício 10", JOptionPane.INFORMATION_MESSAGE);
            break;

            case 4:
            JOptionPane.showMessageDialog(null, "A divisão de A por B é " + (a1 / b1), "Exercício 10", JOptionPane.INFORMATION_MESSAGE);
            break;
        }
        
    }
}
