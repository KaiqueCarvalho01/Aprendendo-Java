package Desafios;

import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
        /*
         * Gerenciar cadastro de ninjas da Vila da Folha. Sua missão é criar um sistema simples em java para cadastrar novos ninjas e listas todos os ninjas cadastrados
         */
        System.out.println("Desafio 2 - Cadastro de Ninjas");
        Scanner scanner = new Scanner(System.in);
        int maxNinjas = 5;
        String[] ninja = new String[maxNinjas];
        //Contador 
        int ninjasCadastrados = 0;
        int op = 0;

        while(op != 3){
            System.out.println("---Menu---");
            System.out.println("1 - Cadastrar Ninja");
            System.out.println("2 - Listar Ninjas");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            op = scanner.nextInt();

            //Limpar o buffer do teclado
            scanner.nextLine();

            switch(op){
                case 1:
                    if(ninjasCadastrados < maxNinjas){
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();
                        ninja[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso");
                    } else{
                        System.out.println("Cadastro de ninjas cheio");
                    }
                        /* 
                        System.out.println("Digite o nome do ninja: ");
                        String nomeNinja = scanner.nextLine();
                        for (int i = 0; i < ninja.length; i++) {
                            if(ninja[i] == null){
                                ninja[i] = nomeNinja;
                                break;
                            }else {
                                System.out.println("Cadastro de ninjas cheio");
                            }
                        } */
                break;
                
                case 2:
                for (int i = 0; i < ninja.length; i++) {
                    if(ninjasCadastrados == 0){
                        System.out.println("Nenhum ninja cadastrado");
                        break;
                    } else{
                        if(ninja[i] != null){
                            System.out.println("Ninja: " + ninja[i]);
                        }
                        
                    }
                    /*
                    if(ninja[i] != null){
                        System.out.println("Ninja: " + ninja[i]);
                    } */ 
                }
                break;

                case 3:
                    System.out.println("Saindo do sistema");
                    System.exit(0);
                break;
                default:
                    System.out.println("Opção inválida");
            }

        }

        scanner.close();
    }
}
