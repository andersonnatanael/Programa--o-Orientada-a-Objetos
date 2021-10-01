public class ex06 {
    // 6.Faça um programa que mostre uma contagem regressiva na tela, iniciando em
    // 10 e terminando em 0. Mostre uma mensagem “FIM!” após a contagem.
    public static void main(String[] args) throws Exception {
        
        System.out.println("Contagem regressiva...");

        //int i = 10;

        for(int n = 10; n >= 0; n--){
            System.out.println(n);
        }

        System.out.println("FIM!");
    }

}
