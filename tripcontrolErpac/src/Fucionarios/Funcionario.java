package Fucionarios;

import Viagem.DominioDois;

public class Funcionario implements Dominio  {


    private boolean ativo;
    private String cpf;
    private String nome;
    private String endereco;
    private String email;
    private String cargo;
    private String setor;

    Funcionario() {

    }

    public Funcionario(boolean ativo, String cpf, String nome, String enderero, String email, String cargo, String setor) {
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

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
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

    @Override
    public void cadastrar() {

    }

    @Override
    public void listar() {

    }

    @Override
    public void alterar() {

    }

    @Override
    public void remover() {

    }

    @Override
    public String toString() {

        String s = " \nAtivo: " + ativo;
                s += " \nCPF: " + cpf;
                s += " \nNome:" + nome;
                s += " \nEndereço :" + endereco;
                s += " \nEmail: " + email;
                s += " \nCargo: " + cargo;
                s += " \nSetor: " + setor;
        return s;
    }
}
