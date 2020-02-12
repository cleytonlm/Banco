package ExercicioBanco;

public class Poupança extends Conta {
        private double saldo;

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

        public void saque(double dinheiro) {
            if (dinheiro > saldo) {
                System.out.println("voce nao tem dinheiro");
            } else
                this.saldo -= dinheiro;
            System.out.println("Saque realizado com sucesso Seu novo saldo é " + saldo);
        }

    }
