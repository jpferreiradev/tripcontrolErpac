package Fucionarios;

import Viagem.DominioDois;

public class Tarefa implements DominioDois {

    private int codigo;
    private String nome;
    private String setor;

    public Tarefa(int codigo, String nome, String setor) {
        this.codigo = codigo;
        this.nome = nome;
        this.setor = setor;
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

    public String getSetor() {
        return this.setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    @Override
    public void listarAtivo() {

    }

    @Override
    public void listarInativo() {

    }
}
