import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) throws Exception {
        //Faça um programa que leia um número inteiro N e depois imprima os N primeiros números naturais ímpares

        //String valor;
        int num;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro positivo: ");
        num = leitor.nextInt();

        for(int n = 1; n <= num; n++){
            if(n%2 != 0){
                System.out.println(n);
            }
        }
    }
}
