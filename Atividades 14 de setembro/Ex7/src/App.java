import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
    /*A importância de R$ 780.000,00 será dividida entre três ganhadores de um concurso, sendo que:
        O primeiro ganhador receberá 46% do total;
        O segundo receberá 32% do total;
        O terceiro receberá o restante.
	Calcule e imprima a quantia recebida por cada um dos ganhadores.*/

    Double premiacao = 780000.00;
    Double primeiro , segundo;

    primeiro = premiacao * 0.46;
    segundo = premiacao * 0.32;

    JOptionPane.showMessageDialog(null, "Premiações:" + "\n" + "1º lugar: " + primeiro + "\n" + "2º lugar: " + segundo + "\n" + "3º lugar: " + (premiacao - primeiro - segundo), "Exercício 7", JOptionPane.INFORMATION_MESSAGE);
    
    }
}
