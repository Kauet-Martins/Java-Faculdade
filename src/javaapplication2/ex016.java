package javaapplication2;

// IMPORTANDO GUI SIMPLES E SCANNER
import javax.swing.*;
import java.util.Scanner;

public class ex016 {

    // METOD INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO VARIAVEIS
        int num;

        int max;

        int min;

        int cont = 0;

        int som = 0;

        int med;

        // INFORMANDO O CODIGO PARA PARAR O PROGRAMA
        JOptionPane.showMessageDialog(null, "Codigo 0 para o programa");

        // PEDINDO UM NUMERO PARA O USUARIO
        System.out.println("Digite um numero:");

        // VARIAVEL NUM RECEBE O VALOR DIGITADO PELO USUARIO
        num = scanner.nextInt();

        // VARIAVEIS MAX E MIN RECEBEM NUM
        max = num;
        min = num;

        // REPETE ESSE CODIGO PELO MENOS UMA VEZ
        do {

            // CONTADOR RECEBE SEU VALOR MAIS UM
            cont = cont + 1;

            // SOMA RECEBE SEU VALOR MAIS NUM
            som = som + num;

            // MEDIA RECEBE SOMA DIVIDIDO PELO CONTADOR
            med = som / cont;

            // SE O NUM FOR MAIOR QUE O MAX ENTAO
            if (num > max){

                // MAX RECEBE NUM
                max = num;

            }

            // SE O NUM FOR MENOR QUE MIN ENTAO
            if (num < min){

                // MIN RECEBE NUM
                min = num;

            }

            // IMPRIME A SOMA DE TODOS OS VALORES
            System.out.println("A soma de todos os valores e "+som);

            // IMPRIME A MEDIA DE TODOS OS VALORES
            System.out.println("A media de todos os valores e "+med);

            // IMPRIME O MAIOR NUMERO
            System.out.println("O maior numero foi "+max);

            // IMPRIME O MENOR NUMERO
            System.out.println("O menor numero foi "+min);

            // QUEBRA DE LINHA
            System.out.println();

            // PEDE OUTRO NUMERO PARA O USUARIO
            System.out.println("Digite um numero:");

            // NUM RECEBE O VALOR DIGITADO
            num = scanner.nextInt();


            // ENQUANTO NUM FOR DIFERENTE DE ZERO O CODIGO SE REPETIRA
        } while (num != 0);



    }

}
