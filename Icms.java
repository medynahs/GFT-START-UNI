public class Icms implements Imposto {
    private double valor;
    public  Icms(double valor){
        this.valor = valor;
    }
    public double calculaImposto() {
        return (this.valor*27)/100;
    }
}
