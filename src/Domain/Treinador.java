package Domain;

public class Treinador extends Utilizador{
    private String tipoUser;

    public Treinador(String nome, String senha, String tipoUser) {
        super(nome, senha);
        this.tipoUser = tipoUser;
    }
}
