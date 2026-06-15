package projeto.dominio;

public class Caminhao {
    private String placa;
    private String motorista;
    private String modelo;

    public Caminhao(String placa, String motorista, String modelo){
        this.placa = placa;
        this.motorista = motorista;
        this.modelo = modelo;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setMotorista(String motorista){
        this.motorista = motorista;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public String getPlaca(){
        return this.placa;
    }
    public String getMotorista(){
        return this.motorista;
    }
    public String getModelo(){
        return this.modelo;
    }

}
