import java.util.Scanner;

public class ex09 {
    // Escreva um programa que leia um número inteiro e calcule a soma de todos os
    // divisores desse número, com exceção dele próprio. Exemplo: a soma dos
    // divisores do número 66 é 1 + 2 + 3 + 6 + 11 + 22 + 33 = 78.
    public static void main(String[] args) throws Exception {
        
        int num;
        int soma = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número inteiro \nmaior que 0: ");
        num = leitor.nextInt();

        for(int i = 1; i < num; i++){
            if(num%i == 0){
                soma += i;
            }
        }

        System.out.println("A soma entre os divisores de " + num + "\ncom excessão dele próprio é: " + soma);

    }

}
