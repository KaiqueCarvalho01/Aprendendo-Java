package Desafios.Herancas;

public class Main {
    public static void main(String[] args) {
        //Inicializar o Objeto
        Uchiha Itachi = new Uchiha();
        Itachi.nome = "Itachi Uchiha";
        Itachi.idade = 21;
        Itachi.missao = "Proteger a vila da folha";
        Itachi.nivelDificuldade = "S";
        Itachi.statusMissao = "Concluída";
        Itachi.mostrarInformacoes();
        Itachi.mostrarHabilidadeEspecial();

    }
}
