package classes;

public class user {

    String nome;
    String email;


    public boolean equals(Object objeto) {
       user outro = (user)objeto;

          return outro.nome.equalsIgnoreCase(this.nome) && outro.email.equalsIgnoreCase(this.email);
    }


    public int hashCode() {
        return this.nome.length();
    }


}
