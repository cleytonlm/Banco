package ExercicioBanco;

public class Conta {
    private double saldo;
    private Cliente cliente;

    public void setSaldo(double saldo)

    {
        this.saldo = saldo;
    }

    public void deposito(double dinheiro) {
        if (dinheiro > 0) {
            this.saldo += dinheiro;
            System.out.println("Deposito realizado com sucesso"  +  saldo );
        }
        else {
            System.out.println("valor invalido para deposito !");
        }
    }

    public void saque(double dinheiro) {

        if (dinheiro > saldo) {
            System.out.println("voce nao tem dinheiro");
        } else
            this.saldo -= dinheiro;
        System.out.println("Saque realizado com sucesso Seu novo saldo é " + saldo);
    }

    public void transferir(double dinheiro, Conta contaDestino) {
        this.saque(dinheiro);
        contaDestino.deposito(dinheiro);
    }
    public double getSaldo() {
        return saldo;
    }


}

