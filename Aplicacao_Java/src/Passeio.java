final public class Passeio extends Veiculo{

    private Integer qntPassageiros;

    public Passeio(String placa, String marca, String modelo, String cor, Float velocMax, Integer qntRodas,
            Motor motor, Integer qntPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qntRodas, motor);
        this.qntPassageiros = qntPassageiros;
    }

    @Override
    public Float calcVel(Float velMax) {
        return velMax * 100000 / 3600;
    }


    public Integer getQntPassageiros() {
        return this.qntPassageiros;
    }

    public void setQntPassageiros(Integer qntPassageiros) {
        this.qntPassageiros = qntPassageiros;
    }
    
    
}
