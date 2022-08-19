package javaapplication2;

// IMPORTANDO O SCANNER QUE NOS PERMITE UTILIZAR INPUTS
import java.util.Scanner;

public class Semana3 {

    // METODO PADRAO DE TODO PROGRAMA EM  JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO UMA VARIAVEL NAME VAZIA
        String name = "";

        // LACO DE REPETICAO QUE SO PARA QUANDO A VARIAVEL NAME POSSUIR ALGO ALOCADO NELA
        while (name.isBlank()){

            // PERGUNTADO O NOME
            System.out.println("Qual o seu nome? ");

            // O NOME DIGITADO FICA ALOCADO NA VARIAVEL NAME FAZENDO O LOOP PARAR
            name = scanner.nextLine();

        }

        // IMPRIMINDO UM OLA COM O NOME DA PESSOA
        System.out.println("Hello "+name);



    }

}
