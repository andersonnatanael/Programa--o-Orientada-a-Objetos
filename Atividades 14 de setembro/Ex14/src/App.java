import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*Faça um programa que leia um número e, caso ele seja positivo, calcule e
         * mostre: O número digitado ao quadrado; A raiz quadrada do número digitado.
         */

        String a;
        int valor;

        a = JOptionPane.showInputDialog(null, "Digite um número inteiro: ", "Exercício 14", JOptionPane.INFORMATION_MESSAGE);
        valor = Integer.parseInt(a);

        if(valor > 0){
            JOptionPane.showMessageDialog(null, valor + " ao quadrado é " + Math.pow(valor, 2) + " e \n" + "a raiz quatrada de " + valor + " é igual a " + Math.sqrt(valor), "Exercício 14", JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
