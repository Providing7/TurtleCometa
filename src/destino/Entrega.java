package destino;
public class Entrega {
    private String remetente;
    private String destinatario;
    private String destInicial;
    private String destFinal;
    private String datEntrega;
    
    public String getRemetente() {
        return remetente;
    }
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }
    public String getDestinatario() {
        return destinatario;
    }
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    public String getDestInicial() {
        return destInicial;
    }
    public void setDestInicial(String destInicial) {
        this.destInicial = destInicial;
    }
    public String getDestFinal() {
        return destFinal;
    }
    public void setDestFinal(String destFinal) {
        this.destFinal = destFinal;
    }
    public String getDataEntrega() {
        return datEntrega;
    }
    public void setDataEntrega(String dataEntrega) {
        this.datEntrega = dataEntrega;
    }
    public String toString() {
        return "Entrega [remetente=" + remetente + ", destinatario=" + destinatario + ", destInicial=" + destInicial
                + ", destFinal=" + destFinal + ", dataEntrega=" + datEntrega + "]";
    }
}
