package Fucionarios;

import Viagem.DominioDois;

public class Motorista extends Funcionario implements DominioDois {

    private boolean ativo;
    private String cpf;

    public Motorista(boolean ativo, String cpf, String nome, String enderero, String email, String cargo, String setor, boolean ativo1, long cpf1) {
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

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void listarAtivo() {

    }

    @Override
    public void listarInativo() {

    }
}
