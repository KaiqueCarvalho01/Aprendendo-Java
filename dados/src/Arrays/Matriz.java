package Arrays;

public class Matriz {
    public static void main(String[] args) {
        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Folha";    //Linha 0    
        ninjasEAldeias[0][1] = "Naruto";   //Coluna 0    
        ninjasEAldeias[0][2] = "Sasuke"; 
        
        ninjasEAldeias[1][0] = "Nevoa";   //Linha 1
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku"; //Coluna 2

        ninjasEAldeias[2][0] = "Deserto";  //Linha 2
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeias.length; i++) {
            System.out.println(ninjasEAldeias[i][0] + " - " + ninjasEAldeias[i][1] + " - " + ninjasEAldeias[i][2]); 
        }

        String[][] matriz = new String[3][3];
        matriz[0][0] = "1";
        matriz[0][1] = "2";
        matriz[0][2] = "3";
        matriz[1][0] = "4";
        matriz[1][1] = "5";
        matriz[1][2] = "6";
        matriz[2][0] = "7";
        matriz[2][1] = "8";
        matriz[2][2] = "9";

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

    }
}
