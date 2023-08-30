package Viagem;

import Viagem.Viagem;

public class RelatorioViagem extends Viagem {


    private int codigoViagem;
    private String tarefa;
    private double horaChegada;
    private double horaSaida;

    public RelatorioViagem(){

    }
    public RelatorioViagem(int codigoViagem, String tarefa, double horaChegada, double horaSaida) {
        this.codigoViagem = codigoViagem;
        this.tarefa = tarefa;
        this.horaChegada = horaChegada;
        this.horaSaida = horaSaida;
    }

    public int getCodigoViagem() {
        return this.codigoViagem;
    }

    public void setCodigoViagem(int codigoViagem) {
        this.codigoViagem = codigoViagem;
    }

    public String getTarefa() {
        return this.tarefa;
    }

    public void setTarefa(String tarefa) {
        this.tarefa = tarefa;
    }

    public double getHoraChegada() {
        return this.horaChegada;
    }

    public void setHoraChegada(double horaChegada) {
        this.horaChegada = horaChegada;
    }

    public double getHoraSaida() {
        return this.horaSaida;
    }

    public void setHoraSaida(double horaSaida) {
        this.horaSaida = horaSaida;
    }
}
