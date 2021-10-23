package CreateFactory;

import ConcretProduct.Aviao;
import Creator.TransporteFactory;
import Product.Transporte;

public class AviaoFactory extends TransporteFactory {

    private Double _tempoDeViagem;
    private Double _preco;

    public AviaoFactory(Double tempoDeViagem, Double preco) {
        this._tempoDeViagem = tempoDeViagem;
        this._preco = preco;
    }

    @Override
    public Transporte getTransporte() {
        return new Aviao(_tempoDeViagem,_preco);
    }
}
