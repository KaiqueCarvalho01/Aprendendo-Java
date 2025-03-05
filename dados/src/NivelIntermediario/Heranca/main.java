package NivelIntermediario.Heranca;

public class main {
    public static void main(String[] args) {
        //Objeto 1
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto";
        Naruto.idade = 17;
        Naruto.aldeia = "Aldeia da Folha";
        Naruto.ModoKyuubi();

        //Objeto 2
        Uchiha Sasuke = new Uchiha(); //Instanciar a classe Uchiha. 
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Folha";
        Sasuke.SharinganAtivado();

        //Objeto 3
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura";
        Sakura.idade = 17;
        Sakura.aldeia = "Folha";
        Sakura.AtivarCura();

        //Objeto 4
        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.idade = 17;
        Hinata.aldeia = "Folha";
        Hinata.Byakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto";
        Boruto.idade = 12;
        Boruto.aldeia = "Folha";
        Boruto.Byakugan();
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();

    }
}
