package javaapplication2;

public class Semana4 {

    //  METODO INICIAL DE TODO PROGRAMA EM JAVA
    public static void main(String[] args){

        // DEFININDO UMA VARIAVEL INTEIRA
        int i;

        // CRIANDO UM VETOR COM 5 ESPACOS
        int vet[] = new int[5];

        // LACO DE REPETICAO FOR
        for (i = 0; i < 5; i++){

            // PREENCHENDO O VETOR COM O VALOR DE I MULTIPLICADO POR 2
            vet[i] = i*2;

        }

        // LACO DE REPETICAO FOR
        for (i = 0; i < 5; i++){

            // MOSTRANDO TODOS O VALORES DENTRO DOS VETORES
            System.out.println("vet[ "+i+" ]= "+vet[i]);

        }

    }

}
