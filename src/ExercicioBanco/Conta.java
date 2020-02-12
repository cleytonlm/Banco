package ExercicioBanco;

public class Conta {
    private double saldo;
    private Cliente cliente;

    public Conta (){

}
    public Conta(double saldo,Cliente cliente) {
        this.saldo=saldo;
        this.cliente = cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
        this.cliente= cliente;
    }

    public void deposito(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Deposito realizado com sucesso" );
            System.out.println("Saldo Atual :"+ this.saldo);
        }
        else {
            System.out.println("valor invalido para deposito !");
        }
    }

    public void sacar(double valor) {

        if (valor > saldo) {
            System.out.println("voce nao tem dinheiro");
        } else
            this.saldo -= valor;
        System.out.println("Saque realizado com sucesso Seu novo saldo é " + saldo);
    }

    public void transferir(double dinheiro, Conta contaDestino) {
        this.sacar(dinheiro);
        contaDestino.deposito(dinheiro);
    }
    public double getSaldo() {
        return saldo;
    }



}

