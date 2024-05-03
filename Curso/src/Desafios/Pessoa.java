package Desafios;

public class Pessoa {

    String nome;
    Double peso;


    public Pessoa (String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    void comer (Comida comida) {
        if (comida != null) {
            this.peso += comida.peso;
        }
    }

    String exibir () {
        return "Olá, sou o " + nome + " e eu peso " + peso + "KG.";
    }

}
