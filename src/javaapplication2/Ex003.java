package javaapplication2;

// IMPORTANDO O PACOTE QUE NOS PERMITE COLOCAR INPUTS E CAIXAS DE MENSAGENS
import javax.swing.JOptionPane;

public class Ex003 {

    // METODO INICIAL
    public static void main(String [] args){

        // DESCREVENDO O PROPOSITO DO PROGRAMA AO USUARIO
        JOptionPane.showMessageDialog(null,"Vamos Calcular Sua Media e Verificar Se Voce Esta Aprovado(a)");

        // DEFININDO 3 VARIAVEIS VAZIAS
        float num1;

        float num2;

        float num3;

        // PEDINDO TRES VALORES AO USUARIO QUE VAO SE ALOCAR NAS VARIAVEIS CRIADAS
        num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Qual Foi Sua Nota No Trabalho? "));

        num2 = Float.parseFloat(JOptionPane.showInputDialog( null,"Qual Foi Sua Nota Na Prova? "));

        num3 = Float.parseFloat(JOptionPane.showInputDialog( null,"Qual Foi Sua Nota De Participacao? "));

        // SOMANDO AS VARIAVEIS E CALCULANDO A MEDIA
        float med = (num1 + num2 + num3) / 3;

        // ESTRUTURA DE CONDICAO SE
        if (med < 3) {

            // MENSAGEM MOSTRANDO A MEDIA DO USUARIO
            JOptionPane.showMessageDialog(null, "Sua media foi " + med);

            // MENSAGEM MOSTRANDO QUE ELE ESTA REPROVADO
            JOptionPane.showMessageDialog(null, "Voce Esta Reprovado");
        }

        // ESTRUTURA DE CONDICAO SENAO
        else

            // ESTRUTURA DE CONDICAO SE
            if ( med < 6){

                // MENSAGEM MOSTRANDO A MEDIA DO USUARIO
                JOptionPane.showMessageDialog(null, "Sua Media foi: " + med);

                // MENSAGEM MOSTRANDO QUE O USUARIO ESTA EM RECUPERACAO
                JOptionPane.showMessageDialog(null, "Voce esta em Recuperacao");

            }

            // ESTRUTURA DE CONDICAO SE
            if (med > 6) {

                // MOSTRANDO A MEDIA DO USUARIO
                JOptionPane.showMessageDialog(null, "Sua Media Foi: " + med);

                // MENSAGEM MOSTRANDO QUE ELE FOI APROVADO
                JOptionPane.showMessageDialog(null, "Voce esta aprovado(a) Meu Parabens!!!");

            }


            }


}
