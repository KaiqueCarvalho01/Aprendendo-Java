//Dados não primitivos são tipos de dados em que pode-se colocar métodos para fazer alterações na variavel sem que seja mudado seu escopo, ou seja, são objetos
package TiposdeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
        * Dados não primitivos: String, Array, Enum, Class
        */ 
        String nome = "Kaique";
        // Métodos para manipulação de strings. Utilização do ponto para acessar os métodos
        String nomeUpperCase = nome.toUpperCase(); // Método para deixar a string em maiúsculo
        System.out.println(nome); // Exibindo a string
        System.out.println("Esse texto está em CAPSLOCK: " + nomeUpperCase); // Exibindo a string em maiúsculo

        String cidade = "SÃO Paulo";
        String cidadeLowerCase = cidade.toLowerCase(); // Método para deixar a string em minúsculo
        System.out.println(cidade); // Exibindo a string
        System.out.println("Esse texto está em minúsculo: " + cidadeLowerCase); // Exibindo a string em minúsculo
    }
}
