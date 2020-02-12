package ExercicioBanco;

public class main {

    public static void main(String[] args) {

        Cliente sabrina = new Cliente (1,"sabrina","4544564545","50366068");
        System.out.println("cpf antes");
        System.out.println(sabrina.getCpf());
        System.out.println("cpf depois");
        sabrina.setCpf("321069785");
        System.out.println(sabrina.getCpf());

        Corrente corrente = new Corrente(200,sabrina);
        corrente.saque(1000);



      /*  Conta cleyton = new Conta();
        cleyton.deposito(30);
        cleyton.saque(960);
        System.out.println(cleyton.getSaldo());

        Conta fabio = new Conta();

        cleyton.transferir(0, fabio);

        System.out.println(fabio.getSaldo ());

        Corrente beatriz = new Corrente();
        beatriz.deposito(90);
        beatriz.saque();
        System.out.println(beatriz.getSaldo());*/

    }
}

