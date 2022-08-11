package javaapplication2;

// IMPORTANDO O PACOTE QUE NOS PERMITE USAR SCANNER COMO INPUTS
import java.util.Scanner;

public class Ex006 {

    // MINI PROJETO CALCULADORA

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // DEFININDO O NOME DO NOSSO SCANNER
        Scanner entrada;

        // DEFININDO QUE O VALOR DE ENTRADA SERA OBTIDO PELO SISTEMA
        entrada = new Scanner(System.in);

        // DECLARANDO UMA VARIAVEL VAZIA
        int op;

        // CRIANDO UM MENU PARA O USUARIO
        System.out.println("1 - Adicao ");
        System.out.println("2 - Subtracao ");
        System.out.println("3 - Multiplicacao ");
        System.out.println("4 - Divisao ");
        System.out.println("Escolha a Operacao: ");

        // A VARIAVEL RECEBE O VALOR QUE O USUARIO DIGITAR
        op = entrada.nextInt();


        // ESTRUTURA DE MULTIPLA ESCOLHA QUE VERIFICA O VALOR RECEBIDO POR OP
        switch (op) {

            // CASO O USUARIO ESCOLHA 1
            case 1 -> {

                // PEDINDO O PRIMEIRO NUMERO
                System.out.println("Digite o primeiro numero: ");

                // O NUMERO FICA ALOCADO DENTRO DE NUM1
                int num1 = entrada.nextInt();

                // PEDINDO O SEGUNDO NUMERO
                System.out.println("Digite o segundo numero: ");

                // O NUMERO FICA DENTRO DE NUM2
                int num2 = entrada.nextInt();

                // VARIAVEWL QUE FAZ A SOMA EXATA DO VALOR
                int soma = Math.addExact(num1, num2);

                // MOSTRANDO O VALOR DE NUM1 + NUM2
                System.out.println(num1 + " + " + num2 + " = " + soma);
            }

            // EVITA QUE MAIS COMPARACOES SEJAM FEITAS APOS ACHAR A CORRESPONDENTE
            // CASO ESCOLHA 2
            case 2 -> {

                // PERGUNTA O PRIMEIRO NUMERO
                System.out.println("Digite o primeiro numero: ");

                // GUARDA O NUMERO ESCOLHIDO
                int num3 = entrada.nextInt();

                // PERGUNTA O SEGUNDO NUMERO
                System.out.println("Digite o segundo numero: ");

                // GUARDO O SEGUNDO NUMERO
                int num4 = entrada.nextInt();

                // VARIAVEL QUE FAZ A SUBTRACAO DOS NUMEROS
                int sub = Math.subtractExact(num3, num4);

                // MOSTRANDO O VALOR DE NUM3 - NUM4
                System.out.println(num3 + " - " + num4 + " = " + sub);
            }

            // EVITA QUE MAIS COMPARACOES SEJAM FEITAS APOS ACHAR A CORRESPONDENTE
            // CASO ESCOLHA 3
            case 3 -> {

                // PERGUNTA O PRIMEIRO NUMERO
                System.out.println("Digite o primeiro numero: ");

                // GUARDA O NUMERO NA VARIAVEL
                int num5 = entrada.nextInt();

                // PERGUNTA O SEGUNDO NUMERO
                System.out.println("Digite o segundo numero: ");

                // GUARDA O NUMERO NA VARIAVEL
                int num6 = entrada.nextInt();

                // VARIAVEL QUE FAZ A MULTIPLICACAO EXATA
                int mult = Math.multiplyExact(num5, num6);

                // MOSTRA NA TELA O RESULTADO DE NUM5 * NUM6
                System.out.println(num5 + " * " + num6 + " = " + mult);
            }

            // EVITA QUE MAIS COMPARACOES SEJAM FEITAS APOS ACHAR A CORRESPONDENTE
            // CASO ESCOLHA 4
            case 4 -> {

                // PERGUNTA O PRIMEIRO NUMERO
                System.out.println("Digite o primeiro numero: ");

                // GUARDA O NUMERO NA VARIAVEL
                int num7 = entrada.nextInt();

                // PERGUNTA O SEGUNDO NUMERO
                System.out.println("Digite o segundo numero: ");

                // GUARDO O NUMERO NA VARIAVEL
                int num8 = entrada.nextInt();

                // ESTRUTURA DE CONDICAO COMPOSTA QUE VERIFICA SE NUM7 É MENOR QUE NUM8
                if (num7 < num8) {

                    // SE FOR MAIOR IMPRIMI UM ERRO NA TELA
                    System.out.println(" ERRO Primeiro Divisor menor que o segundo ");

                }

                // SE NAO EXECUTA O BLOCO DE CODIGO
                else {

                    // VARIAVEL QUE FAZ A DIVISAO EXATA DE  NUM7 / NUM8
                    double div = Math.divideExact(num7, num8);

                    // IMPRIME O RESULTADO DE NUM7 / NUM8
                    System.out.println(num7 + " / " + num8 + " = " + div);
                }
            }

            // CASO O USUARIO ESCOLHA UM NUMERO DIFERENTE DOS PRESENTES NO MENU EXCUTA UMA MENSAGEM DE ERRO
            default -> System.out.println("Escolha Invalida tente novamente");
        }





    }
}
