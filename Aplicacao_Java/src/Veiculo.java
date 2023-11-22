
public abstract class Veiculo {

    private String placa = " ";
    private String marca = " ";
    private String modelo = " ";
    private String cor = " ";
    private Float velocMax = 0F;
    private Integer qntRodas = 0;
    private Motor motor;


    public Veiculo(String placa, String marca, String modelo, String cor, Float velocMax, Integer qntRodas, Motor motor) {

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.velocMax = velocMax;
        this.qntRodas = qntRodas;
        this.motor = motor;
    }


    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Float getVelocMax() {
        return this.velocMax;
    }

    public void setVelocMax(Float velocMax) {
        this.velocMax = velocMax;
    }

    public Integer getQntRodas() {
        return this.qntRodas;
    }

    public void setQntRodas(Integer qntRodas) {
        this.qntRodas = qntRodas;
    }

    public Motor getMotor() {
        return this.motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    
    public abstract Float calcVel(Float vel);
    
}
