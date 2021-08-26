package aula14;

public class Garfanhoto extends Pessoa{
    private String login;
    private int totalAssistido;

    public Garfanhoto(String nome, int idade, String sexo,String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totalAssistido = 0;
    }


    public void viuMaisUma(){
        this.totalAssistido ++;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override
    public String toString() {
        return "Garfanhoto{" +this.getNome()+ super.toString()+
                "login='" + login + '\'' +
                ", totalAssistido=" + totalAssistido +
                '}';
    }
}
