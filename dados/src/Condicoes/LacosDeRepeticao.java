package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
     /*
     * Repetir um bloco de código infinitamente ou até que uma condição seja atendida
     * WHILE = FOR
     */

     // WHILE
     // while (condição) {bloco de código}

     int numeroDeClones = 30;
     int numeroMaxClones = 40;

     while (numeroDeClones <= numeroMaxClones) {
        System.out.println("O Naruto fez um clone das sombras " + numeroDeClones);
        numeroDeClones++; // Incremento. Acontece a cada repetição
     }

     //FOR
     // for (inicialização; condição; incremento) {bloco de código}

     for (int i = 30; i <= numeroMaxClones; i++) {
        System.out.println("O Naruto está se clonando e já se clonou " + i);
        i++; // Incremento. Acontece a cada repetição
     }

    }
}
