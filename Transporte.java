public abstract class Transporte {
    private double carga;
    private int distancia;


    public Transporte(double carga){
        setCarga(carga);

    } 

    public double getCarga(){
        return carga;
    }

    public void setCarga(double carga){
        this.carga = carga;
    }
    public int calculaFrete(int distancia,double carga){
        this.carga = carga;
        this.distancia = distancia;
        return this.distancia;
        
    }
}
