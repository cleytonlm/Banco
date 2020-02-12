package ExercicioBanco;

public class Corrente extends Conta {

    private double saldo;
    private Cliente Cliente;
    private double cheque;

    public Corrente(double saldo, Cliente Cliente) {
        this.saldo = saldo;
        this.Cliente = Cliente;
    }

    public void depositarCheque (double valorDocheque ,String banco ,String dataPagamento) {
        this.setSaldo(getSaldo()+valorDocheque);
    }
    

    public void saque(double saque) {

        this.cheque = 1000 + saldo;

        if (saque > cheque) {
            System.out.println("Voce nao tem valor para saque");
        } else if (saque > saldo) {
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso aproveitando seu cheque especial");


        } else
            this.saldo -= saque;
        System.out.println("Saque realizado com sucesso Seu novo saldo é ");
    }




                    public double getSaldo() {
                        return saldo;
    }

                    public Cliente getCliente() {
                        return Cliente;
    }

                    public double getCheque() {
                        return cheque;
    }
    }
