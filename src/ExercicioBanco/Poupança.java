package ExercicioBanco;


public class Poupança extends Conta {
    private double saldo;
    private double juros;

    public void recolherjuros() {
        juros = saldo + (saldo * 1.2 / 100);
        this.saldo += juros;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }
}