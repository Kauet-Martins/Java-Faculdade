package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex018 {

    // METODO PADRAO DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL PARA SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO VARIAVEL
        int val;

        int fat;

        // PEDINDO UM NUMERO PARA O USUARIO
        System.out.println("Digite um numero:");

        // VARIAVEL VAL RECEBE O VALOR DIGITADO PELO USUARIO
        val = scanner.nextInt();


        // LACO DE REPETICAO FOR
        for (fat = 1; val > 1; val--){

            // VARIAVEL FAT RECEBE SEU VALOR MULTIPLICADO POR VAL
            fat = fat * val;

        }

        // IMPRIME A VARIAVEL FAT
        System.out.println(fat);

    }

}
