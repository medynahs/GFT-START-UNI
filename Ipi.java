public class Ipi implements Imposto{
    private double valor;
    public  Ipi(double valor){
        this.valor = valor;
    }

    public double calculaImposto() {
        if (valor<20000){
            return (this.valor*7)/100;
        }
        else{
            return (this.valor*19)/100;
        }
    }
    

}   