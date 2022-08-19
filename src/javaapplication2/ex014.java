package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex014 {

    // METODO PADRAO DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // DEFININDO A VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO VARIAVEIS INTEIRAS
        int val;

        int fat = 1;

        // PERGUNTANDO UM NUMERO PARA O USUARIO
        System.out.println("Digite um numero:");

        // VARIAVEL VAL RECEBE O INPUT DO USUARIO
        val = scanner.nextInt();

        // SE O VALOR FOR IGUAL A ZERO
        if (val == 0){

            // IMPIME A MENSAGEM
            System.out.println("Valor invalido");

        }

        // SE NAO
        else{

            // ENQUANTO A VARIAVEL VAL FOR MAIOR QUE UM
            while (val > 1){

                // VARIAVEL FAT RECEBE FAR * VAL
                fat = fat * val;

                // VAL RECEBE VAL - 1
                val = val - 1;

        }
            // MOSTRANDO O RESULTADO PARA O USUARIO
            System.out.println("O resultado e "+fat);
        }



    }




}
