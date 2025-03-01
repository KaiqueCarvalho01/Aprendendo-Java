package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {
        
        /*
         * SwitchCases: Servem para gerar casos específicos
         * Objetivo: Pedir pro usuario escolher entre os Ninjas
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha um personagem: ");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        System.out.println("Escolha um personagem: ");
        int opcao = scanner.nextInt();

        switch(opcao){
            case 1:
                System.out.println("Você escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Personagem não encontrado");
        }


        scanner.close(); //Fechar a caixa de texto (scanner) para liberar recursos
    }
}
