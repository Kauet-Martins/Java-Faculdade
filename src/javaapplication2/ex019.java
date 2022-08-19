package javaapplication2;

// IMPORTANTO A SCANNER
import java.util.Scanner;

public class ex019 {

    // METO INICIAL DE TODO PROGRAMA EM JAVA
    public  static  void main(String [] args){

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO VARIAVEIS
        int end;

        int num1 = 0;

        int num2 = 1;

        int res;

        // PEDINDO O NUMERO PARA ENCERRAR A SEQUENCIA
        System.out.println("Digite o numero para encerrar a sequencia:");

        // VARIAVEL END RECEBE ESSE NUMERO
        end = scanner.nextInt();

        // IMPRIMINDO O NUM1
        System.out.print(num1 + " ");

        // IMPRIMINDO O NUM2
        System.out.print(num2 + " ");

        // LACO DE REPETICAO FOR
        for (int cont = 0; cont <= end; cont++){

            // VARIAVEL RES RECEBE NUM1 + NUM2
            res = num1 + num2;

            // IMPRIME O RESULTADO
            System.out.print(res + " ");

            // NUM1 RECEBE NUM2
            num1 = num2;

            // NUM2 RECEBE RES
            num2 = res;


        }

    }

}
