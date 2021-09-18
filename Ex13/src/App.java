import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        /*Faça um programa que leia o salário de um trabalhador e o valor da prestação de um empréstimo. Se a prestação:
        For maior que 20% do salário, imprima: “Empréstimo não concedido;
        Caso contrário, imprima: “Empréstimo concedido”*/ 

        String valor1, valor2;
        Double salario, prestacao;

        valor1 = JOptionPane.showInputDialog(null, "Digite o seu salário: ", "Exercício 13", JOptionPane.INFORMATION_MESSAGE);
        valor2 = JOptionPane.showInputDialog(null, "Digite o valor da prestação: ", "Exercício 13", JOptionPane.INFORMATION_MESSAGE);
        salario = Double.parseDouble(valor1);
        salario = salario * 0.2;
        prestacao = Double.parseDouble(valor2);

        if(prestacao > salario){
            JOptionPane.showMessageDialog(null, "Empréstimo não concedido.", "Exercício 13", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Empréstimo concedido.", "Exercício 13", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
}
