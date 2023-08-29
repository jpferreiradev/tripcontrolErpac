import java.util.Date;

public class Viagem {

    private Date data;
    private int destinoCNPJ;
    private String autor;
    private int agendadoCPF;
    private int motoristaCPF;
    private String situacao;

    public Viagem(){

    }
     public Viagem(Date data, int destinoCNPJ, String autor, int agendadoCPF, int motoristaCPF, String situacao) {
        this.data = data;
        this.destinoCNPJ = destinoCNPJ;
        this.autor = autor;
        this.agendadoCPF = agendadoCPF;
        this.motoristaCPF = motoristaCPF;
        this.situacao = situacao;
    }

    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getDestinoCNPJ() {
        return this.destinoCNPJ;
    }

    public void setDestinoCNPJ(int destinoCNPJ) {
        this.destinoCNPJ = destinoCNPJ;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAgendadoCPF() {
        return this.agendadoCPF;
    }

    public void setAgendadoCPF(int agendadoCPF) {
        this.agendadoCPF = agendadoCPF;
    }

    public int getMotoristaCPF() {
        return this.motoristaCPF;
    }

    public void setMotoristaCPF(int motoristaCPF) {
        this.motoristaCPF = motoristaCPF;
    }

    public String getSituacao() {
        return this.situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
