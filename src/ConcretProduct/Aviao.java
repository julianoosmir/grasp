package ConcretProduct;

import Product.Transporte;

public class Aviao extends Transporte {
    public Aviao(Double tempoViagem, Double preco) {
        this.tipo = "aereo";
        this.tempoDeViagem = tempoViagem;
        this.preco = preco;
    }


}
