public class ex10 {
    // Faça um programa que exiba a soma de todos os números naturais abaixo de
    // 1.000 que são múltiplos de 3 ou 5.
    public static void main(String[] args) throws Exception {

        int soma = 0;

        for (int i = 999; i >= 3; i--){
            if(i % 3 == 0 || i % 5 == 0){
                soma += i;
                //System.out.println(i);
                //System.out.println(soma);
            }
        }

        System.out.println("A soma dos números naturais positivos\n menores que 1000 é: " + soma);

    }
}
