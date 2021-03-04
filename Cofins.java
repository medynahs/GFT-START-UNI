public class Cofins implements Imposto {
    private double valor;
    public  Cofins(double valor){
        this.valor = valor;
    }
    public double calculaImposto(){
        if (valor>12000){
            return (this.valor*4)/100;
        }
        else{
            return this.valor;
        }


    }
}
