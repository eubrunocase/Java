package Desafios;

public class Pessoa {

    String nome;
    Double peso;


    public Pessoa (String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

     Pessoa p1 = new Pessoa ("Bruno", 94.0);
     Comida c1 = new Comida ("feijão", 0.300);
     Comida c2 = new Comida ("Arroz", 0.200);


public void comer (Comida c1, Comida c2) {
     Double pesoTotal;
     pesoTotal = p1.peso + c1.peso + c2.peso;
    }


}
