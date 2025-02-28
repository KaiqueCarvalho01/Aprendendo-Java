package Desafios;

/*
 * Crie um programa que represente três ninjas da Vila da Folha (Konoha) de "Naruto" e suas respectivas missões
 * Cada ninja tem um nome, idade e uma missão atribuída a ele, com o nome da missão, nível de dificuldade e status de conclusão
 */

public class desafio1 {
    public static void main(String[] args) {
        //Ninja 1
        String ninja1Nome = "Naruto Uzumaki";
        int ninja1Idade = 17;
        String ninja1Missao = "Resgate de Sasuke";
        char ninja1MissaoDificuldade = 'S';
        String ninja1MissaoConcluidaString = "Concluida";

        if(ninja1Idade < 15){
            if(ninja1MissaoDificuldade == 'C' || ninja1MissaoDificuldade == 'D'){
                ninja1MissaoConcluidaString = "Concluida";
            } else {
                ninja1MissaoConcluidaString = "Não foi concluida";
            } 
        } else {
                ninja1MissaoConcluidaString = "Concluida";
        }
        

        System.out.println("Ninja 1: " + ninja1Nome + " tem " + ninja1Idade + " anos e sua missão é " + ninja1Missao + " com dificuldade " + ninja1MissaoDificuldade + " e a missão foi concluída? " +  ninja1MissaoConcluidaString);

        //Ninja 2
        String ninja2Nome = "Sasuke Uchiha";
        int ninja2Idade = 17;
        String ninja2Missao = "Vingança contra Itachi";
        char ninja2MissaoDificuldade = 'S';
        String ninja2MissaoConcluidaString = "Concluida";

        if(ninja2Idade < 15){
            if(ninja2MissaoDificuldade == 'C' || ninja2MissaoDificuldade == 'D'){
                ninja2MissaoConcluidaString = "Concluida";
            } else {
                ninja2MissaoConcluidaString = "Não foi concluida";
            } 
        } else {
            ninja2MissaoConcluidaString = "Concluida";
        }
        
        System.out.println("Ninja 2: " + ninja2Nome + " tem " + ninja2Idade + " anos e sua missão é " + ninja2Missao + " com dificuldade " + ninja2MissaoDificuldade + " e a missão foi concluída? " + ninja2MissaoConcluidaString);


        //Ninja 3
        String ninja3Nome = "Sakura Haruno";
        int ninja3Idade = 17;
        String ninja3Missao = "Proteção de Naruto e Sasuke";
        char ninja3MissaoDificuldade = 'S';
        String ninja3MissaoConcluidaString = "Concluida";

        if(ninja3Idade < 15){
            if(ninja3MissaoDificuldade == 'C' || ninja3MissaoDificuldade == 'D'){
                ninja3MissaoConcluidaString = "Concluida";
            } else {
                ninja3MissaoConcluidaString = "Não foi concluida";
            } 
        } else {
            ninja3MissaoConcluidaString = "Concluida";
        }
        

        System.out.println("Ninja 3: " + ninja3Nome + " tem " + ninja3Idade + " anos e sua missão é " + ninja3Missao + " com dificuldade " + ninja3MissaoDificuldade + " e a missão foi concluída? " + ninja3MissaoConcluidaString);

    }
}
