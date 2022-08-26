package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex022 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // VARIAVEL INTEIRA I
        int i;

        // VARIAVEL POS RECEBE 0
        int pos = 0;

        // VARIAVEL NEG RECEBE 0
        int neg = 0;

        // VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO UMA VARIAVEL FINAL
        final int n = 10;

        // CRIANDO UM VETOR COM O VALOR DE N
        int vet[] = new int[n];

        // LACO DE REPETICAO QUE PREENCHE O VETOR
        for (i = 0; i < 10; i++){

            // PEDINDO UM ITEM PARA O VETOR
            System.out.println("Digite o item "+ (i + 1) +" do vetor");

            // O VETOR RECEBE ESSE VALOR
            vet[i] = scanner.nextInt();

        }

        // LACO DE REPETICAO QUE VERIFICA SE O NUMERO E POSITIVO
        for (i =0; i<10; i++){

            // SE O VALOR DE VETOR FOR MAIOR OU IGUAL A ZERO
            if (vet[i] >= 0){

                // VARIAVEL POS RECEBE SEU VALOR MAIS UM
                pos = pos + 1;

            }

            // SE NAO FOR
            else{

                // VARIAVEL NEG RECEBE SEU VALOR MAIS UM
                neg = neg + 1;

            }

        }

        // IMPRIME A QUANTIDADE DE POSITIVOS E NEGATIVOS
        System.out.println("A qauntidade de positivos foi "+pos);
        System.out.println("A quantidade de negativos foi "+neg);

        }

    }

