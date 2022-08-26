package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex024 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // SCANNER RECEBE UM VALOR DO SISTEMA
        Scanner scanner = new Scanner(System.in);

        // DEFININDO UMA VARIAVEL INTEIRA SEM VALOR INICIAL
        int i;

        // DEFININDO UMA VARIAVEL FINAL PARA SER O TAMANHO DO VETOR
        final int n = 10;

        // DEFININDO UM VETOR DE INTEIROS E COLOCANDO O SEU TAMANHO IGUAL O DA VARIAVEL N
        int vet[] = new int[n];


        // LACO DE REPETICAO FOR USADO PARA PREENCHER O VETOR
        for(i = 0; i < 10; i++){

            // PERGUNTANDO UM NUMERO AO USUARIO
            System.out.println("Digite um numero:");

            // VETOR[i] RECEBE O VALOR DIGITADO PELO USUARIO
            vet[i] = scanner.nextInt();

        }

        // LACO DE REPETICAO FOR USADO PARA IMPRIMIR OS VALORES DENTRO DO VETOR AO CONTRARIO
        for (i = 9; i >=0; i--){

            // MOSTRANDO OS VALORES DENTRO DO VETOR
            System.out.println(vet[i]);

        }

    }

}
