package Domain;

public class Utilizador {

    private String nome;
    private String senha;

    public Utilizador(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
}
