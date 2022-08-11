package javaapplication2;

// IMPORTANDO O PACOTE QUE NOS PERMITE CRIAR INPUTS E CAIXAS DE MENSAGEM
import javax.swing.JOptionPane;

public class Ex002 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // CRIANDO UMA CAIXA DE MENSAGEM PARA FALAR AO USUARIO O PROPOSITO DO PROGRAMA
        JOptionPane.showMessageDialog(null,"Ola Vamo calcular sua media");

        // CRIANDO UMA VARIAVEL DOUBLE (1.66 8.88) VAZIA
        double num1;

        // CRIANDO UMA VARIAVEL DOUBLE ( 5.99 10.55) VAZIA
        double num2;

        // PEDINDO PARA O USUARIO INSERIR SUA PRIMEIRA NOTA
        num1 = Double.parseDouble(JOptionPane.showInputDialog(null,"Qual Sua Primeira Nota? "));

        // PEDINDO PARA O USUARIO INSERIR SUA SEGUNDA NOTA
        num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual Sua Segunda Nota? "));

        // FAZENDO O CALCULO DA MEDIA COM OS VALORES RECEBIDOS
        double med = (num1 + num2) / 2;

        // MOSTRANDO A MEDIA DO USUARIO NA TELA
        JOptionPane.showMessageDialog(null, "Sua media é: " + med);

    }

}
