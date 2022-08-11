package javaapplication2;

// IMPORTANDO SCANNER QUE NOS PERMITE USAR INPUTS
import java.util.Scanner;

public class ex009 {

    // METODO INICIAL DE TODO PROGRAM EM JAVA
    public static void main(String [] args){

        // DEFININDO UMA VARIAVEL DO TIPO SCANNER
        Scanner entrada;

        // DECLARANDO QUE A VARIAVEL RECEBERA VALORES DIRETO DO SISTEMA
        entrada = new Scanner(System.in);

        // DEFININDO DUAS VARIAVEIS VAZIAS
        double pre;

        double ven;


        // PEDINDO PARA O USUARIO DECLARAR O PRECO DO PRODUTO
        System.out.println("Digite o preco do produto: ");

        // RECEBE O VALOR DIGITADO PELO USUARIO
        pre = entrada.nextDouble();

        // PEDINDO PARA O USUARIO DEFINIR AS VEDAS MENSAIS DO PRODUTO
        System.out.println("Digite as vendas Mensais: ");

        // RECEBE O VALOR DIGITADO PELO USUARIO
        ven = entrada.nextDouble();

        // ESTRUTURA CONDICIONAL SE, VERIFICA SE O PRECO É MENOR QUE 50 OU AS VENDAS SAO MENORES QUE QUINHENTOS
        // || --> OR ( SE UM OU OUTRO FOREM VERDADEIRA IF É VERDADEIRO )
        if (pre < 50 || ven < 500){

            // VARIAVEL QUE CALCULA O AUMENTO DO PRECO
            double aum = pre + (pre * 10/100);

            // IMPRIME O NOVO PRECO
            System.out.println("Novo preco " + aum);

        }

        // ESTRUTURA CONDICIONAL SE, VERIFICA SE O PRECO É MAIOR OU IGUAL A 50 E A VENDAS SAO MENORES QUE 1000
        // && --> AND ( SOMENTE SERA VERDADE SE AMBAS FOREM VERDADE )
        if (pre >= 50 && ven < 1000){

            // CALCULA O NOVO PRECO
            double aum2 = pre + (pre * 20/100);

            // IMPRIME O NOVO PRECO
            System.out.println("Novo preco " + aum2);
        }

        // ESTRUTURA CONDICIONAL SE, VERIFICA SE O PRECO É MAIOR QUE 100 OU AS VENDAS SAO MAIORES QUE 1000
        // || --> OR (SE ALGUMA DAS DUAS FOR VERDADEIRA ENTAO É VERDADEIRO
        if (pre > 100 || ven > 1000){

            // CALCULA O NOVO PRECO
            double aum3 = pre - (pre * 20/100);

            // IMPRIME O NOVO PRECO
            System.out.println("Novo Preco " + aum3);
        }

    }

}
