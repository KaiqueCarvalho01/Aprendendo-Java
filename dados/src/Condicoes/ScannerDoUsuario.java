package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
        * Scanner é uma classe do pacote java.util que permite a leitura de dados do usuário
        * Objetivo: O usuario vai criar um ninja e vamos valida os dados
        */

        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o nome do ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();

        System.out.println("Digite a idade do ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();

        System.out.println("Nome do Ninja: " + nomeNinja + "\nIdade: " + idadeNinja);


        if(idadeNinja > 15){
            System.out.println("Ninja adulto");
        } else {
            System.out.println("Ninja criança");
        }

        caixaDeTexto.close(); //Fechar a caixa de texto (scanner) para liberar recursos
    }
}
