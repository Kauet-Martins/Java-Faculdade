package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex017 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO DUAS VARIAVEIS
        int par;

        int som = 0;

        // PERGUNTANDO AO USUARIO ATE QUE NUMERO IREMOS
        System.out.println("Digite ate que numero vamos calcular? ");

        // VARIAVEL PAR RECEBE OQUE O USUARIO DIGITAR
        par = scanner.nextInt();

        // REPITA PELO MENOS UMA VEZ
        do {

            // SE O RESTO DA DIVISAO DE PAR POR DOIS FOR ZERO ENTAO
            if (par % 2 == 0){

                // VARIAVEL SOM RECEBE SEU VALOR MAIS O VALOR DE PAR
                som = som + par;

            }

            // VARIAVEL PAR RECEBE SEU VALOR MENOS UM
            par = par - 1;

         // ENQUANTO PAR FOR MAIOR QUE ZERO O CODIGO SE REPETE
        }while (par > 0);

            // MOSTRA A SOMA DE TODOS OS VALORES PARES
            System.out.println("A soma de todos os pares e "+som);
    }

}
