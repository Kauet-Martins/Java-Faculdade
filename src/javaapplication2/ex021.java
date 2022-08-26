package javaapplication2;

// IMPORTANDO O SCANNER E FORMA DECIMAL
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex021 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // VARIAVEL INTEIRA I
        int i;

        // DEFININDO UM TAMANHO PARA OS VETORES
        final int n = 35;

        // CRIANDO QUATRO VETORES COM O TAMANHO N
        float not1[] = new float[n];
        float not2[] = new float[n];
        float not3[] = new float[n];
        float med[] = new float[n];

        // LACO DE REPETICAO USADO PARA PREENCHER OS VETORES
        for (i = 0; i<35; i++){

            // PEDINDO A PRIMEIRA NOTA
            System.out.println("Nota 1 "+ (i + 1) +" :");

            // O VETOR RECEBE ESSE VALOR
            not1[i] = scanner.nextFloat();

            // PEDINDO A NOTA  2
            System.out.println("Nota 2 "+ (i + 1)+" :");

            // O VETOR RECEBE ESSE VALOR
            not2[i] = scanner.nextFloat();

            // PEDINDO A NOTA 3
            System.out.println("Nota 3 "+ (i + 1)+" :");

            // O VETOR RECEBE ESSE VALOR
            not3[i] = scanner.nextFloat();

        }

        // PULANDO UMA LINHA
        System.out.println();

        // DEFININDO UMA FORMATACAO PARA OS VALORES
        DecimalFormat df = new DecimalFormat("0.00");

        // LACO DE REPETICAO QUE MOSTRA A MEDIA DAS NOTAS
        for (i = 0; i<n; i++){

            // VETOR MED RECEBE OS VALORES DE NOT1 + NOT2 + NOT3 / 3
            med[i] = (not1[i] + not2[i] + not3[i]) / 3;

            // COLOCANDO A FORMATACAO COM O VALOR MEDIA
           String mediaf =  df.format(med[i]);

           // MOSTRANDO A MEDIA DE CADA ALUNO
            System.out.println("Media Aluno "+ (i + 1) +" Foi "+ mediaf);

        }
    }

}
