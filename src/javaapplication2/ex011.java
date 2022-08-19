package javaapplication2;

// IMPORTANDO SCANNER QUE NOS PERMITE LER INPUTS
import java.util.Scanner;

public class ex011 {

    // METODO PADRAO DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // DEFININDO UMA VARIAVEL SCANNER E ATRIBUINDO QUE O VALOR DELA SERA GERADO PELO SISTEMA
        Scanner scanner = new Scanner(System.in);

        // DEFININDO TRES VARIAVEIS E DECLARANDO SEUS VALORES COMO 0
        int cont = 0;

        int idade;

        double med = 0;

        // LACO DE REPETICAO ENQUANDO CONT FOR MENOR OU IGUAL A ZERO  ELE EXECUTA O CODIGO
        while (cont <=25){

            // PERGUNTA A IDADE DO AULUNO
            System.out.println("Qual a idade do Aluno(a)?");

            // IDADE RECEBE O VALOR DIGITADO PELO USUARIO
            idade = scanner.nextInt();

            // CONTADOR RECEBE O VALOR DELE MAIS UM
            cont = cont + 1;

            // A MEDIA É SOMADA PELO DIVISAO DA IDADE POR CONT
            med = idade / cont;

            // MOSTRA A MEDIA PARCIAL
            System.out.println("Media Parcial "+med);

        }

        // MOSTRA A MEDIA DEFINITIVA
        System.out.println("A media entre todas as idades e "+med);
    }

}
