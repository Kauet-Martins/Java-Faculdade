package javaapplication2;

// IMPORTANDO O PACOTE QUE NOS PERMITE CRIAR INPUTS E CAIXAS DE MENSAGENS
import javax.swing.JOptionPane;

public class Ex001 {

    // METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String[] args) {

        // CRIANDO UMA CAIXA DE MENSAGEM PARA O USUARIO ENTENDER O PROGRAMA
        JOptionPane.showMessageDialog(null, "Ola vamos calcular a area de um raio");

        // CRIANDO UMA CAIXA DE MENSAGEM PARA O USUARIO ENTENDER O PROGRAMA
        JOptionPane.showMessageDialog(null,"Sabendo que a Area de um circulo se da pela formula de 3,14 * 2R");

        // CRIANDO UMA VARIAVEL DOUBLE (4.55, 5.77) VAZIA
        double raio;

        // PEDINDO PARA O USUARIO DECLARAR O VALOR DE RAIO
        raio = Double.parseDouble(JOptionPane.showInputDialog("Qual o raio do circulo? "));

        // FAZENDO O CALCULO COM OS DADOS QUE O USUARIO ME FORNECEU
        double area = 3.14 * raio * raio;

        // MOSTRANDO PARA O USUARIO O VALOR DA AREA DO CIRCULO COM BASE NO VALOR QUE FOI RECEBIDO
        JOptionPane.showMessageDialog(null, "O valor da Area desse circulo é: " + area);

    }


}
