public class Funcionario {


    private boolean ativo;
    private long cpf;
    private String nome;
    private String endereco;
    private String email;
    private String cargo;
    private String setor;

    Funcionario(boolean ativo, long cpf, String nome, String enderero,String email,String cargo,String setor){
        this.ativo = ativo;
        this.cpf = cpf;
        this.nome = nome;
        this.endereco = enderero;
        this.email = email;
        this.cargo = cargo;
        this.setor = setor;
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

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return this.cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
