import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

    //Faça um programa que calcula o ano de nascimento de uma pessoa a partir de sua idade e do ano atual.

    String idade;
    int idadeN;
    int anoAtual = 2021;

    idade = JOptionPane.showInputDialog(null, "Digite a sua idade: ", "Exercício 3", JOptionPane.INFORMATION_MESSAGE);
    idadeN = Integer.parseInt(idade);

    JOptionPane.showMessageDialog(null, "Seu ano de nascimento é " + (anoAtual - idadeN), "Exercício 3", JOptionPane.INFORMATION_MESSAGE);
        
    }
}
