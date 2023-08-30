package Viagem;

import java.util.Date;

public class Viagem {

    private String data;
    private String destinoCNPJ;
    private String autor;
    private String agendadoCPF;
    private String motoristaCPF;
    private String situacao;

    public Viagem(String data, String destinoCNPJ, String autor, String agendadoCPF, String motoristaCPF, String situacao) {
        this.data = data;
        this.destinoCNPJ = destinoCNPJ;
        this.autor = autor;
        this.agendadoCPF = agendadoCPF;
        this.motoristaCPF = motoristaCPF;
        this.situacao = situacao;
    }

    public Viagem() {

    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDestinoCNPJ() {
        return this.destinoCNPJ;
    }

    public void setDestinoCNPJ(String destinoCNPJ) {
        this.destinoCNPJ = destinoCNPJ;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAgendadoCPF() {
        return this.agendadoCPF;
    }

    public void setAgendadoCPF(String agendadoCPF) {
        this.agendadoCPF = agendadoCPF;
    }

    public String getMotoristaCPF() {
        return this.motoristaCPF;
    }

    public void setMotoristaCPF(String motoristaCPF) {
        this.motoristaCPF = motoristaCPF;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
