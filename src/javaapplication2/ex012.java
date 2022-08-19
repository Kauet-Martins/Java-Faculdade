package javaapplication2;

// IMPORTANDO SCANNER QUE NOS PERMITE USAR INPUTS
import java.util.Scanner;

public class ex012 {

    // METODO PADRAO DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        //  DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // PERGUNTANDO O SALARIO DE MARIA
        System.out.println("Digite o salario de Mariana: ");

        // SALARIO 1 RECEBE O VALOR DIGITADO PELO USUARIO
        double sal1 = scanner.nextDouble();

        // SALARIO 2 RECEBE UM TERCO DO SALRIO 1
        double sal2 = sal1 / 3;

        // VARIAVEL MES RECEBE 0
        int mes = 0;

        // ENQUANDO O SALARIO 2 FOR MENOR OU IGUAL AO SALARIO 1 O CODIGO SERA EXECUTADO
        while(sal2 <= sal1){

            // SALARIO 1 RECEBE UM AUMENTO DE DOIS POR CENTO
            sal1 = sal1 + (sal1 * 2/100);

            // SALARIO 2 RECEBE UM AUMENTO DE CINCO POR CENTO
            sal2 = sal2 + (sal2 * 5/100);

            // VARIAVEL MES RECEBE A SOMA DELA MESMO POR UM
            mes = mes + 1;

            // QUANTIDADE MESES QUE SE PASSARAM ATE O MOMENTO
            System.out.println("Quantidade de meses ate o momento: "+mes);

        }

        // QUANTIDADE TOTAL DE MESES NECESSARIOS PARA SALARIO 2 PASSAR SALARIO 1
        System.out.println("A quantidade de meses necessarios para pedro alcancar o salario de mariana foi "+mes);

    }




}
