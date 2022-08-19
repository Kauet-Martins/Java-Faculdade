package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex015 {

    // METODO PADRAO DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // DEFININDO A VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO VARIAVEIS
        int base;

        int altura;

        double area;

        // LACO DE REPETICAO (REPITA) QUE REPETE PELO MENOS UMA VEZ
        do {
            // PERGUNTANDO O VALOR DA BASE PARA O USUARIO
            System.out.println("Digite a base: ");

            // VARIAVEL BASE RECEBE O INPUT DO USUARIO
            base = scanner.nextInt();


          // SE A BASEFOR ZERO REPETE O CODIGO
        } while (base <= 0);

        // LACO DE REPETICAO DO...WHILE
        do {

            // PERGUNTA A ALTURA PARA O USUARIO
            System.out.println("Digite a altura: ");

            // A ALTURA RECEBE O INPUT DO USUARIO
            altura = scanner.nextInt();

          // SE A ALTURA FOR IGUAL A ZERO O CODIGO REPETE
        } while (altura <= 0);


        // FAZ O CALCULO DA BASE VEZES A ALTURA DIVIDIDO POR DOIS
        base = (base * altura) /2;

        // MOSTRA A AREA DO TRIANGULO
        System.out.println("A area do triangulo e "+base);

    }

}
