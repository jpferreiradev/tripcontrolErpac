public class Cargo {

    private boolean ativo;
    private int codigo;
    private String nome;

    Cargo(boolean ativo, int codigo,String nome){
        this.ativo = ativo;
        this.codigo = codigo;
        this.nome = nome;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



}
