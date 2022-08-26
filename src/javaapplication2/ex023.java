package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex023 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DIFININDO UMA VARIAVEL INTEIRA
        int i;

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO UMA VARIAVEL FINAL
        final int n1 = 5;

        // DEFININDO UMA VARIAVEL FINAL
        final int n2 = 5;

        // CRIANDO UM VETOR COM O VALOR DE N1
        String mod[] = new String[n1];

        // CRIANDO UM VETOR COM VALOR DE N2
        float cons[] = new float[n2];

        //DEFININDO UMA VARIAVEL FLOAT
        float mincons;

        // DEFININDO UMA VARIAVEL INTEIRA
        int minmod = 0;

        // CRIANDO UMA VARIAVEL FLOAT
        float val;

        // LACO DE REPETICAO QUE PREENCHE OS VETORES
        for (i = 0; i<5; i++){

            // PERGUNTA O MODELO DO CARRO
            System.out.println("Digite o modelo do carro:");

            // O VETOR RECEBE O VALOR
            mod[i] = scanner.next();

            // PERGUNTANDO O CONSUMO
            System.out.println("Digite o Consumo:");

            // O VETOR RECEBE O VALOR
            cons[i] = scanner.nextFloat();

        }


        // VARIAVEL RECEBE O VALOR DO PRIMEIRO NUMERO DE VETOR
        mincons = cons[0];

        // LACO DE REPETICAO QUE VERIFICA O MENOR CONSUMO
        for (i = 0; i<5; i++){

            if (cons[i] < mincons){

                mincons = cons[i];

                minmod = i;
            }

            // VARIAVEL QUE CALCULA O CONSUMO DE CADA CARRO AO PERCORRER 100 KM
            val = 100/cons[i];

            // MOSTRA O CONSUMO DE CADA CARRO
            System.out.println("O carro "+ mod[i] + " consome "+val+ "L para andar 100Km");


        }

        // MOSTRA O AUTOMOVEL MAIS ECONOMICO
        System.out.println("O automovel mais economico e "+ mod[minmod]);
    }
}
