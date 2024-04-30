package classes;

public class Data {

    int dia;
    int mes;
    int ano;

    Data(int diav1, int mesv1, int anov1) {
        this.dia = diav1;
        this.mes = mesv1;
        this.ano = anov1;
    }

    String obterData () {

    return String.format("%d/%d/%d", dia, mes, ano);

     }

}
