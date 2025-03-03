package Arrays;

public class Array {
    public static void main(String[] args) {
        //Arrays são tipo referência
        //Arrays são objetos de memória
        String[] ninja = new String [3]; // Array de 3 elementos
        ninja[0] = "Naruto";
        ninja[1] = "Sasuke";
        ninja[2] = "Sakura";

        System.out.println(ninja[2]); // Sakura

        // Percorrendo o array
        for (int i = 0; i < ninja.length; i++){
            System.out.println(ninja[i]);
        }


    }
}
