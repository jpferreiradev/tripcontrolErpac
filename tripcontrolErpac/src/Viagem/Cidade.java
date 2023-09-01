package Viagem;

import Fucionarios.Dominio;

public class Cidade implements DominioDois  {

    private String nomeCidade;
    private String estado;

    Cidade(){

    }

    Cidade(String nomeCidade,String estado){
        this.nomeCidade = nomeCidade;
        this.estado = estado;
    }

    public String getNomeCidade(){
        return this.nomeCidade;
    }
    public void setNomeCidade(String nomeCidade){
        this.nomeCidade = nomeCidade;
    }

    public String getEstado(){
        return this.estado;
    }
    public void setEstado(String estado){
        this.nomeCidade = nomeCidade;
    }

    @Override
    public void listarAtivo() {

    }

    @Override
    public void listarInativo() {

    }
}
