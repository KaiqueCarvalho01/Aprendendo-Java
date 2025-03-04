package NivelIntermediario;
/*
* Começando a usar classes e objetos
* 
*/

public class Main {
    public static void main(String[] args) {
        //Criar o ninja Naruto
        Ninja Naruto = new Ninja(); //Naruto é um Objeto
        Naruto.nome = "Naruto";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";

        //Criar o ninja Sasuke = Sasuke é um Objeto
        
        //Chamando classe Ninja
        Ninja Sasuke = new Ninja(); //Instanciar a classe Ninja

        Sasuke.nome = "Sasuke";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Folha";

        //Aplicando metodos ao meu objeto
        Sasuke.SharinganAtivado();
        String chamandoMetodo = Sasuke.euSouUmNinja(); //Chamando o método euSouUmNinja, é necessário armazenar em uma variável
        System.out.println(chamandoMetodo);


        int quantoTempoFalta = Sasuke.anosParaSeTronarHokage(20);
        System.out.println("Faltam " + quantoTempoFalta + " anos para se tornar Hokage");

    }
}