package ExercicioBanco;

public class Corrente extends Conta {
    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public double getCheque() {
        return cheque;
    }

    private double saldo;
    private Cliente Cliente;
    private double cheque;

    public Corrente(double saldo, Cliente Cliente) {
        this.saldo= saldo;
        this.Cliente=Cliente;

    }

    public void recolherjuros(double dias) {
        dias = saldo + (saldo*1.2/100);
        this.saldo += dias;
    }

    public void deposito(double dinheiro) {
        if (dinheiro > 0) {
            this.saldo += dinheiro;
            System.out.println("Deposito realizado com sucesso" + saldo);
        } else {
            System.out.println("valor invalido para deposito !");
        }
    }

    public void saque(double saque) {

            this.cheque = 1000 + saldo;

            if (saque > cheque) {
            System.out.println("Voce nao tem valor para saque , E nao tem limite disponivel");

                if (saque > saldo) {
                    this.saldo -= saque;
                    System.out.println("Saque realizado com sucesso aproveitando seu cheque especial");
                }else
                    this.saldo -= saque;
                System.out.println("Saque realizado com sucesso Seu novo saldo é " + saldo);
            }

        }
    }
