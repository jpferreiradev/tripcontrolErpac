public class Motorista extends Funcionario {

    private boolean ativo;
    private long cpf;

    public Motorista(boolean ativo, long cpf, String nome, String enderero, String email, String cargo, String setor, boolean ativo1, long cpf1) {
        super(ativo, cpf, nome, enderero, email, cargo, setor);
        this.ativo = ativo;
        this.cpf = cpf;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}
