package classes;

import java.util.Objects;

public class user {

    String nome;
    String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        user user = (user) o;
        return Objects.equals(nome, user.nome) && Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
