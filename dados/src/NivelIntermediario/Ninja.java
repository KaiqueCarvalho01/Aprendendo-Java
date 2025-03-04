package NivelIntermediario;

//Classe é o molde do que se quer construir

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Criar um método publico personalizado
    //Método Void não retorna valor nenhum
    public void SharinganAtivado(){
        System.out.println("O Sharingan foi ativado");
    }

    //Método string deve retornar uma string
    public String euSouUmNinja(){
        return "Eu sou um ninja";
    }

    //Metodo INT vai ter que retornar um valor inteiro
    public int anosParaSeTronarHokage(int idadeMin){
        return idadeMin - idade;
    }
}
