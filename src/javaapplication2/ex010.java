package javaapplication2;

//  IMPORTANDO SCANNER QUE NOS PERMITE USAR INPUTS
import java.util.Scanner;

public class ex010 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DEFININDO A VARIAVEL SCANNER
        Scanner entrada;

        // VARIAVEL SCANNER RECEBE UM VALOR VINDO DO SISTEMA
        entrada = new Scanner(System.in);

        // VARIAVEL CEL VAZIA
        double cel;

        // PEDINDO DO USUARIO A TEMPERATURA EM CELSIUS
        System.out.println("Digite o valor em graus celsius:");

        // VARIAVEL CEL RECEBE O VALOR DO INPUT DO INSUARIO
        cel = entrada.nextDouble();

        // VARIAVEL OP VAZIA
        int op;

        // MENU DE OPCOES DE CONVERSAO
        System.out.println("1 - Kelvin");
        System.out.println("2 - Reaumur");
        System.out.println("3 - Rankine");
        System.out.println("4 - Fahrenheit");
        System.out.println("Qual deseja converter? ");

        // VARIAVEL OP RECEBE A ESCOLHA DO USUARIO
        op = entrada.nextInt();


        // ESTRUTURA CONDICIONAL DE MULTIPLA ESCOLHA QUE VERIFICA O VALOR DE OP
        switch (op){

            // CASO OP == 1
            case 1:

                // FAZ A CONVERSAO DE CELSIUS PARA KELVIN
                double kelvin = cel + 273.15;

                // IMPRIME O VALOR DA CONVERSAO
                System.out.println("O valor convertido em graus Kelvin ficou "+kelvin);

            // QUEBRA PARA IMPEDIR O SISTEMA DE VERIFICAR MAIS CONDICOES APOS ENCONTRAR A CERTA
            break;

            // CASO OP == 2
            case 2:

                // FAZ A CONVERSAO PARA REAUMUR
                double re = cel * 0.8;

                // IMPRIME O VALOR DA CONVERSAO
                System.out.println("O valor convertido em graus Reaumur ficou "+re);


            // QUEBRA PARA IMPEDIR O SISTEMA DE VERIFICAR MAIS CONDICOES APOS ENCONTRAR A CERTA
            break;

            // CASO OP == 3
            case 3:

                // FAZ A CONVERSAO PARA RANKINE
                double ra = cel * 1.8 + 32 + 459.67;

                // IMPRIME O VALOR DA CONVERSAO
                System.out.println("O valor convertido em graus Rankine ficou "+ra);


            // QUEBRA PARA IMPEDIR O SISTEMA DE VERIFICAR MAIS CONDICOES APOS ENCONTRAR A CERTA
            break;

            // CASO OP == 4
            case 4:

                // FAZ A CONVERSAO PARA FAHRENHEIT
                double fh = cel * 1.8;

                // IMPRIME O VALOR DA CONVERSAO
                System.out.println("O valor convertido em graus Fahrenheit ficou "+fh);

            // CASO O USUARIO ESCOLHA ALGO FORA DO MENU IMPRIME UMA MENSAGEM DE ERRO
            default:
                System.out.println("ERRO escolha invalida tente novamente");


        }





    }

}
