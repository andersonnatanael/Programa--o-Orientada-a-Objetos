import javax.swing.JOptionPane;

public class ex08 {
    // Faça um algoritmo que leia um número positivo e imprima seus divisores.
    // Exemplo: os divisores do número 66 são: 1, 2, 3, 6, 11, 22, 33 e 66.
    public static void main(String[] args) throws Exception {

        String valor;
        int num;

        valor = JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Exercício 8",
                JOptionPane.INFORMATION_MESSAGE);
        num = Integer.parseInt(valor);
        
        for (int i = 1; i <= num; i++) {
            
            if (num % i == 0) {
                JOptionPane.showMessageDialog(null, num + " é divizivel por " + i, "Exercício 8", JOptionPane.INFORMATION_MESSAGE);
            }

        }

    }

}
