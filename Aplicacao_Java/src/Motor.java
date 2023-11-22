public class Motor {

    private Integer qntPist = 0;
    private Integer potencia = 0;


    public Motor(Integer qntPist, Integer potencia) {
        this.qntPist = qntPist;
        this.potencia = potencia;
    }


    public Integer getQntPist() {
        return this.qntPist;
    }

    public void setQntPist(Integer qntPist) {
        this.qntPist = qntPist;
    }

    public Integer getPotencia() {
        return this.potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }
    

}
