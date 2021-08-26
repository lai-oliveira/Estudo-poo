package banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public void estadoAtual(){
        System.out.println("-----------------------------------");
        System.out.println("Conta" + this.getNumConta());
        System.out.println("Tipo" + this.getTipo());
        System.out.println("Dono" + this.getDono());
        System.out.println("Saldo" + this.getSaldo());
        System.out.println("Status" + this.getStatus());
    }
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

  public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);

        }
        System.out.println("Conta aberta com sucesso");
    }

    void fercharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Precisa sacar valor");
        } else if (this.getSaldo() < 0) {
            System.out.println("Desculpe a conta não poderar ser fechada");
        } else {
            System.out.println("A conta pode ser fechada");
        }
    }

    void depositar(float v) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta:" + getDono());
        } else {
            System.out.println("Conta inesistente");
        }

    }


    void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado em conta:" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente para Saque");
            }
        } else {
            System.out.println("Impossivel sacar Saque");
        }

    }

    void pagMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo()== "CP"){
            v = 20;

        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Seu pagamento de manutenção foi pago com sucesso" + getDono());
        }else{
            System.out.println("Conta não existe !");
        }
    }
}