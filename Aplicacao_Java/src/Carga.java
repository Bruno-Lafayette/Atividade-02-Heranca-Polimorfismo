final public class Carga extends Veiculo {

    private Integer cargaMax;
    private Integer tara;
    
    public Carga(String placa, String marca, String modelo, String cor, Float velocMax, Integer qntRodas, Motor motor, Integer cargaMax, Integer tara) {
        super(placa, marca, modelo, cor, velocMax, qntRodas, motor);
        this.tara = tara;
        this.cargaMax = cargaMax;
    }
  
    public Integer getCargaMax() {
        return this.cargaMax;
    }

    public void setCargaMax(Integer cargaMax) {
        this.cargaMax = cargaMax;
    }

    public Integer getTara() {
        return this.tara;
    }

    public void setTara(Integer tara) {
        this.tara = tara;
    }

    @Override
    public Float calcVel(Float velMax) {
        return velMax * 1000 / 3600;
    }

}
