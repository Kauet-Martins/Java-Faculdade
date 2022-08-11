package javaapplication2;

// IMPORTANDO SCANNER QUE NOS PERMITE USAR INPUTS
import java.util.Scanner;

public class ex007 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // DECLARANDO O NO DE SCANNER ( ENTRADA )
        Scanner entrada;

        // DEFININDO QUE ENTRADA RECEBERA O VALOR DO SISTEMA
        entrada = new Scanner(System.in);

        // DECLARANDO A VARIAVEL VAZIA
        int op;

        // PEDINDO PARA O USUARIO DIGIRAR UM NUMERO
        System.out.println("Digite um numero para verificar se ele e Par ou Impar:");

        // VARIAVEL OP RECEBERA O VALOR QUE O USUARIO DIGITAR
        op = entrada.nextInt();

        // ESTRUTURA CONDICIONAL QUE VERIFICA SE O RESTO DA DIVISAO DO VALOR DE OP É ZERO
        if (op % 2 == 0){

            // SE SIM IMPRIME O VALOR DE OP E QUE ELE É PAR
            System.out.println(op + " e Par");

        }

        // ESTRUTURA CONDICIONAL QUE ACONTECE SE IF FOR FALSO ( SE NAO )
        else{

            // IMPRIME O VALOR DE OP E QUE ELE É PAR
            System.out.println(op + " e Impar");

        }

    }

}
