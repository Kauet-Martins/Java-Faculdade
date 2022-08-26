package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex025 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL INTEIRA SEM VALOR
        int i;

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO UMA VARIAVEL FINAL QUE SERA O TAMANHO DO VETOR
        final int n = 10;

        // CRIANDO UM VETOR DE STRINGS COM O TAMANHO DA VARIAVEL N
        String let[] = new String[n];

        // CRIANDO UMA VARIAVEL INTEIRA COM O VALOR 0
        int vog = 0;

        // CRIANDO UMA VARIAVEL INTEIRA COM O VALOR 0
        int cons = 0;

        // LACO DE REPETICAO FOR QUE VAI PREENCHER O VETOR
        for (i = 0; i < 10; i++){

            // PEDINDO UMA LETRA PARA O USUARIO
            System.out.println("Digite uma letra:");

            // O VETOR RECEBE ESSE VALOR
            let[i] = scanner.next();

        }

        // LACO DE REPETICAO FOR USADO PARA DEFINIR QUAIS ELEMENTOS DENTRO DO VETOR SAO VOGAIS E QUAIS SAO CONSOANTES
        for (i = 0; i < 10; i++){

            // SE A LETRA DENTRO DE VETOR FOR ALGUMA VOGAL
            if (let[i].equalsIgnoreCase("a") || let[i].equalsIgnoreCase("e") || let[i].equalsIgnoreCase("i") || let[i].equalsIgnoreCase("o") || let[i].equalsIgnoreCase("u")){

                // VARIAVEL VOG RECEBE SEU VALOR MAIS 1
                vog = vog + 1;

            }

            // SE NAO
            else{

                // VARIAVEL CONS RECEBE SEU VALOR MAIS 1
                cons = cons + 1;

                // IMPRIME TODAS AS CONSOANTES
                System.out.println(let[i]);

            }

            }

            // MOSTRA O TOTAL DE VOGAIS E O TOTAL DE CONSOANTES
            System.out.println("O total de vogais foram "+vog);
            System.out.println("O total de consoantes foram "+cons);


            }
        }



