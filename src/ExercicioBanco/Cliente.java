package ExercicioBanco;

public class Cliente {
    private int numcliente;
    private String nome;
    private String cpf;
    private String rg;

    public Cliente(int numcliente , String nome, String cpf ,String rg) {
        this.numcliente = numcliente;
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;

    }

    public int getNumcliente() {
        return numcliente;
    }

    public void setNumcliente(int numcliente) {
        this.numcliente = numcliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
}