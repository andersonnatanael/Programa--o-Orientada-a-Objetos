import javax.swing.JOptionPane;

public class App {

    /* Escreva uma programa que, dada a idade de um nadador, o classifique em uma
     * das seguintes categorias:
     * Categoria Idade Infantil A 5-7, Infantil B 8-10, Juvenil A 11-13,
     * Juvenil B 14-17, Sênior maiores de 18 anos*/
    public static void main(String[] args) throws Exception {
        String idade1;
        int idade;

        idade1 = JOptionPane.showInputDialog(null, "Digite a idade do nadador: ");
        idade = Integer.parseInt(idade1);

        if(idade < 5){
            JOptionPane.showMessageDialog(null, "Idade abaixo do mínimo \npermitido no campeonato!", "Exercício 17", JOptionPane.INFORMATION_MESSAGE);
        }else if (idade >= 5 && idade <= 7){
            JOptionPane.showMessageDialog(null, "Categoria Infantil A", "Exercício 17", JOptionPane.INFORMATION_MESSAGE);
        } else if (idade >= 8 && idade <= 10){
            JOptionPane.showMessageDialog(null, "Categoria Infaltil B", "Exercício 17", JOptionPane.INFORMATION_MESSAGE);
        } else if (idade >= 11 && idade <= 13){
            JOptionPane.showMessageDialog(null, "Categoria Juvenil A", "Exercício 17", JOptionPane.INFORMATION_MESSAGE);
        } else if (idade >= 14 && idade <= 17){
            JOptionPane.showMessageDialog(null, "Categoria Juvenil B", "Exercício 17", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Categoria Sênior", "Exercício 17", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
