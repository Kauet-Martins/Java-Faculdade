package javaapplication2;

// IMPORTACAO QUE NOS PERMITE CRIAR INPUTS E CAIXAS DE MENSAGENS
import javax.swing.JOptionPane;

public class Semana2 {

    // METODO INICIAL
    public static void main(String[] args){

        // CRIANDO UMA VARIAVEL VAZIA DE NOME
        String nome;

        // CRIANDO UMA VARIAVEL VAZIA DE IDADE
        String idade;

        // CRIANDO UM INPUT QUE PERMITE O USUARIO ESCREVER SEU NOME
        nome = JOptionPane.showInputDialog( null, "Qual Seu Nome?:");

        // CRIANDO UM INPUT QUE PERMITE O USUARIO ESCREVER SUA IDADE
        idade = JOptionPane.showInputDialog(null, "Qual a Sua idade");

        // MOSTRANDO PARA O USUARIO UMA MENSAGEM COM O SEU NOME E SUA IDADE
        JOptionPane.showMessageDialog(null, "Hello "  + nome +  ", Sua idade é: " + idade );

    }

}
