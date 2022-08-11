package javaapplication2;

// IMPORTANDO O PACOTO QUE NOS PERMITE CRIAR INPUTS E CAIXAS DE MENSAGENS
import javax.swing.JOptionPane;

public class Ex004 {

    // METODO INICIAL
    public static void main(String[] args){

        // MENSAGEM DIZENDO O PROPOSITO DO PROGRAMA
        JOptionPane.showMessageDialog(null,"Ola Vamos Calcular Seu Novo Salario: ");

        // VARIAVEL SAL VAZIA
        float sal;

        // PEDINDO PARA O USUARIO INFORMAR O SEU SALARIO
        sal = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite Seu Salario: "));

        // DEFININDO UMA VARIAVEL BONI = 0
        float bon = 0;

        // DEFININDO UMA VARIAVEL VAL = 0
        float val = 0;

        // SE O SALARIO FOR MENOR OU IGUAL A MIL BONI = SAL * 5/100
        if (sal <= 1000){
            bon = sal * 5/100;
        }

        // SENAO
        else

            // SE O SALARIO FOR MENOR QUE DOIS MIL BONI = SAL * 12/100
            if (sal < 2000){

                bon = sal * 12/100;

            }

            // SENAO BONI = 0
            else
                bon = 0;


        // SE O SALARIO FOR MENOR OU IGUAL A MIL E QUINHENTOS VAL = 150
        if (sal <= 1500){

            val = 150;

        }

        // SENAO VAL = 100
        else
            val = 100;

        // CALCULO DO NOVO SALARIO
        float newsal = sal + bon + val;

        // INFORMANDO O NOVO SALARIO PARA O USUARIO
        JOptionPane.showMessageDialog(null, "Seu novo Salario é " + newsal);

    }
}
