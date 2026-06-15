package projeto.dominio;

public class Vaga {
    private String nome;
    private boolean status;
    private Caminhao caminhaoEstacionado;

    public Vaga(String nome){
        this.nome = nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public Caminhao getCaminhaoEstacionado() {
        return caminhaoEstacionado;
    }

    public void setCaminhaoEstacionado(Caminhao caminhaoEstacionado) {
        this.caminhaoEstacionado = caminhaoEstacionado;
    }
}
