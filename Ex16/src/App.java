import javax.swing.JOptionPane;

public class App {
    /*
     * Uma empresa vende o mesmo produto para quatro diferentes estados. Cada estado
     * possui uma taxa diferente de imposto sobre o produto. Faça um programa em que
     * o usuário entre com o valor e o estado de destino do produto e programa
     * retorne o preço final do produto acrescido do imposto do estado em que ele
     * será vendido. Se o estado digitado não for válido, mostrará uma mensagem de
     * erro. Estado MG SP RJ MS Imposto 7% 12% 15% 8%
     */
    public static void main(String[] args) throws Exception {

        String valor1, estado1;
        int estado = 0;
        double valor;
        double MG = 0.07;
        double SP = 0.12;
        double RJ = 0.15;
        double MS = 0.08;

        estado1 = JOptionPane.showInputDialog(null, "Digite o estado escolhido \n (1 - MG, 2 - SP, 3 - RJ ou 4 - MS): ", "Exercício 16", JOptionPane.INFORMATION_MESSAGE);
        estado = Integer.parseInt(estado1)
        valor1 = JOptionPane.showInputDialog(null, "Digite o valor: ", "Exercício 16", JOptionPane.INFORMATION_MESSAGE);
        valor = Double.parseDouble(valor1);

        switch (estado) {
            case 1:
                JOptionPane.showMessageDialog(null, "O preço final do produto acrescido dos impostos no estádo de Minas Gerais é de " + (valor += valor * MG), "Exercício 16", JOptionPane.INFORMATION_MESSAGE);
            break;
            case 2:
                JOptionPane.showMessageDialog(null, "O preço final do produto acrescido dos impostos no estádo de São Paulo é de " + (valor += valor * SP), "Exercício 16", JOptionPane.INFORMATION_MESSAGE);
            break;
            case 3:
                JOptionPane.showMessageDialog(null, "O preço final do produto acrescido dos impostos no estádo do Rio de Janeiro é de " + (valor += valor * RJ), "Exercício 16", JOptionPane.INFORMATION_MESSAGE);
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "O preço final do produto acrescido dos impostos no estádo do Mato Grosso do Sul é de " + (valor += valor * MS), "Exercício 16", JOptionPane.INFORMATION_MESSAGE);
            break;
            default:
            JOptionPane.showMessageDialog(null, "Estado inválido", "Exercício 16", JOptionPane.INFORMATION_MESSAGE);
        } 

    }
}
