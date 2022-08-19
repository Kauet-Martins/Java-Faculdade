package javaapplication2;

// IMPORTANDO GUI SIMPLES E SCANNER
import javax.swing.*;
import java.util.Scanner;

public class ex013 {

    // METODO PADRAO DE TODO PROGRAMA EM JAVA
    public static void main(String[] args) {

        // DEFININDO UMA VARIAVEL SCANNER
        Scanner scanner = new Scanner(System.in);

        // DEFININDO VARIAVEIS
        int cod;

        int horas;

        char sexo;

        double salB;

        double salL = 0;

        double med_m = 0;

        int cont_m = 0;

        double med_f = 0;

        int cont_f = 0;

        // INFORMANDO O CODIGO PARA PARAR O PROGRAMA
        JOptionPane.showMessageDialog(null, "Codigo para parar o programa 9999");

        // PEDINDO O CODIGO PARA O USUARIO
        System.out.println("Digite o codigo: ");

        cod = scanner.nextInt();

        // ENQUANTO O CODIGO FOR DIFERENTE DE 9999 O CODIGO EXECUTA
        while (cod != 9999){

            // PEDINDO O O SEXO DO USUARIO
            System.out.println("M para masculino F para feminino");

            // VARIAVEL SEXO RECEBE A LETRA DIGITADA PELO USUARIO
            sexo = scanner.next().charAt(0);

            // PERGUNTA A QUANTIDADE DE HORAS TRABALHADAS PELO USUARIO
            System.out.println("Quantas horas trabalhadas?");

            // VARIAVEL HORA RECEBE O VALOR DIGITADO PELO USUARIO
            horas = scanner.nextInt();

            // SALARIO BRUTO DEFINIDO PELA QUANTIDADE DE HORAS * POR 30
            salB = horas * 30;

            // SE O SEXO FOR MASCULINO
            if (sexo == 'M'){

                // DESCONTA DEZ POR CENTO DO SALARIO BRUTO
                salL = salB - (salB * 10/100);

                // CALCULA MEDIA DE TODOS OS SALARIOS
                med_m = med_m + salL;

                // CONTADOR DE HOMENS RECEBE SEU VALOR + 1
                cont_m = cont_m + 1;

            }

            // SE NAO
            else{

                // SE O SEXO FOR FEMININO
                if (sexo == 'F'){

                    // DESCONTA CINCO POR CENTO DO SALARIO BRUTO
                    salL = salB - (salB * 5/100);

                    // CALCULA A MEDIA DE TODOS OS SALARIOS
                    med_f = med_f + salL;

                    // CONTADOR DE MULHERES RECEBE SEU VALOR + 1
                    cont_f = cont_f + 1;

                }

            }

            // IMPRIME O CODIGO QUE O USUARIO DIGITOU
            System.out.println("Codigo "+cod);

            // IMPRIME O SALARIO BRUTO
            System.out.println("Salario bruto "+salB);

            // IMPRIME O SALARIO LIQUIDO
            System.out.println("Salario Liquido "+salL);

            // PULA UMA LINHA
            System.out.println();

            // PERGUNTA O CODIGO PARA O USUARIO
            System.out.println("Digite o codigo:");

            // COD RECEBE O VALOR DIGITADO PELO USUARIO
            cod = scanner.nextInt();

        }

        // SE O CONTADOR MASCULINO FOR IGUAL A ZERO
        if (cont_m == 0) {

            // IMPRIME A MENSAGEM
            System.out.println("Nenhum Funcionario Masculino");

        }

        // SE NA0
        else{

            // CALCULA A MEDIA MASCULINA DIVIDIDA PELO CONTADOR MASCULINO
            med_m = med_m / cont_m;

            // IMPRIME O RESULTADO
            System.out.println("Media masculina "+med_m);

        }


            // SE O CONTADOR FEMININO FOR IGUAL A ZERO
            if (cont_f == 0){

                // IMPRIME A MENSAGEM
                System.out.println("Nenhuma Funcionaria feminina");

            }

            // SE NAO
            else{

                // CALCULA A MEDIA FEMININA DIVIDA PELO CONTADOR FEMININO
                med_f = med_f / cont_f;

                // IMPRIME O RESULTADO
                System.out.println("Media feminina "+med_f);

            }

    }
}
