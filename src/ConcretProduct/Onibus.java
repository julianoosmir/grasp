package ConcretProduct;

import Product.Transporte;

public class Onibus extends Transporte {
    public Onibus(Double tempoViagem, Double preco) {
        this.tipo = "terrestre";
        this.tempoDeViagem = tempoViagem;
        this.preco = preco;
    }
}
