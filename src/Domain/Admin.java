package Domain;

public class Admin extends Utilizador{
    private String tipoUser;

    public Admin(String nome, String senha, String tipoUser) {
        super(nome, senha);
        this.tipoUser = tipoUser;
    }
}
