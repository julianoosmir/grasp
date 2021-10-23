package ConcretProduct;
import Product.Transporte;

public class Barco extends Transporte {
    public Barco(Double tempoViagem, Double preco) {
        this.tipo = "naval";
        this.tempoDeViagem = tempoViagem;
        this.preco = preco;
    }


}
