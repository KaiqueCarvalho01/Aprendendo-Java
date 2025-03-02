package Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
         * Ternários são maneiras de reduzir o código, semelhante ao if e else
         * Variavel = (condição) ? valor_se_verdadeiro : valor_se_falso
         */

         short numeroDeMissoes = 11;
         String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
         System.out.println(nivel);

    }
    
}
