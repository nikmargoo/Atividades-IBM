package projetoestante;
public class Leitor extends Pessoa {
    private String login;
    private int totLidos;

    public Leitor(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totLidos = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotLidos() {
        return totLidos;
    }

    public void setTotLidos(int totLidos) {
        this.totLidos = totLidos;
    }

    @Override
    public String toString() {
        return "Leitor{"+ super.toString() + "\nlogin=" + login + ", totLidos=" + totLidos + '}';
    }
    
    

}
