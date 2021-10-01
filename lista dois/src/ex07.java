import javax.swing.JOptionPane;

public class ex07 {
    // 7.Elabore um programa que peça ao usuário para digitar 10 valores. Some esses
    // valores e apresente o resultado na tela.
    public static void main(String[] args) throws Exception {

        String valor;
        Double soma = 0.0;
        Double num;

        JOptionPane.showMessageDialog(null, "Soma de 10 valores", "Exercício 7", JOptionPane.INFORMATION_MESSAGE);

        for(int i = 1; i <= 10; i++){
            valor = JOptionPane.showInputDialog(null, "Digite um valor: ", "Exercício 7", JOptionPane.INFORMATION_MESSAGE);
            num = Double.parseDouble(valor);
            soma += num;
        }

        JOptionPane.showMessageDialog(null, "A soma dos valores digitados é " + soma, "Exercício 7", JOptionPane.INFORMATION_MESSAGE);

    }
}
