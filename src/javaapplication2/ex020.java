package javaapplication2;

// IMPORTANDO SCANNER
import java.util.Scanner;

public class ex020 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DIFININDO DUAS VARIAVEIS
        int num;

        int qtde = 0;

        // PEDINDO UM NUMERO PARA O USUARIO
        System.out.println("Digite um numero para verificar se ele e primo:");

        // VARIAVEL NUM RECEBE O VALOR DIGITADO PELO USUARIO
        num = scanner.nextInt();

        // LACO DE REPETICAO FOR
        for (int i = 1; i<=num; i++){

            // SE O RESTO DA DIVISAO DE NUM % I FOR IGUAL A ZERO
            if ((num % i)==0)
                qtde++;

        }

        // SE QTDE FOR MAIOR QUE DOIS
        if (qtde > 2)

            // IMPRIME A FRASE DESCRITA
            System.out.println(num+" nao e primo");

        // SE NAO
        else

            // IMPRIME A FRASE DESCRITA
            System.out.println(num+" e primo");




    }

}
