package Viagem;

import javax.crypto.Cipher;

public class Cliente {

    private int cnpj;
    private boolean ativo;
    private long razaoSocial;
    private String endereco;
    private String estado;
    private String cidade;
    private String email;

    Cliente(){

    }

    Cliente(int cnpj,boolean ativo,long razaoSocial,String estado, String cidade, String email){
        this.cnpj = cnpj;
        this.ativo = ativo;
        this.razaoSocial = razaoSocial;
        this.estado = estado;
        this.cidade = cidade;
        this.estado = email;
    }

    public int getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public boolean isAtivo() {
        return this.ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public long getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(long razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
