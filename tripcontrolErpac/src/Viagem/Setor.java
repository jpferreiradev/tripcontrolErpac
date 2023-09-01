package Viagem;

import Fucionarios.Dominio;

public class Setor implements DominioDois{


    private int codigo;
    private String nome;

    Setor(){

    }
    Setor(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;

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

    @Override
    public void listarAtivo() {

    }

    @Override
    public void listarInativo() {

    }
}
