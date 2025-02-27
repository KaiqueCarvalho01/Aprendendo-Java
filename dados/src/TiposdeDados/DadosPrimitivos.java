package TiposdeDados;

public class DadosPrimitivos {
    public static void main(String[] args) {
        // Tipos de dados primitivos
        // Tipos numéricos inteiros
        byte numByte = 127; // 8 bits
        short numShort = 32767; // 16 bits
        int numInt = 2147483647; // 32 bits
        long numLong = 9223372036854775807L; // 64 bits

        // Tipos numéricos reais
        float numFloat = 3.4028235E38F; // 32 bits
        double numDouble = 1.7976931348623157E308; // 64 bits

        // Tipo caractere
        char caractere = 'A'; // 16 bits

        // Tipo booleano
        boolean verdadeiro = true; // 1 bit
        boolean falso = false; // 1 bit

        // Exibindo os valores
        System.out.println("byte: " + numByte);
        System.out.println("short: " + numShort);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        System.out.println("float: " + numFloat);
        System.out.println("double: " + numDouble);
        System.out.println("char: " + caractere);
        System.out.println("boolean verdadeiro: " + verdadeiro);
        System.out.println("boolean falso: " + falso);
    }
}
