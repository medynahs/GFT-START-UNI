public class Vagao extends Transporte {

    public int calculaFrete(int distancia){
        this.distancia = distancia;
        frete =  (0.07*pesoDaCarga) + (0.01*valorDaCarga)+ (0.50*distancia);
    
    }
}
