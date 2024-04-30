package classes;

public class produtoTeste {

    public static void main(String[] args) {

        produto p1 = new produto("notebook");
         //p1.nome = "notebook";
         p1.preco =  4356.89;
         p1.desconto = 0.25;

        var p2 = new produto("caneta preta");
        //p2.nome = "caneta preta";
        p2.preco = 12.56;
        p2.desconto = 0.29;

        System.out.println(p2.nome);
    }
}
