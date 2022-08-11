package javaapplication2;

// IMPORTANDO OQUE NOS PERMITE CRIAR MENUS E PEDIR INPUTS DO USUARIO NO TERMINAL
import java.util.Scanner;

public class Ex005 {

    // METODO INICIAL
    public static void main(String [] args){

        // GERANDO UM SCANNER DE ENTRADA
        Scanner entrada;

        // DEFININDO QUE O VALOR DE ENTRADA SERA VINDO DO PROPRIO SISTEMA
        entrada = new Scanner(System.in);

        // DECLARANDO UMA VARIAVEL INTEIRA
        int op;


        // CRIANDO UM MENU E PEDINDO PARA O USUARIO ESCOLHER A SUA OPCAO
        System.out.println("1 - Somar dois Numeros");
        System.out.println("2 - Raiz de um numero");
        System.out.println("Oque Deseja Fazer? ");

        // VALOR DA VARIAVEL SERA O NUMERO QUE O USUARIO
        op = entrada.nextInt();

        // ESTRUTURA DE MULTIPLA ESCOLHA OLHANDO DIRETAMENTE PARA O VALOR DA VARIAVEL OP
        switch (op){

            // CASO OP TENHA VALOR 1
            case 1 :

                // PERGUNTA AO USUARIO O VALOR DO PRIMEIRO NUMERO
                System.out.println("Dite o valor do Primeiro Numero: ");

                // O VALOR QUE O USUARIO DIGITAR FICA GUARDADO EM NUM1
                double num1 = entrada.nextDouble();

                // PERGUNTA AO USUARIO O VALOR DO SEGUNDO NUMERO
                System.out.println("Digite o valor para o Segundo Numero: ");

                // O VALOR DIGITADO PELO USUARIO FICA GUARDADO EM NUM2
                double num2 = entrada.nextDouble();

                // DECLARANDO UMA VARIAVEL QUE SOMA O DOIS VALORES
                double soma = num1 + num2;

                // MOSTRANDO AO USUARIO AS SUAS ESCOLHAS E A SOMA DA SUAS ESCOLHAS
                System.out.println("A soma " + num1 + " + " + num2 + " = " + soma);

            // EVITA QUE MAIS COMPARACOES SEJAM FEITAS APOS UMA SER ESCOLHIDA
            break;

            // CASO ESCOLHA 2
            case 2 :

                // PERGUNTA AO USUARIO O NUMERO QUE DESEJA VERIFICAR
                System.out.println("Digite o numero que desejar verificar a raiz: ");

                // RECEBE O VALOR DIGITADO PELO USUARIO
                double num3 = entrada.nextDouble();

                // DESCOBRE SUA RAIZ EXATA
                double raiz = Math.sqrt(num3);

                // MOSTRA AO USUARIO SUA ESCOLHA E A RAIZ DO NUMERO
                System.out.println("A raiz quadrada de " + num3 + " e " + raiz);


            // SE O USUARIO ESCOLHER UM NUMERO QUE NAO ESTA NO MENU A MENSEGEM ABAIXO APARECE
            default: System.out.println("Opcao Invalida");


        }


    }

}
