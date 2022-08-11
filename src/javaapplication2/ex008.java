package javaapplication2;

// IMPORTANDO SCANNER QUE NOS PERMITE USAR INPUTS
import  java.util.Scanner;

public class ex008 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL DE SCANNER
        Scanner entrada;

        // A VARIAVEL RECEBE VALORES DO SISTEMA
        entrada = new Scanner(System.in);

        // DECLARANDO VARIAVEL VAZIA
        int op;

        // CRIANDO UM MENU
        System.out.println("1 - Servicos Gerais");
        System.out.println("2 - Atendente");
        System.out.println("3 - Supervisor");
        System.out.println("4 - Gerente");

        // PERGUNTANDO QUAL O CARGO DO FUNCIONARIO
        System.out.println("Qual o seu Cargo? ");

        // OP RECEBE O VALOR DIGITADO PELO USUARIO
        op = entrada.nextInt();

        // DECLARANDO UMA VARIAVEL VAZIA
        double sal;

        // PERGUNTANDO O SALARIO DO USUARIO
        System.out.println("Digite Seu salario: ");

        // SAL RECEBE O VALOR DIGITADO PELO USUARIO
        sal = entrada.nextInt();


        // ESTRUTURA DE MULTIPLA ESCOLHA QUE VERIFICA O VALOR DE OP ( ESCOLHIDO PELO USUARIO )
        switch (op){

            // CASO ESCOLHA 1
            case 1 :

                // MOSTRA A OPCAO ESCOLHIDA
                System.out.println("Servicos Gerais");

                // O SALARIO ATUAL
                System.out.println("Seu salario e " + sal);

                // O AUMENTO RECEBIDO
                System.out.println("Aumento de 50%");

                // VARIAVEL QUE CALCULA O AUMENTO
                double newsal = sal + (sal * 50/100);

                // INFORMANDO O NOVO SALARIO
                System.out.println("Novo Salario " + newsal);

            // EVITA QUE MAIS COMPARACOES SEJAM FEITAS APOS UMA SER ESCOLHIDA
            break;


            // CASO ESCOLHA 2
            case 2 :

                // MOSTRA O CARGO
                System.out.println("Atendente");

                // MOSTRA O SALARIO ATUAL
                System.out.println("Seu salario atual e " + sal);

                // MOSTRA O AUMENTO
                System.out.println("Aumento de 30%");

                // VARIAVEL QUE CALCULA O AUMENTO
                double newsal2 = sal + (sal * 30/100);

                // IMPRIME O AUMENTO
                System.out.println("Seu novo Salario e " + newsal2);

            // EVITA QUE MAIS COMPARACOES SEJAM FEITAS APOS UMA SER ESCOLHIDA
            break;

            // CASO ESCOLHA 3
            case 3 :

                // IMPRIME O CARGO
                System.out.println("Supervisor");

                // IMPRIME O SALARIO ATUAL
                System.out.println("Seu salrio atual e " + sal);

                // IMPRIME O AUMENTO RECEBIDO
                System.out.println("Aumento de 20%");

                // VARIAVEL QEU CALCULA O AUMENTO
                double newsal3 = sal + (sal * 20/100);

                // IMPRIME O NOVO SALARIO
                System.out.println("Seu novo salario e " + newsal3);

            // EVITA QUE MAIS COMPARACOES SEJAM FEITAS APOS UMA SER ESCOLHIDA
            break;

            // CASO ESCOLHA 4
            case 4 :

                // IMPRIME O CARGO
                System.out.println("Gererente");

                // IMPRIME O SALARIO
                System.out.println("Seu salario atual e " + sal);

                // IMPRIME O AUMENTO
                System.out.println("Aumento de 10%");

                // VARIAVEL QUE CALCULA O AUMENTO
                double newsal4 = sal + (sal * 10/100);

                // IMPRIME O NOVO SALARIO
                System.out.println("Seu novo salario e " + newsal4);

            // SE O USUARIO DIGITAR UM VALOR QUE NAO ESTEJA NO MENU IMPRIME UM TEXTO DE ERRO
            default:

                System.out.println("ERRO numero invalido tente novamente");


        }
    }
}
