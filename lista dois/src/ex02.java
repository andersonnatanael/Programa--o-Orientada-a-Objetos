import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) throws Exception {
        //Faça um programa que leia um número inteiro positivo N e imprima todos os números naturais de 0 até N em ordem decrescente

        int num;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        num = leitor.nextInt();

        for(int n = 0; num >= n; num--){
            System.out.println(num);
        }
    }
}
