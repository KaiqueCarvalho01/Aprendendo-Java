package Condicoes;

public class ifElse {
    public static void main(String[] args) {
        
        /*
         * IF e Else - Condições
         * Objetivo: Passar o ninja de nível de acordo com o número de missões	
        */

        String nome = "Naruto Uzumaki";
        String rank;

        int idade = 16;
        // Verificar se o Naruto é Hokage
        boolean hokage = false;
        short numeroDeMissoes = 14;

        //Se (condição) {faça isso}
        if(numeroDeMissoes > 10 && idade > 15){
            System.out.println(nome + " está pronto para passar de nível ");
        } else {
            System.out.println(nome + " não completou o número de missões necessárias para passar de nível");
        }

        if(numeroDeMissoes > 10 && idade > 15){
            System.out.println("Rank: Chunin");
        }else if(numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        }else {
            System.out.println("Rank: Genin");
        }


    }
}
